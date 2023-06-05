# Projekt Kompilatory
### Przedstawienie zasady działania
Kod na wejściu:
```text
Loop(
    `int a = 5;`,
    ``b < 10``,
    ~func1(1, 2.0, "three")~,
    ~func2(true, 2.5, 'c')~
)

int func1(int p1, double p2, String p3)
String func2(boolean q1, double q2, char q3)
```

Kod na wyjściu (dla Javy):
```java
int a = 5;
while (b < 10) {
	func1(1, 2.0, "three");
}
func2(true, 2.5, 'c');

// - - - - - Function definitions - - - - -
int func1(int p1, double p2, String p3) {
	// Enter your function code here
}
String func2(boolean q1, double q2, char q3) {
	// Enter your function code here
}
```

### Instrukcja dodawania obługi dla nowych funkcji (na przykładzie funkcji `Choice`)
1. W pakiecie „nodes” stworzyć klasę danego węzła, która dziedziczy po klasie abstrakcyjnej `ASTNode`. Przykład:
```Java
public final class ChoiceASTNode extends ASTNode {
}
```
2. W konstruktorze tej nowo utworzonej klasy danego węzła wywołać konstruktor klasy nadrzędnej (tj. klasy `ASTNode`), podając mu jako argumenty liczbę dzieci, jaką ten nowo utworzony węzeł spodziewa się mieć (dla `Choice` będzie to 4), jak również przekazując dalej otrzymaną jako argument swojego konstruktora zmienną interfejsową `workflowPatternBuilder`. Przykład:
```java
public ChoiceASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
    super(4, workflowPatternBuilder);
}
```
3. Zaimplementować/nadpisać odziedziczoną z klasy ASTNode metodę abstrakcyjną `getWorkflowPatternBuilder(int indentationLevel)`, tak aby wywoływała ona odpowiadającą temu węzłowi metodę z interfejsu `IWorkflowPatternBuilder` (wraz z ewentualnymi metodami pomocniczymi typu `setIndentationLevel(indentationLevel)`), dorzucającą reprezentację danego węzła w formie kodu źródłowego do już istniejącego wcześniej kodu (dla `Choice` będzie to `appendChoice(firstInstruction, secondInstruction, thirdInstruction, fourthInstruction)`). Przykład:
```java
@Override
protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
    return workflowPatternBuilder
        .setIndentationLevel(indentationLevel)
        .appendChoice(
            children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
            children.get(1).getWorkflowPatternBuilder(indentationLevel + 1),
            children.get(2).getWorkflowPatternBuilder(indentationLevel + 1),
            children.get(3).getWorkflowPatternBuilder(indentationLevel + 1)
        );
}
```

4. W klasach `JavaWorkflowPatternBuilder` oraz `PythonWorkflowPatternBuilder` zaimplementować/nadpisać uprzednio wywołaną metodę (w przykładzie było to `IWorkflowPatternBuilder appendChoice(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction)`) pochodzącą z interfejsu `IWorkflowPatternBuilder`. Przykładowa implementacja może wyglądać na przykład tak (dla Javy):
```java
@Override
public IWorkflowPatternBuilder appendChoice(
    IWorkflowPatternBuilder firstInstruction,
    IWorkflowPatternBuilder secondInstruction,
    IWorkflowPatternBuilder thirdInstruction,
    IWorkflowPatternBuilder fourthInstruction
) {
    javaSourceCodeBuilder
        .appendFirstLine(firstInstruction.getSourceCode())
        .appendIndentation()
        .appendIf(null, secondInstruction.getSourceCode())
        .appendElse(thirdInstruction.getSourceCode())
        .appendLastLine(fourthInstruction.getSourceCode());

    return this;
}
```

5. (Opcjonalnie) Jeżeli w klasach `JavaSourceCodeBuilder` bądź `PythonSourceCodeBuilder` brakuje jakiejś metody generowania kodu, która okazała się być potrzebna przy imlementowaniu metody z poprzedniego kroku instrukcji, i dobrze byłoby ją mieć, to należy samemu dodać ją w klasie `JavaSourceCodeBuilder` bądź `PythonSourceCodeBuilder` (w zależności od tego, gdzie była ona potrzebna). Przykładowa implementacja brakującej metody (załóżmy, że brakowało nam metody tworzącej kod dla instrukcji `if`, którą nazwaliśmy np. `appendIf()`, by zachować spójność z istniejącymi już w tej klasie metodami) mogłaby wyglądać np. tak (dla Javy):
```java
public JavaSourceCodeBuilder appendIf(String condition, String... linesInside) {
    return append("if (")
        .append(condition != null ? condition : "/* implementation required */")
        .append(") {\n")
        .appendCodeBlockLines(linesInside)
        .appendIndentation()
        .append('}');
}

// Powyższa metoda zwróci referencję do obiektu klasy
// JavaSourceCodeBuilder zawierającego następujący kod źródłowy:
//
// if (condition) {
//     blok_instrukcji
// }
```

6. W klasie `RootASTNode` utworzyć i zaimplementowć metodę dodającą do drzewa składniowego jako dziecko obiekt naszej nowo utworzonej klasy danego węzła (dla `Choice` będzie to klasa `ChoiceASTNode` dodawana w metodzie `addChoiceASTNode()`). Przykład:
```java
public void addChoiceASTNode() {
    addAsChild(new ChoiceASTNode(workflowPatternBuilder.createNewInstance()));
}
```

7. Gdy wszystko jest już gotowe, to w klasach `JavaGrammarListener` oraz `PythonGrammarListener` należy zaimplementować/nadpisać odpowiednie metody listenera i w nich wywołać tę nowo utworzoną metodę z poprzedniego kroku instrukcji (dla funkcji `Choice` interesuje nas np. metoda listenera `enterJChoice(GrammarParser.JChoiceContext ctx)` oraz metoda `addChoiceASTNode()` z poprzedniego kroku).
```java
@Override
public void enterJChoice(GrammarParser.JChoiceContext ctx) {
    rootASTNode.addChoiceASTNode();
}
```
