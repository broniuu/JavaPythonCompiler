package proj.dfjm.javapythoncompiler.parser;

import proj.dfjm.javapythoncompiler.exceptions.CodeParsingException;
import proj.dfjm.javapythoncompiler.listeners.PythonGrammarListener;

/**
 * One of the few main classes of our parser, which effectively acts as a "frontend" to it for Python sources. If you
 * simply want to make use of the parser without going into details, use this class or the other ones in this package.
 */
public final class PythonCodeParser extends CodeParserBase {
    /**
     * Takes code that follows the Python syntax, parses it, and returns
     * a Python source code that is the result of parsing the given code.
     *
     * <p>This method is intended for parsing code following the Python syntax. When not
     * used in accordance with its intended purpose, it throws appropriate exceptions.
     *
     * <p>The output Python source code, even though stored as one (possibly very long)
     * text string, contains newlines and indentations so that it can be easily shown
     * to the user later on (as if it was just stored in something a la 2D string).
     *
     * @param input Code following the Python syntax, which is to be parsed.
     * @return The resulting Python source code that is the result of parsing the code provided as input.
     * @throws CodeParsingException if a parsing error occurs during the parsing process. If that happens, the exception
     *                              message will tell you in more detail where the problem occurred and what was wrong.
     * @throws IllegalArgumentException if the code provided as input does not seem to follow the
     *                                  Python syntax. In such case, make sure it is a Python-compliant
     *                                  code or use the parse() methods from other classes.
     * @see JavaCodeParser#parse(String)
     */
    public static String parse(String input) throws CodeParsingException, IllegalArgumentException {
        String output = parseCode(new PythonGrammarListener(), input);

        if (output == null) {
            throw new IllegalArgumentException(
                "The code provided as input does not seem to follow the Python syntax!"
            );
        }

        return output;
    }
}
