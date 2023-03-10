// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FUNCTION_NAME=7, INT_TYPE=8, 
		CHAR_TYPE=9, STRING_TYPE=10, DOUBLE_TYPE=11, FLOAT_TYPE=12, BOOL_TYPE=13, 
		ID=14, NUMBER=15, CHAR=16, DOBULE=17, STRING=18, P_STRING=19, BOOL=20, 
		WS=21;
	public static final int
		RULE_prog = 0, RULE_java = 1, RULE_python = 2, RULE_p_line = 3, RULE_j_line = 4, 
		RULE_j_function_call = 5, RULE_j_args = 6, RULE_j_arg = 7, RULE_p_function_call = 8, 
		RULE_p_args = 9, RULE_p_arg = 10, RULE_j_initialization = 11, RULE_j_int_initialization = 12, 
		RULE_j_string_initialization = 13, RULE_j_bool_initialization = 14, RULE_j_float_initialization = 15, 
		RULE_j_double_initialization = 16, RULE_j_char_initialization = 17, RULE_p_declaration = 18, 
		RULE_j_type = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "java", "python", "p_line", "j_line", "j_function_call", "j_args", 
			"j_arg", "p_function_call", "p_args", "p_arg", "j_initialization", "j_int_initialization", 
			"j_string_initialization", "j_bool_initialization", "j_float_initialization", 
			"j_double_initialization", "j_char_initialization", "p_declaration", 
			"j_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'()'", "','", "'='", null, "'int'", "'char'", 
			"'String'", "'double'", "'float'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FUNCTION_NAME", "INT_TYPE", 
			"CHAR_TYPE", "STRING_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", "BOOL_TYPE", 
			"ID", "NUMBER", "CHAR", "DOBULE", "STRING", "P_STRING", "BOOL", "WS"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public JavaContext java() {
			return getRuleContext(JavaContext.class,0);
		}
		public PythonContext python() {
			return getRuleContext(PythonContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(40);
				java();
				}
				break;
			case 2:
				{
				setState(41);
				python();
				}
				break;
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JavaContext extends ParserRuleContext {
		public List<J_lineContext> j_line() {
			return getRuleContexts(J_lineContext.class);
		}
		public J_lineContext j_line(int i) {
			return getRuleContext(J_lineContext.class,i);
		}
		public JavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJava(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaContext java() throws RecognitionException {
		JavaContext _localctx = new JavaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16256L) != 0) {
				{
				{
				setState(46);
				j_line();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PythonContext extends ParserRuleContext {
		public List<P_lineContext> p_line() {
			return getRuleContexts(P_lineContext.class);
		}
		public P_lineContext p_line(int i) {
			return getRuleContext(P_lineContext.class,i);
		}
		public PythonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPython(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPython(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPython(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PythonContext python() throws RecognitionException {
		PythonContext _localctx = new PythonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_python);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_NAME || _la==ID) {
				{
				{
				setState(52);
				p_line();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P_lineContext extends ParserRuleContext {
		public P_function_callContext p_function_call() {
			return getRuleContext(P_function_callContext.class,0);
		}
		public P_declarationContext p_declaration() {
			return getRuleContext(P_declarationContext.class,0);
		}
		public P_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_lineContext p_line() throws RecognitionException {
		P_lineContext _localctx = new P_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_p_line);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				p_function_call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				p_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_lineContext extends ParserRuleContext {
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public J_initializationContext j_initialization() {
			return getRuleContext(J_initializationContext.class,0);
		}
		public J_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_lineContext j_line() throws RecognitionException {
		J_lineContext _localctx = new J_lineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_j_line);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				j_function_call();
				}
				break;
			case INT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				j_initialization();
				setState(64);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_function_callContext extends ParserRuleContext {
		public TerminalNode FUNCTION_NAME() { return getToken(gParser.FUNCTION_NAME, 0); }
		public J_argsContext j_args() {
			return getRuleContext(J_argsContext.class,0);
		}
		public J_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_function_callContext j_function_call() throws RecognitionException {
		J_function_callContext _localctx = new J_function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_j_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FUNCTION_NAME);
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(69);
				match(T__1);
				setState(70);
				j_args();
				setState(71);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(73);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_argsContext extends ParserRuleContext {
		public List<J_argContext> j_arg() {
			return getRuleContexts(J_argContext.class);
		}
		public J_argContext j_arg(int i) {
			return getRuleContext(J_argContext.class,i);
		}
		public J_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argsContext j_args() throws RecognitionException {
		J_argsContext _localctx = new J_argsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_j_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					j_arg();
					setState(77);
					match(T__4);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(84);
			j_arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_argContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public J_typeContext j_type() {
			return getRuleContext(J_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public J_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argContext j_arg() throws RecognitionException {
		J_argContext _localctx = new J_argContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_j_arg);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(BOOL);
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				j_function_call();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(STRING);
				}
				break;
			case INT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(90);
				j_type();
				setState(91);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P_function_callContext extends ParserRuleContext {
		public TerminalNode FUNCTION_NAME() { return getToken(gParser.FUNCTION_NAME, 0); }
		public P_argsContext p_args() {
			return getRuleContext(P_argsContext.class,0);
		}
		public P_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_function_callContext p_function_call() throws RecognitionException {
		P_function_callContext _localctx = new P_function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_p_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FUNCTION_NAME);
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(96);
				match(T__1);
				setState(97);
				p_args();
				setState(98);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(100);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P_argsContext extends ParserRuleContext {
		public List<P_argContext> p_arg() {
			return getRuleContexts(P_argContext.class);
		}
		public P_argContext p_arg(int i) {
			return getRuleContext(P_argContext.class,i);
		}
		public P_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_argsContext p_args() throws RecognitionException {
		P_argsContext _localctx = new P_argsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_p_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					p_arg();
					setState(104);
					match(T__4);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(111);
			p_arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P_argContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public TerminalNode P_STRING() { return getToken(gParser.P_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public P_function_callContext p_function_call() {
			return getRuleContext(P_function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public P_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_argContext p_arg() throws RecognitionException {
		P_argContext _localctx = new P_argContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_p_arg);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(BOOL);
				}
				break;
			case P_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(P_STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(NUMBER);
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				p_function_call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_initializationContext extends ParserRuleContext {
		public J_int_initializationContext j_int_initialization() {
			return getRuleContext(J_int_initializationContext.class,0);
		}
		public J_float_initializationContext j_float_initialization() {
			return getRuleContext(J_float_initializationContext.class,0);
		}
		public J_double_initializationContext j_double_initialization() {
			return getRuleContext(J_double_initializationContext.class,0);
		}
		public J_bool_initializationContext j_bool_initialization() {
			return getRuleContext(J_bool_initializationContext.class,0);
		}
		public J_string_initializationContext j_string_initialization() {
			return getRuleContext(J_string_initializationContext.class,0);
		}
		public J_char_initializationContext j_char_initialization() {
			return getRuleContext(J_char_initializationContext.class,0);
		}
		public J_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_initializationContext j_initialization() throws RecognitionException {
		J_initializationContext _localctx = new J_initializationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_j_initialization);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				j_int_initialization();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				j_float_initialization();
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				j_double_initialization();
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				j_bool_initialization();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				j_string_initialization();
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				j_char_initialization();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_int_initializationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(gParser.INT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public J_int_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_int_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_int_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_int_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_int_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_int_initializationContext j_int_initialization() throws RecognitionException {
		J_int_initializationContext _localctx = new J_int_initializationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_j_int_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(INT_TYPE);
			setState(129);
			match(ID);
			setState(130);
			match(T__5);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_string_initializationContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(gParser.STRING_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public J_string_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_string_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_string_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_string_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_string_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_string_initializationContext j_string_initialization() throws RecognitionException {
		J_string_initializationContext _localctx = new J_string_initializationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j_string_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(STRING_TYPE);
			setState(134);
			match(ID);
			setState(135);
			match(T__5);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_bool_initializationContext extends ParserRuleContext {
		public TerminalNode BOOL_TYPE() { return getToken(gParser.BOOL_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public J_bool_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_bool_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_bool_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_bool_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_bool_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_bool_initializationContext j_bool_initialization() throws RecognitionException {
		J_bool_initializationContext _localctx = new J_bool_initializationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_j_bool_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(BOOL_TYPE);
			setState(139);
			match(ID);
			setState(140);
			match(T__5);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_float_initializationContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(gParser.FLOAT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode DOBULE() { return getToken(gParser.DOBULE, 0); }
		public J_float_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_float_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_float_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_float_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_float_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_float_initializationContext j_float_initialization() throws RecognitionException {
		J_float_initializationContext _localctx = new J_float_initializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_j_float_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FLOAT_TYPE);
			setState(144);
			match(ID);
			setState(145);
			match(T__5);
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DOBULE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_double_initializationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_TYPE() { return getToken(gParser.DOUBLE_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode DOBULE() { return getToken(gParser.DOBULE, 0); }
		public J_double_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_double_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_double_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_double_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_double_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_double_initializationContext j_double_initialization() throws RecognitionException {
		J_double_initializationContext _localctx = new J_double_initializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_j_double_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DOUBLE_TYPE);
			setState(149);
			match(ID);
			setState(150);
			match(T__5);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DOBULE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_char_initializationContext extends ParserRuleContext {
		public TerminalNode CHAR_TYPE() { return getToken(gParser.CHAR_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode CHAR() { return getToken(gParser.CHAR, 0); }
		public J_char_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_char_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_char_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_char_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_char_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_char_initializationContext j_char_initialization() throws RecognitionException {
		J_char_initializationContext _localctx = new J_char_initializationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_j_char_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CHAR_TYPE);
			setState(154);
			match(ID);
			setState(155);
			match(T__5);
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public P_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_declarationContext p_declaration() throws RecognitionException {
		P_declarationContext _localctx = new P_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_p_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(T__5);
			setState(160);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1359872L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(gParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(gParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(gParser.STRING_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(gParser.DOUBLE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(gParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(gParser.BOOL_TYPE, 0); }
		public J_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_typeContext j_type() throws RecognitionException {
		J_typeContext _localctx = new J_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_j_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0003\u0000+\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00010\b\u0001\n\u0001"+
		"\f\u00013\t\u0001\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006P\b\u0006\n\u0006"+
		"\f\u0006S\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\tk\b\t\n\t\f\tn\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&\u0000\u0007\u0001\u0000\u000e\u000f\u0002\u0000\u000e\u000e\u0012\u0012"+
		"\u0002\u0000\u000e\u000e\u0014\u0014\u0002\u0000\u000e\u000e\u0011\u0011"+
		"\u0002\u0000\u000e\u000e\u0010\u0010\u0003\u0000\u000e\u000f\u0012\u0012"+
		"\u0014\u0014\u0001\u0000\b\r\u00a6\u0000*\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006<\u0001"+
		"\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000"+
		"\fQ\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010_\u0001"+
		"\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000"+
		"\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000"+
		"\u001a\u0085\u0001\u0000\u0000\u0000\u001c\u008a\u0001\u0000\u0000\u0000"+
		"\u001e\u008f\u0001\u0000\u0000\u0000 \u0094\u0001\u0000\u0000\u0000\""+
		"\u0099\u0001\u0000\u0000\u0000$\u009e\u0001\u0000\u0000\u0000&\u00a2\u0001"+
		"\u0000\u0000\u0000(+\u0003\u0002\u0001\u0000)+\u0003\u0004\u0002\u0000"+
		"*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000.0\u0003"+
		"\b\u0004\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000046\u0003\u0006\u0003\u000054\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:=\u0003\u0010\b\u0000;=\u0003$\u0012\u0000<:\u0001\u0000\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>C\u0003"+
		"\n\u0005\u0000?@\u0003\u0016\u000b\u0000@A\u0005\u0001\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000"+
		"C\t\u0001\u0000\u0000\u0000DJ\u0005\u0007\u0000\u0000EF\u0005\u0002\u0000"+
		"\u0000FG\u0003\f\u0006\u0000GH\u0005\u0003\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IK\u0005\u0004\u0000\u0000JE\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0003\u000e\u0007\u0000"+
		"MN\u0005\u0005\u0000\u0000NP\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0003"+
		"\u000e\u0007\u0000U\r\u0001\u0000\u0000\u0000V^\u0005\u0014\u0000\u0000"+
		"W^\u0003\n\u0005\u0000X^\u0005\u000f\u0000\u0000Y^\u0005\u0012\u0000\u0000"+
		"Z[\u0003&\u0013\u0000[\\\u0005\u000e\u0000\u0000\\^\u0001\u0000\u0000"+
		"\u0000]V\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]X\u0001\u0000"+
		"\u0000\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000_e\u0005\u0007\u0000\u0000`a\u0005\u0002\u0000"+
		"\u0000ab\u0003\u0012\t\u0000bc\u0005\u0003\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000df\u0005\u0004\u0000\u0000e`\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0003\u0014\n\u0000hi\u0005"+
		"\u0005\u0000\u0000ik\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003\u0014"+
		"\n\u0000p\u0013\u0001\u0000\u0000\u0000qw\u0005\u0014\u0000\u0000rw\u0005"+
		"\u0013\u0000\u0000sw\u0005\u000f\u0000\u0000tw\u0003\u0010\b\u0000uw\u0005"+
		"\u000e\u0000\u0000vq\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000"+
		"vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000w\u0015\u0001\u0000\u0000\u0000x\u007f\u0003\u0018\f\u0000y\u007f"+
		"\u0003\u001e\u000f\u0000z\u007f\u0003 \u0010\u0000{\u007f\u0003\u001c"+
		"\u000e\u0000|\u007f\u0003\u001a\r\u0000}\u007f\u0003\"\u0011\u0000~x\u0001"+
		"\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000"+
		"~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000"+
		"\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000"+
		"\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0019\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\n\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087"+
		"\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0007\u0001\u0000\u0000\u0089"+
		"\u001b\u0001\u0000\u0000\u0000\u008a\u008b\u0005\r\u0000\u0000\u008b\u008c"+
		"\u0005\u000e\u0000\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e"+
		"\u0007\u0002\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\f\u0000\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0092\u0005"+
		"\u0006\u0000\u0000\u0092\u0093\u0007\u0003\u0000\u0000\u0093\u001f\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0096\u0005"+
		"\u000e\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0098\u0007"+
		"\u0003\u0000\u0000\u0098!\u0001\u0000\u0000\u0000\u0099\u009a\u0005\t"+
		"\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c\u0005\u0006"+
		"\u0000\u0000\u009c\u009d\u0007\u0004\u0000\u0000\u009d#\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a0\u0005\u0006\u0000"+
		"\u0000\u00a0\u00a1\u0007\u0005\u0000\u0000\u00a1%\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0006\u0000\u0000\u00a3\'\u0001\u0000\u0000\u0000\f"+
		"*17<BJQ]elv~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}