package proj.dfjm.javapythoncompiler;

import proj.dfjm.javapythoncompiler.exceptions.CodeParsingException;
import proj.dfjm.javapythoncompiler.parser.JavaCodeParser;
import proj.dfjm.javapythoncompiler.parser.PythonCodeParser;

public class Main {
    // The 'main()' method contains a few examples of how to use our parser.
    public static void main(String[] args) {
        // First, let's hard code a few sample code snippets that will show how our parser works. They don't have
        // to be hard coded at all, and they can just come from the standard input or a file instead (as long as
        // they can be converted to strings in the end). Here's a brief comment on each of the defined strings:
        // - EXAMPLE1 is a valid code that follows the Java syntax and uses the Choice() function.
        // - EXAMPLE2 is also a valid code, but it follows the Python syntax and uses the Loop() function instead.
        // - EXAMPLE3 is an invalid (Java-compliant) code as the '`' character just before 'double' is missing.
        final String EXAMPLE1 = "Choice(`boolean a = true;`, `int b = 2;`, `c = 3.14;`, `String d = \"Hi there!\";`)";
        final String EXAMPLE2 = "Loop(`d = 1`, ``e < 20``, `f = 'A Python string'`, `g = 4.04`)";
        final String EXAMPLE3 = "Seq(`int x = 99;`, double y = 99.9;`)";

        // Second, since it is known that EXAMPLE1 is a Java-compliant code, let's use the static
        // 'parse()'method from the JavaCodeParser class and store the parsing result in a text string.
        String parsingResult1 = JavaCodeParser.parse(EXAMPLE1);

        // Third, print to the standard output both the code provided as
        // input and the resulting Java source code (for comparison purposes).
        System.out.println("---------- CODE PROVIDED AS INPUT ----------");
        System.out.println(EXAMPLE1);
        System.out.println("\n-------- RESULTING JAVA SOURCE CODE --------");
        System.out.println(parsingResult1);

        // Now let's do the same with EXAMPLE2. It is known it's a Python-compliant code this
        // time around, so let's use the static 'parse()' method from the PythonCodeParser
        // class instead, and store the parse result in a text string as in the previous example.
        String parsingResult2 = PythonCodeParser.parse(EXAMPLE2);

        // For comparison purposes, print to the standard output both the
        // code provided as input and the resulting Python source code.
        System.out.println("\n---------- CODE PROVIDED AS INPUT ----------");
        System.out.println(EXAMPLE2);
        System.out.println("\n-------- RESULTING PYTHON SOURCE CODE --------");
        System.out.println(parsingResult2);

        // As it is known, EXAMPLE3 is an invalid code that follows the Java syntax. For this reason, an attempt
        // to parse it will fail, and a CodeParsingException will be thrown. So let's surround it with a 'try'
        // block, and for simplicity's sake, don't read the parse result, as it wouldn't make sense anyway.
        try {
            JavaCodeParser.parse(EXAMPLE3);
        } catch (CodeParsingException e) {
            System.out.println("\nA CodeParsingException has been thrown while parsing EXAMPLE3 (as planned).");
            System.out.println("The exception message: \"" + e.getMessage() + "\".");
        }

        // For completeness' sake, there is also another exception that might be thrown by the parser,
        // which is IllegalArgumentException. As it is known, EXAMPLE1 is a code that follows the
        // Java syntax, so for demonstration purposes, let's deliberately parse it using the static
        // 'parse()' method from the PythonCodeParser class. Then let's catch the thrown exception.
        try {
            PythonCodeParser.parse(EXAMPLE1);
        } catch (IllegalArgumentException e) {
            System.out.println("\nAn IllegalArgumentException has been thrown while parsing EXAMPLE1 (as planned).");
            System.out.println("The exception message: \"" + e.getMessage() + "\".");
        }
    }
}
