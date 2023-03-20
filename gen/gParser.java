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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, FUNCTION_NAME=23, INT_TYPE=24, 
		CHAR_TYPE=25, STRING_TYPE=26, DOUBLE_TYPE=27, FLOAT_TYPE=28, BOOL_TYPE=29, 
		ID=30, NUMBER=31, CHAR=32, DOBULE=33, STRING=34, BOOL=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_java = 1, RULE_python = 2, RULE_p_line = 3, RULE_j_line = 4, 
		RULE_j_function_call = 5, RULE_j_args = 6, RULE_j_arg = 7, RULE_p_function_call = 8, 
		RULE_p_args = 9, RULE_p_arg = 10, RULE_j_initialization = 11, RULE_j_int_initialization = 12, 
		RULE_j_string_initialization = 13, RULE_j_bool_initialization = 14, RULE_j_float_initialization = 15, 
		RULE_j_double_initialization = 16, RULE_j_char_initialization = 17, RULE_p_declaration = 18, 
		RULE_j_type = 19, RULE_p_string = 20, RULE_j_loop = 21, RULE_statement = 22, 
		RULE_whileStatement = 23, RULE_conditionStatement = 24, RULE_forStatement = 25, 
		RULE_basicForStatement = 26, RULE_stmt = 27, RULE_block = 28, RULE_forInit = 29, 
		RULE_localVariableDeclaration = 30, RULE_forUpdate = 31, RULE_expression = 32, 
		RULE_condition = 33, RULE_incDecExpression = 34, RULE_p_forloop = 35, 
		RULE_p_exp = 36, RULE_p_list = 37, RULE_p_type = 38, RULE_p_range = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "java", "python", "p_line", "j_line", "j_function_call", "j_args", 
			"j_arg", "p_function_call", "p_args", "p_arg", "j_initialization", "j_int_initialization", 
			"j_string_initialization", "j_bool_initialization", "j_float_initialization", 
			"j_double_initialization", "j_char_initialization", "p_declaration", 
			"j_type", "p_string", "j_loop", "statement", "whileStatement", "conditionStatement", 
			"forStatement", "basicForStatement", "stmt", "block", "forInit", "localVariableDeclaration", 
			"forUpdate", "expression", "condition", "incDecExpression", "p_forloop", 
			"p_exp", "p_list", "p_type", "p_range"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'()'", "','", "'='", "'['", "']'", "'''", 
			"'while'", "'for'", "'{'", "'}'", "'>'", "'<'", "'>='", "'<='", "'++'", 
			"'--'", "'in'", "':'", "'range'", null, "'int'", "'char'", "'String'", 
			"'double'", "'float'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "FUNCTION_NAME", 
			"INT_TYPE", "CHAR_TYPE", "STRING_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", 
			"BOOL_TYPE", "ID", "NUMBER", "CHAR", "DOBULE", "STRING", "BOOL", "WS"
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(80);
				java();
				}
				break;
			case 2:
				{
				setState(81);
				python();
				}
				break;
			}
			setState(84);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1065356288L) != 0) {
				{
				{
				setState(86);
				j_line();
				}
				}
				setState(91);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1082132480L) != 0) {
				{
				{
				setState(92);
				p_line();
				}
				}
				setState(97);
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
		public P_forloopContext p_forloop() {
			return getRuleContext(P_forloopContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				p_function_call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				p_declaration();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				p_forloop();
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
		public J_loopContext j_loop() {
			return getRuleContext(J_loopContext.class,0);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_NAME:
			case INT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION_NAME:
					{
					setState(103);
					j_function_call();
					}
					break;
				case INT_TYPE:
				case CHAR_TYPE:
				case STRING_TYPE:
				case DOUBLE_TYPE:
				case FLOAT_TYPE:
				case BOOL_TYPE:
					{
					setState(104);
					j_initialization();
					setState(105);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				j_loop();
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
			setState(112);
			match(FUNCTION_NAME);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(113);
				match(T__1);
				setState(114);
				j_args();
				setState(115);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(117);
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
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					j_arg();
					setState(121);
					match(T__4);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(128);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(BOOL);
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				j_function_call();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
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
				setState(134);
				j_type();
				setState(135);
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
			setState(139);
			match(FUNCTION_NAME);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(140);
				match(T__1);
				setState(141);
				p_args();
				setState(142);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(144);
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
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					p_arg();
					setState(148);
					match(T__4);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(155);
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
		public P_stringContext p_string() {
			return getRuleContext(P_stringContext.class,0);
		}
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(BOOL);
				}
				break;
			case T__8:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				p_string();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(NUMBER);
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				p_function_call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				j_int_initialization();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				j_float_initialization();
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				j_double_initialization();
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				j_bool_initialization();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				j_string_initialization();
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
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
			setState(172);
			match(INT_TYPE);
			setState(173);
			match(ID);
			setState(174);
			match(T__5);
			setState(175);
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
			setState(177);
			match(STRING_TYPE);
			setState(178);
			match(ID);
			setState(179);
			match(T__5);
			setState(180);
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
			setState(182);
			match(BOOL_TYPE);
			setState(183);
			match(ID);
			setState(184);
			match(T__5);
			setState(185);
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
			setState(187);
			match(FLOAT_TYPE);
			setState(188);
			match(ID);
			setState(189);
			match(T__5);
			setState(190);
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
			setState(192);
			match(DOUBLE_TYPE);
			setState(193);
			match(ID);
			setState(194);
			match(T__5);
			setState(195);
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
			setState(197);
			match(CHAR_TYPE);
			setState(198);
			match(ID);
			setState(199);
			match(T__5);
			setState(200);
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
		public P_typeContext p_type() {
			return getRuleContext(P_typeContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			setState(203);
			match(T__5);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(204);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(205);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				setState(206);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(207);
				match(BOOL);
				}
				break;
			case T__6:
				{
				setState(208);
				match(T__6);
				setState(209);
				p_type();
				setState(210);
				match(T__7);
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
			setState(214);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) ) {
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
	public static class P_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public P_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_stringContext p_string() throws RecognitionException {
		P_stringContext _localctx = new P_stringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_p_string);
		try {
			int _alt;
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(STRING);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(217);
				match(T__8);
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(218);
						matchWildcard();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(224);
				match(T__8);
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
	public static class J_loopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public J_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_loopContext j_loop() throws RecognitionException {
		J_loopContext _localctx = new J_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_j_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			statement();
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
	public static class StatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				forStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				whileStatement();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__9);
			setState(234);
			match(T__1);
			setState(235);
			conditionStatement();
			setState(236);
			match(T__2);
			setState(237);
			stmt();
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
	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionStatement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ID);
				setState(240);
				condition();
				setState(241);
				match(NUMBER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(BOOL);
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
	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			basicForStatement();
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
	public static class BasicForStatementContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__10);
			setState(249);
			match(T__1);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE) {
				{
				setState(250);
				forInit();
				}
			}

			setState(253);
			match(T__0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(254);
				expression();
				}
			}

			setState(257);
			match(T__0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074528256L) != 0) {
				{
				setState(258);
				forUpdate();
				}
			}

			setState(261);
			match(T__2);
			setState(262);
			stmt();
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
	public static class StmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public J_lineContext j_line() {
			return getRuleContext(J_lineContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stmt);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				block();
				}
				break;
			case T__9:
			case T__10:
			case FUNCTION_NAME:
			case INT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				j_line();
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
	public static class BlockContext extends ParserRuleContext {
		public List<J_lineContext> j_line() {
			return getRuleContexts(J_lineContext.class);
		}
		public J_lineContext j_line(int i) {
			return getRuleContext(J_lineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__11);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1065356288L) != 0) {
				{
				{
				setState(269);
				j_line();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(T__12);
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
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			localVariableDeclaration();
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
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public J_int_initializationContext j_int_initialization() {
			return getRuleContext(J_int_initializationContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			j_int_initialization();
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
	public static class ForUpdateContext extends ParserRuleContext {
		public IncDecExpressionContext incDecExpression() {
			return getRuleContext(IncDecExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			incDecExpression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
			setState(284);
			condition();
			setState(285);
			match(NUMBER);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
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
	public static class IncDecExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public IncDecExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecExpressionContext incDecExpression() throws RecognitionException {
		IncDecExpressionContext _localctx = new IncDecExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_incDecExpression);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__17);
				setState(290);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__18);
				setState(292);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(ID);
				setState(296);
				match(T__18);
				}
				break;
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
	public static class P_forloopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public P_expContext p_exp() {
			return getRuleContext(P_expContext.class,0);
		}
		public List<P_lineContext> p_line() {
			return getRuleContexts(P_lineContext.class);
		}
		public P_lineContext p_line(int i) {
			return getRuleContext(P_lineContext.class,i);
		}
		public P_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_forloopContext p_forloop() throws RecognitionException {
		P_forloopContext _localctx = new P_forloopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_p_forloop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__10);
			setState(300);
			match(ID);
			setState(301);
			match(T__19);
			setState(302);
			p_exp();
			setState(303);
			match(T__20);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					p_line();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class P_expContext extends ParserRuleContext {
		public P_stringContext p_string() {
			return getRuleContext(P_stringContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public P_rangeContext p_range() {
			return getRuleContext(P_rangeContext.class,0);
		}
		public P_listContext p_list() {
			return getRuleContext(P_listContext.class,0);
		}
		public P_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_expContext p_exp() throws RecognitionException {
		P_expContext _localctx = new P_expContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_p_exp);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				p_string();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				p_range();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				p_list();
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
	public static class P_listContext extends ParserRuleContext {
		public List<P_typeContext> p_type() {
			return getRuleContexts(P_typeContext.class);
		}
		public P_typeContext p_type(int i) {
			return getRuleContext(P_typeContext.class,i);
		}
		public P_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_listContext p_list() throws RecognitionException {
		P_listContext _localctx = new P_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_p_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__6);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 53687091200L) != 0) {
				{
				setState(317);
				p_type();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(318);
					match(T__4);
					setState(319);
					p_type();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(T__7);
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
	public static class P_typeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public P_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_typeContext p_type() throws RecognitionException {
		P_typeContext _localctx = new P_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_p_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 53687091200L) != 0) ) {
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
	public static class P_rangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gParser.NUMBER, 0); }
		public P_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterP_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitP_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitP_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_rangeContext p_range() throws RecognitionException {
		P_rangeContext _localctx = new P_rangeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_p_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__21);
			setState(332);
			match(T__1);
			setState(333);
			match(NUMBER);
			setState(334);
			match(T__2);
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
		"\u0004\u0001$\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0003\u0000S\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001[\t\u0001\u0001\u0002\u0005"+
		"\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004l\b\u0004\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"w\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006"+
		"\f\u0006\u007f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0092\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0097\b\t\n\t\f\t\u009a\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a3"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00ab\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d5\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00dc"+
		"\b\u0014\n\u0014\f\u0014\u00df\t\u0014\u0001\u0014\u0003\u0014\u00e2\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00e8"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00f5\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00fc\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0100"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0104\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u010b\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u010f\b\u001c\n\u001c\f\u001c\u0112"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u012a\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0132\b"+
		"#\n#\f#\u0135\t#\u0001$\u0001$\u0001$\u0001$\u0003$\u013b\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0005%\u0141\b%\n%\f%\u0144\t%\u0003%\u0146\b%\u0001%"+
		"\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\u00dd\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\b\u0001"+
		"\u0000\u001e\u001f\u0002\u0000\u001e\u001e\"\"\u0002\u0000\u001e\u001e"+
		"##\u0002\u0000\u001e\u001e!!\u0002\u0000\u001e\u001e  \u0001\u0000\u0018"+
		"\u001d\u0001\u0000\u000e\u0011\u0002\u0000\u001f\u001f\"#\u0156\u0000"+
		"R\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004_\u0001"+
		"\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000"+
		"\u0000\np\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0089"+
		"\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u0098"+
		"\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00aa"+
		"\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00b1"+
		"\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00bb"+
		"\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00c5\u0001"+
		"\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000"+
		"\u0000(\u00e1\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,"+
		"\u00e7\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000\u0000\u00000\u00f4\u0001"+
		"\u0000\u0000\u00002\u00f6\u0001\u0000\u0000\u00004\u00f8\u0001\u0000\u0000"+
		"\u00006\u010a\u0001\u0000\u0000\u00008\u010c\u0001\u0000\u0000\u0000:"+
		"\u0115\u0001\u0000\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>\u0119\u0001"+
		"\u0000\u0000\u0000@\u011b\u0001\u0000\u0000\u0000B\u011f\u0001\u0000\u0000"+
		"\u0000D\u0129\u0001\u0000\u0000\u0000F\u012b\u0001\u0000\u0000\u0000H"+
		"\u013a\u0001\u0000\u0000\u0000J\u013c\u0001\u0000\u0000\u0000L\u0149\u0001"+
		"\u0000\u0000\u0000N\u014b\u0001\u0000\u0000\u0000PS\u0003\u0002\u0001"+
		"\u0000QS\u0003\u0004\u0002\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0000\u0000\u0001U\u0001"+
		"\u0001\u0000\u0000\u0000VX\u0003\b\u0004\u0000WV\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\u0003\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0006\u0003\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0005\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0003\u0010\b\u0000cf\u0003$"+
		"\u0012\u0000df\u0003F#\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000\u0000gl\u0003"+
		"\n\u0005\u0000hi\u0003\u0016\u000b\u0000ij\u0005\u0001\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mo\u0003*\u0015\u0000nk\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000o\t\u0001\u0000\u0000\u0000pv\u0005\u0017\u0000"+
		"\u0000qr\u0005\u0002\u0000\u0000rs\u0003\f\u0006\u0000st\u0005\u0003\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000uw\u0005\u0004\u0000\u0000vq\u0001\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000"+
		"xy\u0003\u000e\u0007\u0000yz\u0005\u0005\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{x\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u000e\u0007\u0000"+
		"\u0081\r\u0001\u0000\u0000\u0000\u0082\u008a\u0005#\u0000\u0000\u0083"+
		"\u008a\u0003\n\u0005\u0000\u0084\u008a\u0005\u001f\u0000\u0000\u0085\u008a"+
		"\u0005\"\u0000\u0000\u0086\u0087\u0003&\u0013\u0000\u0087\u0088\u0005"+
		"\u001e\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0082\u0001"+
		"\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u0084\u0001"+
		"\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u0086\u0001"+
		"\u0000\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0091\u0005"+
		"\u0017\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u0003"+
		"\u0012\t\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0005\u0004\u0000\u0000\u0091\u008c\u0001\u0000"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000\u0094\u0095\u0005\u0005\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0014\n\u0000"+
		"\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u00a3\u0005#\u0000\u0000\u009e"+
		"\u00a3\u0003(\u0014\u0000\u009f\u00a3\u0005\u001f\u0000\u0000\u00a0\u00a3"+
		"\u0003\u0010\b\u0000\u00a1\u00a3\u0005\u001e\u0000\u0000\u00a2\u009d\u0001"+
		"\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00ab\u0003"+
		"\u0018\f\u0000\u00a5\u00ab\u0003\u001e\u000f\u0000\u00a6\u00ab\u0003 "+
		"\u0010\u0000\u00a7\u00ab\u0003\u001c\u000e\u0000\u00a8\u00ab\u0003\u001a"+
		"\r\u0000\u00a9\u00ab\u0003\"\u0011\u0000\u00aa\u00a4\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0017\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad\u00ae\u0005\u001e\u0000"+
		"\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0\u0007\u0000\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001a\u0000"+
		"\u0000\u00b2\u00b3\u0005\u001e\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000"+
		"\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5\u001b\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8\u0005\u001e\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0007\u0002\u0000"+
		"\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000"+
		"\u0000\u00bc\u00bd\u0005\u001e\u0000\u0000\u00bd\u00be\u0005\u0006\u0000"+
		"\u0000\u00be\u00bf\u0007\u0003\u0000\u0000\u00bf\u001f\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u001b\u0000\u0000\u00c1\u00c2\u0005\u001e\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0007\u0003\u0000"+
		"\u0000\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000\u0000"+
		"\u00c6\u00c7\u0005\u001e\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000"+
		"\u00c8\u00c9\u0007\u0004\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001e\u0000\u0000\u00cb\u00d4\u0005\u0006\u0000\u0000\u00cc"+
		"\u00d5\u0005\u001e\u0000\u0000\u00cd\u00d5\u0005\u001f\u0000\u0000\u00ce"+
		"\u00d5\u0005\"\u0000\u0000\u00cf\u00d5\u0005#\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0007\u0000\u0000\u00d1\u00d2\u0003L&\u0000\u00d2\u00d3\u0005\b"+
		"\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d5%\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0005\u0000"+
		"\u0000\u00d7\'\u0001\u0000\u0000\u0000\u00d8\u00e2\u0005\"\u0000\u0000"+
		"\u00d9\u00dd\u0005\t\u0000\u0000\u00da\u00dc\t\u0000\u0000\u0000\u00db"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e2\u0005\t\u0000\u0000\u00e1\u00d8\u0001\u0000\u0000\u0000\u00e1\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003"+
		",\u0016\u0000\u00e4+\u0001\u0000\u0000\u0000\u00e5\u00e8\u00032\u0019"+
		"\u0000\u00e6\u00e8\u0003.\u0017\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000\u00eb\u00ec"+
		"\u00030\u0018\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ee\u0003"+
		"6\u001b\u0000\u00ee/\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u001e\u0000"+
		"\u0000\u00f0\u00f1\u0003B!\u0000\u00f1\u00f2\u0005\u001f\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005#\u0000\u0000\u00f4\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f51\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u00034\u001a\u0000\u00f73\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u000b\u0000\u0000\u00f9\u00fb\u0005\u0002\u0000"+
		"\u0000\u00fa\u00fc\u0003:\u001d\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ff\u0005\u0001\u0000\u0000\u00fe\u0100\u0003@ \u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0005\u0001\u0000\u0000\u0102\u0104"+
		"\u0003>\u001f\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\u0003\u0000\u0000\u0106\u0107\u00036\u001b\u0000\u01075\u0001\u0000\u0000"+
		"\u0000\u0108\u010b\u00038\u001c\u0000\u0109\u010b\u0003\b\u0004\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b7\u0001\u0000\u0000\u0000\u010c\u0110\u0005\f\u0000\u0000\u010d"+
		"\u010f\u0003\b\u0004\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005\r\u0000\u0000\u01149\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0003<\u001e\u0000\u0116;\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0003\u0018\f\u0000\u0118=\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0003D\"\u0000\u011a?\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0005\u001e\u0000\u0000\u011c\u011d\u0003B!\u0000\u011d\u011e\u0005\u001f"+
		"\u0000\u0000\u011eA\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0006\u0000"+
		"\u0000\u0120C\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0012\u0000\u0000"+
		"\u0122\u012a\u0005\u001e\u0000\u0000\u0123\u0124\u0005\u0013\u0000\u0000"+
		"\u0124\u012a\u0005\u001e\u0000\u0000\u0125\u0126\u0005\u001e\u0000\u0000"+
		"\u0126\u012a\u0005\u0012\u0000\u0000\u0127\u0128\u0005\u001e\u0000\u0000"+
		"\u0128\u012a\u0005\u0013\u0000\u0000\u0129\u0121\u0001\u0000\u0000\u0000"+
		"\u0129\u0123\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012aE\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005\u000b\u0000\u0000\u012c\u012d\u0005\u001e\u0000\u0000\u012d"+
		"\u012e\u0005\u0014\u0000\u0000\u012e\u012f\u0003H$\u0000\u012f\u0133\u0005"+
		"\u0015\u0000\u0000\u0130\u0132\u0003\u0006\u0003\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134G\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013b\u0003(\u0014"+
		"\u0000\u0137\u013b\u0005\u001e\u0000\u0000\u0138\u013b\u0003N\'\u0000"+
		"\u0139\u013b\u0003J%\u0000\u013a\u0136\u0001\u0000\u0000\u0000\u013a\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013bI\u0001\u0000\u0000\u0000\u013c\u0145\u0005"+
		"\u0007\u0000\u0000\u013d\u0142\u0003L&\u0000\u013e\u013f\u0005\u0005\u0000"+
		"\u0000\u013f\u0141\u0003L&\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u013d\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\b\u0000\u0000\u0148K\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0007\u0007\u0000\u0000\u014aM\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"\u0016\u0000\u0000\u014c\u014d\u0005\u0002\u0000\u0000\u014d\u014e\u0005"+
		"\u001f\u0000\u0000\u014e\u014f\u0005\u0003\u0000\u0000\u014fO\u0001\u0000"+
		"\u0000\u0000\u001cRY_eknv}\u0089\u0091\u0098\u00a2\u00aa\u00d4\u00dd\u00e1"+
		"\u00e7\u00f4\u00fb\u00ff\u0103\u010a\u0110\u0129\u0133\u013a\u0142\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}