# Projekt Kompilatory

## Wejście

Plik wejściowy to `input.txt`, znajdujący się w folderze `resources`

![](https://i.imgur.com/XTrIh7I.png)


## Używanie funckcji (przykład)

Kod na wejściu:

```
choice(
    `int p = 234;`,
    ~function(1, 4, 'c')~,
    ~function1(a, "asd", c)~,
    `int a = p + d;`
)
String function(int a, int b, int c)
String function1(int a, int b, char y)
```

Kod na wyjściu(java):

```java
int p = 234;
if () {
	function(1, 4, 'c');
} else {
	function1(a, "asd", c);
}
int a = p + d;

// - - - - Deklaracje funkcji - - - - -

String function(int a, int b, int c) {
	// Umieść tutaj swój kod
}
String function1(int a, int b, char y) {
	// Umieść tutaj swój kod
}
```

## Branch, BranchRe (przykłady)

### JAVA
Kod na wejściu:

```java
seq(branch(``4 > 5``, `int b = 5;`, `int a = 10;`), branchRe(`int a = 1 + 2;`, `double b = 2.3;`, `boolean c = true;`))
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

### PYTHON
Kod na wejściu:

```python
seq(branch(``4 > 5``, `a = 5`, `b = 10`), branchRe(`c = 1`, `d = 2`, `e = 3`))
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

## Ważne odnośnie gita

po zrobieniu pulla na branhcu `master` wykonać następujące komendy w konsoli

```
git rm -r --cached src/main/java/gen 
git rm -r --cached target/classes/gen
git rm -r --cached .idea 
git rm -r --cached target
```

## Sposób dodawania obługi dla nowych metod (na przykładzie metody `Choice`)

##### Narazie zrobić dla Javy, jak dodam obługę dla pythona to dam znać. Metoda działania będzie taka sama jak w przypadku javy

1) stworzyć klasę noda, która dziedziczy po GrammarNode
    ```Java
    public class ChoiceJavaNode extends GrammarNode {
    
    }
    ```
3) w konstruktorze podać `maxNumberOfChild` jako liczbę argumentów i nadpisujemy metode `getCode(tab number)`, tak żeby tworzyła kod naszej funckji
``` java
public class ChoiceJavaNode extends GrammarNode {
    public ChoiceJavaNode() {
        maxChildrenNumber = 4;
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder fourthArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        return codeStringBuilder.setCurrentTabsNumber(tabNumber)
                .appendFirstLine(firstArgument)
                .appendTabs().appendIf("", secondArgument)
                .appendElse(thirdArgument)
                .appendLastLine(fourthArgument);
        
        // Metoda zwróci JavaCodeBuilder zawierający następujący kod:
        // *firstArgument*
        // if () {
        //      *secondArgument*
        // } else {
        //     *thirdArgument*
        // }
        // *fourthArgument*
    }
}
```

4) w klasie `MainJavaNode`, dodać metodę, która dodaje do drzewa obiekt naszej klasy np.
```java
    public class MainJavaNode extends GrammarNode {
        ...
        ...
        ...
        public void addChoiceJavaNode() {
            this.addChild(new ChoiceJavaNode());
        }
    }
```
5) wywołać metodę, którą stworzyliśmy w listenerze do danej funckji
```java
    public class JavaGrammarListener extends GrammarBaseListener {
        
        private MainJavaNode grammarNode = new MainJavaNode();
        ...
        ...
        @Override
        public void enterJ_choice(GrammarParser.J_choiceContext ctx) {
            grammarNode.addChoiceJavaNode();
        }
    }
```
