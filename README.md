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

### Przykłady do testowania
Przykłady do testowania powyższej funkcjonalności

```text
Seq(`int a = 64;`, `double b = 12.8;`)
Seq(`a = 64`, `b = 12.8`)

Seq(Branch(``i < 2``, Seq(Branch(``j < 2``, `int f = 2;`, `int g = 2;`), BranchRe(`int h = 2;`, `int h1 = 2;`, `int h2 = 2;`)), `int b = 2;`), BranchRe(`int c = 2;`, `int d = 2;`, `int e = 2;`))
Seq(Branch(``i < 2``, `int a = 2;`, `int b = 2;`), BranchRe(`int c = 2;`, `int d = 2;`, `int e = 2;`))

Concur(`char a = 'c';`, `func();`, `boolean c = false;`)
Concur(`a = 'str'`, `func()`, `c != True`)

ConcurRe(`func();`, `boolean b = true;`, `char c = 'c';`)
ConcurRe(`func()`, `b == False`, `c = "str"`)

Cond(``a1 >= a2``, `b = 5;`, `c = 10;`, `int d = b * c;`)
Cond(``a < 2``, `b = 5`, `c = 10`, `d = b * c`)

Para(`int a = 1;`, `int q = 4;`, `int b = 1;`, `int c = 2;`)
Para(`a = 1`, `fun1`, `fun2`, `c = 2`)

Loop(`int a = true;`, ``a``, `int b = false;`, `int c = 2;`)
Loop(`a = 1`, ``a > b``, `b = 4`, `c = 2`)

Choice(`int p = 234;`, `int d = 344;`, `p == d;`, `int a = p + d;`)
Choice(`char cd = 'a';`, Repeat(`int a = 1;`, `char cda = 'b';`, ``ab < 2``, `int i = 5;`), `char cd = 'a';`, `char aa = 'b';`)
Choice(`p = 234`, `d = 344`, `p < d`, `a = p + d`)

SeqSeq(`int p = 234;`, `int d = 344;`, `p <= d;`)
SeqSeq(`p = 234`, `d = 344`, `p < d`)

Repeat(`int a = 1;`, Choice(`char cd = 'a';`, `char cda = 'b';`, `char cd = 'a';`, `char aa = 'b';`), ``ab < 2``, `int i = 5;`)
Repeat(`p = 234`, `d = 344`, ``p < d``, `a = p + d`)


Choice(
    `int p = 234;`,
    Choice(
        `int p = 234;`,
        `int d = 344;`,
        Seq(
            Branch(
                ``i < 2``,
                `int a = 2;`,
                `int b = 2;`),
            BranchRe(
                `int c = 2;`,
                `int d = 2;`,
                `int e = 2;`)
            ),
            `int a = p + d;`
        ),
    ~function1(a, "asd", c)~,
    `int a = p + d;`
)
String function(int a, int b, int c)
String function1(int a, int b, int y)

Choice(
    `int p = 234;`,
    ~function(1, 4, 'c')~,
    ~function1(a, "asd", c)~,
    `int a = p + d;`
)
String function(int a, int b, int c)
String function1(int a, int b, char y)
```

### Dokumentacja dla tych funkcji zrobiona
- [x] Seq
- [x] Branch + BranchRe
- [x] Concur
- [ ] ConcurRe
- [x] Cond
- [x] Para
- [x] Loop
- [x] Choice
- [x] SeqSeq
- [ ] Repeat

---

