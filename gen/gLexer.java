// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUNCTION_NAME=8, 
		TYPE=9, ID=10, NUM=11, STRING=12, P_STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FUNCTION_NAME", 
			"TYPE", "ID", "NUM", "STRING", "P_STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "';'", "'('", "')'", "'()'", "','", "'(a)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FUNCTION_NAME", "TYPE", 
			"ID", "NUM", "STRING", "P_STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0005\t|\b\t\n\t\f\t\u007f\t\t"+
		"\u0001\n\u0001\n\u0003\n\u0083\b\n\u0001\n\u0001\n\u0005\n\u0087\b\n\n"+
		"\n\f\n\u008a\t\n\u0003\n\u008c\b\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0090\b\u000b\n\u000b\f\u000b\u0093\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c\t\f\u0001\f\u0001\f\u0001\r"+
		"\u0004\r\u00a1\b\r\u000b\r\f\r\u00a2\u0001\r\u0001\r\u0000\u0000\u000e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0006\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000019\u0001"+
		"\u000009\u0002\u0000\"\"\'\'\u0003\u0000\t\n\r\r  \u00b8\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000"+
		"\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000"+
		"\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b(\u0001"+
		"\u0000\u0000\u0000\r*\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000"+
		"\u0000\u0011w\u0001\u0000\u0000\u0000\u0013y\u0001\u0000\u0000\u0000\u0015"+
		"\u008b\u0001\u0000\u0000\u0000\u0017\u008d\u0001\u0000\u0000\u0000\u0019"+
		"\u0096\u0001\u0000\u0000\u0000\u001b\u00a0\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\n\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f "+
		"\u0005;\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000"+
		"\"\u0006\u0001\u0000\u0000\u0000#$\u0005)\u0000\u0000$\b\u0001\u0000\u0000"+
		"\u0000%&\u0005(\u0000\u0000&\'\u0005)\u0000\u0000\'\n\u0001\u0000\u0000"+
		"\u0000()\u0005,\u0000\u0000)\f\u0001\u0000\u0000\u0000*+\u0005(\u0000"+
		"\u0000+,\u0005a\u0000\u0000,-\u0005)\u0000\u0000-\u000e\u0001\u0000\u0000"+
		"\u0000./\u0005S\u0000\u0000/0\u0005e\u0000\u00000Z\u0005q\u0000\u0000"+
		"12\u0005C\u0000\u000023\u0005o\u0000\u000034\u0005n\u0000\u00004Z\u0005"+
		"d\u0000\u000056\u0005B\u0000\u000067\u0005r\u0000\u000078\u0005a\u0000"+
		"\u000089\u0005n\u0000\u00009:\u0005c\u0000\u0000:;\u0005h\u0000\u0000"+
		";<\u0005R\u0000\u0000<Z\u0005e\u0000\u0000=>\u0005B\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005a\u0000\u0000@A\u0005n\u0000\u0000AB\u0005c\u0000"+
		"\u0000BZ\u0005h\u0000\u0000CD\u0005C\u0000\u0000DE\u0005o\u0000\u0000"+
		"EF\u0005n\u0000\u0000FG\u0005c\u0000\u0000GH\u0005u\u0000\u0000HI\u0005"+
		"r\u0000\u0000IJ\u0005R\u0000\u0000JZ\u0005e\u0000\u0000KL\u0005C\u0000"+
		"\u0000LM\u0005o\u0000\u0000MN\u0005n\u0000\u0000NO\u0005c\u0000\u0000"+
		"OP\u0005u\u0000\u0000PZ\u0005r\u0000\u0000QR\u0005P\u0000\u0000RS\u0005"+
		"a\u0000\u0000ST\u0005r\u0000\u0000TZ\u0005a\u0000\u0000UV\u0005L\u0000"+
		"\u0000VW\u0005o\u0000\u0000WX\u0005o\u0000\u0000XZ\u0005p\u0000\u0000"+
		"Y.\u0001\u0000\u0000\u0000Y1\u0001\u0000\u0000\u0000Y5\u0001\u0000\u0000"+
		"\u0000Y=\u0001\u0000\u0000\u0000YC\u0001\u0000\u0000\u0000YK\u0001\u0000"+
		"\u0000\u0000YQ\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000Z\u0010"+
		"\u0001\u0000\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]"+
		"x\u0005t\u0000\u0000^_\u0005c\u0000\u0000_`\u0005h\u0000\u0000`a\u0005"+
		"a\u0000\u0000ax\u0005r\u0000\u0000bc\u0005S\u0000\u0000cd\u0005t\u0000"+
		"\u0000de\u0005r\u0000\u0000ef\u0005i\u0000\u0000fg\u0005n\u0000\u0000"+
		"gx\u0005g\u0000\u0000hi\u0005d\u0000\u0000ij\u0005o\u0000\u0000jk\u0005"+
		"u\u0000\u0000kl\u0005b\u0000\u0000lm\u0005l\u0000\u0000mx\u0005e\u0000"+
		"\u0000no\u0005f\u0000\u0000op\u0005l\u0000\u0000pq\u0005o\u0000\u0000"+
		"qr\u0005a\u0000\u0000rx\u0005t\u0000\u0000st\u0005b\u0000\u0000tu\u0005"+
		"o\u0000\u0000uv\u0005o\u0000\u0000vx\u0005l\u0000\u0000w[\u0001\u0000"+
		"\u0000\u0000w^\u0001\u0000\u0000\u0000wb\u0001\u0000\u0000\u0000wh\u0001"+
		"\u0000\u0000\u0000wn\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000"+
		"x\u0012\u0001\u0000\u0000\u0000y}\u0007\u0000\u0000\u0000z|\u0007\u0001"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0014\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u008c\u00050\u0000\u0000"+
		"\u0081\u0083\u0005-\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0007\u0002\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0080\u0001\u0000\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008c"+
		"\u0016\u0001\u0000\u0000\u0000\u008d\u0091\u0005\"\u0000\u0000\u008e\u0090"+
		"\t\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\"\u0000\u0000\u0095\u0018\u0001\u0000"+
		"\u0000\u0000\u0096\u009a\u0007\u0004\u0000\u0000\u0097\u0099\t\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u001a\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0007\u0005\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0006\r\u0000\u0000\u00a5\u001c\u0001\u0000\u0000\u0000"+
		"\n\u0000Yw}\u0082\u0088\u008b\u0091\u009a\u00a2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}