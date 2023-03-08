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
		T__0=1, T__1=2, T__2=3, FUNCTION_NAME=4, TYPE=5, ID=6, NUM=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "FUNCTION_NAME", "TYPE", "ID", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FUNCTION_NAME", "TYPE", "ID", "NUM", "WS"
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
		"\u0004\u0000\bY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u001f\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006H\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006L\b\u0006\n\u0006"+
		"\f\u0006O\t\u0006\u0003\u0006Q\b\u0006\u0001\u0007\u0004\u0007T\b\u0007"+
		"\u000b\u0007\f\u0007U\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0001\u0000\u0005\u0001\u0000az\u0004\u000009AZ__az\u0001\u000019\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  c\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u0013\u0001"+
		"\u0000\u0000\u0000\u0005\u0015\u0001\u0000\u0000\u0000\u0007\u001e\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000"+
		"\u0000\rP\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005(\u0000\u0000\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005)\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		",\u0000\u0000\u0016\u0006\u0001\u0000\u0000\u0000\u0017\u0018\u0005S\u0000"+
		"\u0000\u0018\u0019\u0005e\u0000\u0000\u0019\u001f\u0005q\u0000\u0000\u001a"+
		"\u001b\u0005C\u0000\u0000\u001b\u001c\u0005o\u0000\u0000\u001c\u001d\u0005"+
		"n\u0000\u0000\u001d\u001f\u0005d\u0000\u0000\u001e\u0017\u0001\u0000\u0000"+
		"\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001f\b\u0001\u0000\u0000\u0000"+
		" !\u0005i\u0000\u0000!\"\u0005n\u0000\u0000\"=\u0005t\u0000\u0000#$\u0005"+
		"c\u0000\u0000$%\u0005h\u0000\u0000%&\u0005a\u0000\u0000&=\u0005r\u0000"+
		"\u0000\'(\u0005S\u0000\u0000()\u0005t\u0000\u0000)*\u0005r\u0000\u0000"+
		"*+\u0005i\u0000\u0000+,\u0005n\u0000\u0000,=\u0005g\u0000\u0000-.\u0005"+
		"d\u0000\u0000./\u0005o\u0000\u0000/0\u0005u\u0000\u000001\u0005b\u0000"+
		"\u000012\u0005l\u0000\u00002=\u0005e\u0000\u000034\u0005f\u0000\u0000"+
		"45\u0005l\u0000\u000056\u0005o\u0000\u000067\u0005a\u0000\u00007=\u0005"+
		"t\u0000\u000089\u0005b\u0000\u00009:\u0005o\u0000\u0000:;\u0005o\u0000"+
		"\u0000;=\u0005l\u0000\u0000< \u0001\u0000\u0000\u0000<#\u0001\u0000\u0000"+
		"\u0000<\'\u0001\u0000\u0000\u0000<-\u0001\u0000\u0000\u0000<3\u0001\u0000"+
		"\u0000\u0000<8\u0001\u0000\u0000\u0000=\n\u0001\u0000\u0000\u0000>B\u0007"+
		"\u0000\u0000\u0000?A\u0007\u0001\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\f\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EQ\u00050\u0000"+
		"\u0000FH\u0005-\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IM\u0007\u0002\u0000\u0000JL\u0007\u0003"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PE\u0001\u0000\u0000\u0000PG\u0001\u0000\u0000"+
		"\u0000Q\u000e\u0001\u0000\u0000\u0000RT\u0007\u0004\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006\u0007\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000\b\u0000\u001e<BGMPU\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}