## Przykłady użycia funkcji
### Wszystkie obsługiwane funkcje
Nasz program obsługuje następujące funkcje:
- [Seq](#Seq)
- [Branch, BranchRe](#Branch-BranchRe)
- [Concur](#Concur)
- [ConcurRe](#ConcurRe)
- [Cond](#Cond)
- [Para](#Para)
- [Loop](#Loop)
- [Choice](#Choice)
- [SeqSeq](#SeqSeq)
- [Repeat](#Repeat)

### ==Seq==
#### JAVA
Kod na wejściu:
```java
Seq(`int a = 64;`, `double b = 12.8;`)
```

Kod na wyjściu:
```java
int a = 64;
double b = 12.8;
```

#### PYTHON
Kod na wejściu:
```python
Seq(`a = 64`, `b = 12.8`)
```

Kod na wyjściu:
```python
a = 64
b = 12.8
```

---

### ==Branch, BranchRe==
#### JAVA
Kod na wejściu:
```java
Seq(Branch(``4 > 5``, `int b = 5;`, `int a = 10;`), BranchRe(`int a = 1 + 2;`, `double b = 2.3;`, `boolean c = true;`))
```

Kod na wyjściu:
```java
if (4 > 5) {
    int b = 5;
    int a = 1 + 2;
} else {
    int a = 10;
    double b = 2.3;
}
boolean c = true;
```

#### PYTHON
Kod na wejściu:
```python
Seq(Branch(``4 > 5``, `a = 5`, `b = 10`), BranchRe(`c = 1`, `d = 2`, `e = 3`))
```

Kod na wyjściu:
```python
if 4 > 5:
    a = 5
    c = 1
else:
    b = 10
    d = 2
e = 3
```

---

### ==Concur==
#### JAVA
Kod na wejściu:
```java
Concur(`char a = 'c';`, `func();`, `boolean c = false;`)
```

Kod na wyjściu:
```java
char a = 'c';
Thread thread1 = new Thread(() -> {
    func();
});
Thread thread2 = new Thread(() -> {
    boolean c = false;
});
thread1.start();
thread2.start();
```
#### PYTHON
Kod na wejściu:
```python
Concur(`a = 'str'`, `func()`, `c != True`)
```

Kod na wyjściu:
```python
def thread_function1():
    func()

def thread_function2():
    c != True

a = 'str'
thread1 = threading.Thread(target=thread_function1)
thread1.start()
thread2 = threading.Thread(target=thread_function2)
thread2.start()
```

---

### ==ConcurRe==
#### JAVA
Kod na wejściu:
```java
ConcurRe(`func();`, `boolean b = true;`, `char c = 'c';`)
```

Kod na wyjściu:
```java
Thread thread1 = new Thread(() -> {
    boolean b = true;
});
Thread thread2 = new Thread(() -> {
    char c = 'c';
});
thread1.start();
thread2.start();
func();
```

#### PYTHON
Kod na wejściu:
```python
ConcurRe(`func()`, `b == False`, `c = "str"`)
```

Kod na wyjściu:
```python
def thread_function1():
    func()

def thread_function2():
    b == False

thread1 = threading.Thread(target=thread_function1)
thread1.start()
thread2 = threading.Thread(target=thread_function2)
thread2.start()
c = "str"
```

---

### ==Cond==
#### JAVA
Kod na wejściu:
```java
Cond(``a1 >= a2``, `b = 5;`, `c = 10;`, `int d = b * c;`)
```

Kod na wyjściu:
```java
if (a1 >= a2) {
    b = 5;
} else {
    c = 10;
}
int d = b * c;
```

#### PYTHON
Kod na wejściu:
```python
Cond(``a < 2``, `b = 5`, `c = 10`, `d = b * c`)
```

Kod na wyjściu:
```python
if a<2:
    b = 5
else:
    c = 10

d = b * c
```
---

### ==Para==
#### JAVA
Kod na wejściu:
```java
Para(`int a = 1;`, `int q = 4;`, `int b = 1;`, `int c = 2;`)
```

Kod na wyjściu:
```java
int a = 1;
Thread thread_1 = new Thread(() -> {
    int q = 4;
});
thread_1.start();
Thread thread_2 = new Thread(() -> {
    int b = 1;
});
thread_2.start();
int c = 2;
```

#### PYTHON
Kod na wejściu:
```python
Para(`a = 1`, `fun1`, `fun2`, `c = 2`)
```

Kod na wyjściu:
```python
a = 1
thread1 = threading.Thread(target=exec, args=(fun1))
thread1.start()
thread2 = threading.Thread(target=exec, args=(fun2))
thread2.start()
c = 2
```
---

### ==Loop==
#### JAVA
Kod na wejściu:
```java
Loop(`int a = true;`, ``a``, `int b = false;`, `int c = 2;`)
```

Kod na wyjściu:
```java
int a = true;
while (a) {
    int b = false;
}
int c = 2;
```

#### PYTHON
Kod na wejściu:
```python
Loop(`a = 1`, ``a > b``, `b = 4`, `c = 2`)
```

Kod na wyjściu:
```python
a = 1
while a>b:
    b = 4

c = 2
```

---

### ==Choice==
#### JAVA
Kod na wejściu:
```java
Choice(`int p = 234;`, `int d = 344;`, `p == d;`, `int a = p + d;`)
```

Kod na wyjściu:
```java
int p = 234;
if () {
    int d = 344;
} else {
    p == d;
}
int a = p + d;
```

#### PYTHON
Kod na wejściu:
```python
Choice(`p = 234`, `d = 344`, `p < d`, `a = p + d`)
```

Kod na wyjściu:
```python
p = 234
if /* implementation required */:
    d = 344
else:
    p < d

a = p + d
```

---

### ==SeqSeq==
#### JAVA
Kod na wejściu:
```java
SeqSeq(`int p = 234;`, `int d = 344;`, `p <= d;`)
```

Kod na wyjściu:
```java
int p = 234;
int d = 344;
p <= d;
```

#### PYTHON
Kod na wejściu:
```python
SeqSeq(`p = 234`, `d = 344`, `p < d`)
```

Kod na wyjściu:
```python
p = 234
d = 344
p < d
```

---

### ==Repeat==
#### JAVA
Kod na wejściu:
```java
Repeat(`int a = 1;`, Choice(`char cd = 'a';`, `char cda = 'b';`, `char cd = 'a';`, `char aa = 'b';`), ``ab < 2``, `int i = 5;`)
```

Kod na wyjściu:
```java
int a = 1;
do {
	char cd = 'a';
	if (/* implementation required */) {
		char cda = 'b';
	} else {
		char cd = 'a';
	}
	char aa = 'b';
} while (ab < 2);
int i = 5;
```

#### PYTHON
Kod na wejściu:
```python
Repeat(`p = 234`, `d = 344`, ``p < d``, `a = p + d`)
```

Kod na wyjściu:
```python
p = 234
while True:
    d = 344
if p<d:
    break
a = p + d
```

---

## Informacje dotyczące repozytorium
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
