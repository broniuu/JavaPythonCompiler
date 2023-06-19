package proj.dfjm.javapythoncompiler;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import proj.dfjm.javapythoncompiler.antlr.GrammarLexer;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.listeners.JavaGrammarListener;
import proj.dfjm.javapythoncompiler.listeners.PythonGrammarListener;
import proj.dfjm.javapythoncompiler.parser.BaseParser;
import proj.dfjm.javapythoncompiler.parser.JavaParser;
import proj.dfjm.javapythoncompiler.parser.PythonParser;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: javapythoncompiler.jar file...");
            return;
        }

        for (String arg : args) {
            try {
                File myObj = new File(arg);
                Scanner myReader = new Scanner(myObj);
                StringBuilder codeToParse = new StringBuilder();
                while (myReader.hasNextLine()) {
                    codeToParse.append(myReader.nextLine());
                }
                myReader.close();
                BaseParser pythonParser = new JavaParser();
                String resultCode = pythonParser.parse(codeToParse.toString());
                System.out.println(resultCode);
            } catch (IOException | InvalidPathException e) {
                System.err.println("Unable to open file '" + arg + "'!");
            } catch (ParseCancellationException e) {
                System.err.println("Failed to parse file '" + arg + "'!");
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
