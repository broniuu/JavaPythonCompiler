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
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, NUMBER=41, CHAR=42, DOBULE=43, STRING=44, STRING_SMALL=45, 
		BOOL_JAVA=46, BOOL_PYTHON=47, INT_TYPE=48, CHAR_TYPE=49, STRING_TYPE=50, 
		DOUBLE_TYPE=51, FLOAT_TYPE=52, BOOL_TYPE=53, ID=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_java = 1, RULE_python = 2, RULE_p_line = 3, RULE_j_line = 4, 
		RULE_j_function_call = 5, RULE_j_args = 6, RULE_j_arg = 7, RULE_p_function_call = 8, 
		RULE_p_args = 9, RULE_p_arg = 10, RULE_j_declaration = 11, RULE_j_array_declaration = 12, 
		RULE_j_initialization = 13, RULE_j_int_initialization = 14, RULE_j_string_initialization = 15, 
		RULE_j_bool_initialization = 16, RULE_j_float_initialization = 17, RULE_j_double_initialization = 18, 
		RULE_j_char_initialization = 19, RULE_j_array_initialization = 20, RULE_p_assignment = 21, 
		RULE_p_rhs_value = 22, RULE_p_string = 23, RULE_p_list = 24, RULE_j_type = 25, 
		RULE_j_loopFun = 26, RULE_statement = 27, RULE_whileStatement = 28, RULE_conditionStatement = 29, 
		RULE_forStatement = 30, RULE_basicForStatement = 31, RULE_stmt = 32, RULE_block = 33, 
		RULE_forInit = 34, RULE_localVariableDeclaration = 35, RULE_forUpdate = 36, 
		RULE_expression = 37, RULE_condition_greater_less = 38, RULE_condition_equal_unequal = 39, 
		RULE_incDecExpression = 40, RULE_p_forloop = 41, RULE_p_exp = 42, RULE_p_range = 43, 
		RULE_j_if = 44, RULE_j_condition = 45, RULE_p_if = 46, RULE_p_condition = 47, 
		RULE_j_arg_code_block = 48, RULE_j_arg_condition = 49, RULE_j_arg_function = 50, 
		RULE_j_arg_special_function = 51, RULE_j_arg_universal = 52, RULE_p_arg_code_block = 53, 
		RULE_p_arg_condition = 54, RULE_p_arg_function = 55, RULE_p_arg_special_function = 56, 
		RULE_p_arg_universal = 57, RULE_j_seqSeq = 58, RULE_p_seqSeq = 59, RULE_j_choice = 60, 
		RULE_p_choice = 61, RULE_p_repeat = 62, RULE_j_repeat = 63, RULE_j_loop = 64, 
		RULE_p_loop = 65, RULE_j_para = 66, RULE_p_para = 67, RULE_j_cond = 68, 
		RULE_p_cond = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "java", "python", "p_line", "j_line", "j_function_call", "j_args", 
			"j_arg", "p_function_call", "p_args", "p_arg", "j_declaration", "j_array_declaration", 
			"j_initialization", "j_int_initialization", "j_string_initialization", 
			"j_bool_initialization", "j_float_initialization", "j_double_initialization", 
			"j_char_initialization", "j_array_initialization", "p_assignment", "p_rhs_value", 
			"p_string", "p_list", "j_type", "j_loopFun", "statement", "whileStatement", 
			"conditionStatement", "forStatement", "basicForStatement", "stmt", "block", 
			"forInit", "localVariableDeclaration", "forUpdate", "expression", "condition_greater_less", 
			"condition_equal_unequal", "incDecExpression", "p_forloop", "p_exp", 
			"p_range", "j_if", "j_condition", "p_if", "p_condition", "j_arg_code_block", 
			"j_arg_condition", "j_arg_function", "j_arg_special_function", "j_arg_universal", 
			"p_arg_code_block", "p_arg_condition", "p_arg_function", "p_arg_special_function", 
			"p_arg_universal", "j_seqSeq", "p_seqSeq", "j_choice", "p_choice", "p_repeat", 
			"j_repeat", "j_loop", "p_loop", "j_para", "p_para", "j_cond", "p_cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'()'", "','", "'[]'", "'='", "'new'", "'['", 
			"']'", "'{'", "'}'", "'while'", "'for'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'++'", "'--'", "'in'", "':'", "'range'", "'if'", "'||'", 
			"'&&'", "'if '", "'or'", "'and'", "'`'", "'``'", "'~'", "'seqSeq('", 
			"'choice('", "'repeat('", "'Loop('", "'Para('", "'Cond('", null, null, 
			null, null, null, null, null, "'int'", "'char'", "'String'", "'double'", 
			"'float'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMBER", "CHAR", "DOBULE", "STRING", "STRING_SMALL", 
			"BOOL_JAVA", "BOOL_PYTHON", "INT_TYPE", "CHAR_TYPE", "STRING_TYPE", "DOUBLE_TYPE", 
			"FLOAT_TYPE", "BOOL_TYPE", "ID", "WS"
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

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public J_seqSeqContext j_seqSeq() {
			return getRuleContext(J_seqSeqContext.class,0);
		}
		public P_seqSeqContext p_seqSeq() {
			return getRuleContext(P_seqSeqContext.class,0);
		}
		public J_choiceContext j_choice() {
			return getRuleContext(J_choiceContext.class,0);
		}
		public P_choiceContext p_choice() {
			return getRuleContext(P_choiceContext.class,0);
		}
		public J_repeatContext j_repeat() {
			return getRuleContext(J_repeatContext.class,0);
		}
		public P_repeatContext p_repeat() {
			return getRuleContext(P_repeatContext.class,0);
		}
		public J_loopContext j_loop() {
			return getRuleContext(J_loopContext.class,0);
		}
		public P_loopContext p_loop() {
			return getRuleContext(P_loopContext.class,0);
		}
		public J_paraContext j_para() {
			return getRuleContext(J_paraContext.class,0);
		}
		public P_paraContext p_para() {
			return getRuleContext(P_paraContext.class,0);
		}
		public J_condContext j_cond() {
			return getRuleContext(J_condContext.class,0);
		}
		public P_condContext p_cond() {
			return getRuleContext(P_condContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(140);
				j_seqSeq();
				}
				break;
			case 2:
				{
				setState(141);
				p_seqSeq();
				}
				break;
			case 3:
				{
				setState(142);
				j_choice();
				}
				break;
			case 4:
				{
				setState(143);
				p_choice();
				}
				break;
			case 5:
				{
				setState(144);
				j_repeat();
				}
				break;
			case 6:
				{
				setState(145);
				p_repeat();
				}
				break;
			case 7:
				{
				setState(146);
				j_loop();
				}
				break;
			case 8:
				{
				setState(147);
				p_loop();
				}
				break;
			case 9:
				{
				setState(148);
				j_para();
				}
				break;
			case 10:
				{
				setState(149);
				p_para();
				}
				break;
			case 11:
				{
				setState(150);
				j_cond();
				}
				break;
			case 12:
				{
				setState(151);
				p_cond();
				}
				break;
			}
			setState(154);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJava(this);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35747322109386752L) != 0) {
				{
				{
				setState(156);
				j_line();
				}
				}
				setState(161);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPython(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPython(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPython(this);
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
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014399046369280L) != 0) {
				{
				{
				setState(162);
				p_line();
				}
				}
				setState(167);
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
		public P_assignmentContext p_assignment() {
			return getRuleContext(P_assignmentContext.class,0);
		}
		public P_forloopContext p_forloop() {
			return getRuleContext(P_forloopContext.class,0);
		}
		public P_ifContext p_if() {
			return getRuleContext(P_ifContext.class,0);
		}
		public P_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_lineContext p_line() throws RecognitionException {
		P_lineContext _localctx = new P_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_p_line);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				p_function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				p_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				p_forloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				p_if();
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
	public static class J_lineContext extends ParserRuleContext {
		public J_declarationContext j_declaration() {
			return getRuleContext(J_declarationContext.class,0);
		}
		public J_array_declarationContext j_array_declaration() {
			return getRuleContext(J_array_declarationContext.class,0);
		}
		public J_initializationContext j_initialization() {
			return getRuleContext(J_initializationContext.class,0);
		}
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public J_loopFunContext j_loopFun() {
			return getRuleContext(J_loopFunContext.class,0);
		}
		public J_ifContext j_if() {
			return getRuleContext(J_ifContext.class,0);
		}
		public J_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_lineContext j_line() throws RecognitionException {
		J_lineContext _localctx = new J_lineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_j_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(174);
				j_declaration();
				}
				break;
			case 2:
				{
				setState(175);
				j_array_declaration();
				}
				break;
			case 3:
				{
				setState(176);
				j_initialization();
				}
				break;
			case 4:
				{
				setState(177);
				j_function_call();
				}
				break;
			case 5:
				{
				setState(178);
				j_loopFun();
				}
				break;
			case 6:
				{
				setState(179);
				j_if();
				}
				break;
			}
			setState(182);
			match(T__0);
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
	public static class J_function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public J_argsContext j_args() {
			return getRuleContext(J_argsContext.class,0);
		}
		public J_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_function_callContext j_function_call() throws RecognitionException {
		J_function_callContext _localctx = new J_function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_j_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(185);
				match(T__1);
				setState(186);
				j_args();
				setState(187);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(189);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_args(this);
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
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					j_arg();
					setState(193);
					match(T__4);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(200);
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
		public TerminalNode BOOL_JAVA() { return getToken(GrammarParser.BOOL_JAVA, 0); }
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public J_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argContext j_arg() throws RecognitionException {
		J_argContext _localctx = new J_argContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_j_arg);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(BOOL_JAVA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				j_function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(ID);
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
	public static class P_function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public P_argsContext p_args() {
			return getRuleContext(P_argsContext.class,0);
		}
		public P_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_function_callContext p_function_call() throws RecognitionException {
		P_function_callContext _localctx = new P_function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_p_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(210);
				match(T__1);
				setState(211);
				p_args();
				setState(212);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(214);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_args(this);
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
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					p_arg();
					setState(218);
					match(T__4);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(225);
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
		public TerminalNode BOOL_PYTHON() { return getToken(GrammarParser.BOOL_PYTHON, 0); }
		public P_stringContext p_string() {
			return getRuleContext(P_stringContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public P_function_callContext p_function_call() {
			return getRuleContext(P_function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public P_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_argContext p_arg() throws RecognitionException {
		P_argContext _localctx = new P_argContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_p_arg);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(BOOL_PYTHON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				p_string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				p_function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(ID);
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
	public static class J_declarationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GrammarParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GrammarParser.STRING_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GrammarParser.BOOL_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GrammarParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(GrammarParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GrammarParser.CHAR_TYPE, 0); }
		public J_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_declarationContext j_declaration() throws RecognitionException {
		J_declarationContext _localctx = new J_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_j_declaration);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(INT_TYPE);
				setState(235);
				match(ID);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(STRING_TYPE);
				setState(237);
				match(ID);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(BOOL_TYPE);
				setState(239);
				match(ID);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(FLOAT_TYPE);
				setState(241);
				match(ID);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(DOUBLE_TYPE);
				setState(243);
				match(ID);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(CHAR_TYPE);
				setState(245);
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
	public static class J_array_declarationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GrammarParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GrammarParser.STRING_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GrammarParser.BOOL_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GrammarParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(GrammarParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GrammarParser.CHAR_TYPE, 0); }
		public J_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_array_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_array_declarationContext j_array_declaration() throws RecognitionException {
		J_array_declarationContext _localctx = new J_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_j_array_declaration);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(INT_TYPE);
				setState(249);
				match(T__5);
				setState(250);
				match(ID);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(STRING_TYPE);
				setState(252);
				match(T__5);
				setState(253);
				match(ID);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(BOOL_TYPE);
				setState(255);
				match(T__5);
				setState(256);
				match(ID);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(FLOAT_TYPE);
				setState(258);
				match(T__5);
				setState(259);
				match(ID);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(DOUBLE_TYPE);
				setState(261);
				match(T__5);
				setState(262);
				match(ID);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(CHAR_TYPE);
				setState(264);
				match(T__5);
				setState(265);
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
		public J_array_initializationContext j_array_initialization() {
			return getRuleContext(J_array_initializationContext.class,0);
		}
		public J_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_initializationContext j_initialization() throws RecognitionException {
		J_initializationContext _localctx = new J_initializationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j_initialization);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				j_int_initialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				j_float_initialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				j_double_initialization();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				j_bool_initialization();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				j_string_initialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				j_char_initialization();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				j_array_initialization();
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
	public static class J_int_initializationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GrammarParser.INT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public J_int_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_int_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_int_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_int_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_int_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_int_initializationContext j_int_initialization() throws RecognitionException {
		J_int_initializationContext _localctx = new J_int_initializationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_j_int_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(INT_TYPE);
			setState(278);
			match(ID);
			setState(279);
			match(T__6);
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
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
		public TerminalNode STRING_TYPE() { return getToken(GrammarParser.STRING_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public J_string_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_string_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_string_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_string_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_string_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_string_initializationContext j_string_initialization() throws RecognitionException {
		J_string_initializationContext _localctx = new J_string_initializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_j_string_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STRING_TYPE);
			setState(283);
			match(ID);
			setState(284);
			match(T__6);
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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
		public TerminalNode BOOL_TYPE() { return getToken(GrammarParser.BOOL_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode BOOL_JAVA() { return getToken(GrammarParser.BOOL_JAVA, 0); }
		public J_bool_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_bool_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_bool_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_bool_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_bool_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_bool_initializationContext j_bool_initialization() throws RecognitionException {
		J_bool_initializationContext _localctx = new J_bool_initializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_j_bool_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BOOL_TYPE);
			setState(288);
			match(ID);
			setState(289);
			match(T__6);
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==BOOL_JAVA || _la==ID) ) {
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
		public TerminalNode FLOAT_TYPE() { return getToken(GrammarParser.FLOAT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOBULE() { return getToken(GrammarParser.DOBULE, 0); }
		public J_float_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_float_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_float_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_float_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_float_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_float_initializationContext j_float_initialization() throws RecognitionException {
		J_float_initializationContext _localctx = new J_float_initializationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_j_float_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(FLOAT_TYPE);
			setState(293);
			match(ID);
			setState(294);
			match(T__6);
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==DOBULE || _la==ID) ) {
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
		public TerminalNode DOUBLE_TYPE() { return getToken(GrammarParser.DOUBLE_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOBULE() { return getToken(GrammarParser.DOBULE, 0); }
		public J_double_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_double_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_double_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_double_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_double_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_double_initializationContext j_double_initialization() throws RecognitionException {
		J_double_initializationContext _localctx = new J_double_initializationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_j_double_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(DOUBLE_TYPE);
			setState(298);
			match(ID);
			setState(299);
			match(T__6);
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==DOBULE || _la==ID) ) {
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
		public TerminalNode CHAR_TYPE() { return getToken(GrammarParser.CHAR_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public J_char_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_char_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_char_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_char_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_char_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_char_initializationContext j_char_initialization() throws RecognitionException {
		J_char_initializationContext _localctx = new J_char_initializationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_j_char_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CHAR_TYPE);
			setState(303);
			match(ID);
			setState(304);
			match(T__6);
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==ID) ) {
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
	public static class J_array_initializationContext extends ParserRuleContext {
		public List<TerminalNode> INT_TYPE() { return getTokens(GrammarParser.INT_TYPE); }
		public TerminalNode INT_TYPE(int i) {
			return getToken(GrammarParser.INT_TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<TerminalNode> STRING_TYPE() { return getTokens(GrammarParser.STRING_TYPE); }
		public TerminalNode STRING_TYPE(int i) {
			return getToken(GrammarParser.STRING_TYPE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarParser.STRING, i);
		}
		public List<TerminalNode> BOOL_TYPE() { return getTokens(GrammarParser.BOOL_TYPE); }
		public TerminalNode BOOL_TYPE(int i) {
			return getToken(GrammarParser.BOOL_TYPE, i);
		}
		public List<TerminalNode> BOOL_JAVA() { return getTokens(GrammarParser.BOOL_JAVA); }
		public TerminalNode BOOL_JAVA(int i) {
			return getToken(GrammarParser.BOOL_JAVA, i);
		}
		public List<TerminalNode> FLOAT_TYPE() { return getTokens(GrammarParser.FLOAT_TYPE); }
		public TerminalNode FLOAT_TYPE(int i) {
			return getToken(GrammarParser.FLOAT_TYPE, i);
		}
		public List<TerminalNode> DOBULE() { return getTokens(GrammarParser.DOBULE); }
		public TerminalNode DOBULE(int i) {
			return getToken(GrammarParser.DOBULE, i);
		}
		public List<TerminalNode> DOUBLE_TYPE() { return getTokens(GrammarParser.DOUBLE_TYPE); }
		public TerminalNode DOUBLE_TYPE(int i) {
			return getToken(GrammarParser.DOUBLE_TYPE, i);
		}
		public List<TerminalNode> CHAR_TYPE() { return getTokens(GrammarParser.CHAR_TYPE); }
		public TerminalNode CHAR_TYPE(int i) {
			return getToken(GrammarParser.CHAR_TYPE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(GrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(GrammarParser.CHAR, i);
		}
		public J_array_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_array_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_array_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_array_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_array_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_array_initializationContext j_array_initialization() throws RecognitionException {
		J_array_initializationContext _localctx = new J_array_initializationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_j_array_initialization);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(INT_TYPE);
				setState(308);
				match(T__5);
				setState(309);
				match(ID);
				setState(310);
				match(T__6);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(311);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(312);
					match(T__7);
					setState(313);
					match(INT_TYPE);
					setState(314);
					match(T__8);
					setState(315);
					match(NUMBER);
					setState(316);
					match(T__9);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(317);
						match(T__10);
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(318);
							match(NUMBER);
							setState(323);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(319);
								match(T__4);
								setState(320);
								match(NUMBER);
								}
								}
								setState(325);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(328);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(331);
						match(T__7);
						setState(332);
						match(INT_TYPE);
						setState(333);
						match(T__5);
						}
					}

					setState(336);
					match(T__10);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUMBER) {
						{
						setState(337);
						match(NUMBER);
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(338);
							match(T__4);
							setState(339);
							match(NUMBER);
							}
							}
							setState(344);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(347);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(STRING_TYPE);
				setState(351);
				match(T__5);
				setState(352);
				match(ID);
				setState(353);
				match(T__6);
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(354);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(355);
					match(T__7);
					setState(356);
					match(STRING_TYPE);
					setState(357);
					match(T__8);
					setState(358);
					match(NUMBER);
					setState(359);
					match(T__9);
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(360);
						match(T__10);
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==STRING) {
							{
							setState(361);
							match(STRING);
							setState(366);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(362);
								match(T__4);
								setState(363);
								match(STRING);
								}
								}
								setState(368);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(371);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(374);
						match(T__7);
						setState(375);
						match(STRING_TYPE);
						setState(376);
						match(T__5);
						}
					}

					setState(379);
					match(T__10);
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STRING) {
						{
						setState(380);
						match(STRING);
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(381);
							match(T__4);
							setState(382);
							match(STRING);
							}
							}
							setState(387);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(390);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(BOOL_TYPE);
				setState(394);
				match(T__5);
				setState(395);
				match(ID);
				setState(396);
				match(T__6);
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(397);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(398);
					match(T__7);
					setState(399);
					match(BOOL_TYPE);
					setState(400);
					match(T__8);
					setState(401);
					match(NUMBER);
					setState(402);
					match(T__9);
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(403);
						match(T__10);
						setState(412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BOOL_JAVA) {
							{
							setState(404);
							match(BOOL_JAVA);
							setState(409);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(405);
								match(T__4);
								setState(406);
								match(BOOL_JAVA);
								}
								}
								setState(411);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(414);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(417);
						match(T__7);
						setState(418);
						match(BOOL_TYPE);
						setState(419);
						match(T__5);
						}
					}

					setState(422);
					match(T__10);
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BOOL_JAVA) {
						{
						setState(423);
						match(BOOL_JAVA);
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(424);
							match(T__4);
							setState(425);
							match(BOOL_JAVA);
							}
							}
							setState(430);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(433);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				match(FLOAT_TYPE);
				setState(437);
				match(T__5);
				setState(438);
				match(ID);
				setState(439);
				match(T__6);
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(440);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(441);
					match(T__7);
					setState(442);
					match(FLOAT_TYPE);
					setState(443);
					match(T__8);
					setState(444);
					match(NUMBER);
					setState(445);
					match(T__9);
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(446);
						match(T__10);
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOBULE) {
							{
							setState(447);
							match(DOBULE);
							setState(452);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(448);
								match(T__4);
								setState(449);
								match(DOBULE);
								}
								}
								setState(454);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(457);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(460);
						match(T__7);
						setState(461);
						match(FLOAT_TYPE);
						setState(462);
						match(T__5);
						}
					}

					setState(465);
					match(T__10);
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOBULE) {
						{
						setState(466);
						match(DOBULE);
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(467);
							match(T__4);
							setState(468);
							match(DOBULE);
							}
							}
							setState(473);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(476);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				match(DOUBLE_TYPE);
				setState(480);
				match(T__5);
				setState(481);
				match(ID);
				setState(482);
				match(T__6);
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(483);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(484);
					match(T__7);
					setState(485);
					match(DOUBLE_TYPE);
					setState(486);
					match(T__8);
					setState(487);
					match(NUMBER);
					setState(488);
					match(T__9);
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(489);
						match(T__10);
						setState(498);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOBULE) {
							{
							setState(490);
							match(DOBULE);
							setState(495);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(491);
								match(T__4);
								setState(492);
								match(DOBULE);
								}
								}
								setState(497);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(500);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(503);
						match(T__7);
						setState(504);
						match(DOUBLE_TYPE);
						setState(505);
						match(T__5);
						}
					}

					setState(508);
					match(T__10);
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOBULE) {
						{
						setState(509);
						match(DOBULE);
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(510);
							match(T__4);
							setState(511);
							match(DOBULE);
							}
							}
							setState(516);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(519);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				match(CHAR_TYPE);
				setState(523);
				match(T__5);
				setState(524);
				match(ID);
				setState(525);
				match(T__6);
				setState(563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(526);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(527);
					match(T__7);
					setState(528);
					match(CHAR_TYPE);
					setState(529);
					match(T__8);
					setState(530);
					match(NUMBER);
					setState(531);
					match(T__9);
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(532);
						match(T__10);
						setState(541);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CHAR) {
							{
							setState(533);
							match(CHAR);
							setState(538);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(534);
								match(T__4);
								setState(535);
								match(CHAR);
								}
								}
								setState(540);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(543);
						match(T__11);
						}
					}

					}
					}
					break;
				case 3:
					{
					{
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(546);
						match(T__7);
						setState(547);
						match(CHAR_TYPE);
						setState(548);
						match(T__5);
						}
					}

					setState(551);
					match(T__10);
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHAR) {
						{
						setState(552);
						match(CHAR);
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(553);
							match(T__4);
							setState(554);
							match(CHAR);
							}
							}
							setState(559);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(562);
					match(T__11);
					}
					}
					break;
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
	public static class P_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public P_rhs_valueContext p_rhs_value() {
			return getRuleContext(P_rhs_valueContext.class,0);
		}
		public P_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_assignmentContext p_assignment() throws RecognitionException {
		P_assignmentContext _localctx = new P_assignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_p_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(ID);
			setState(568);
			match(T__6);
			setState(569);
			p_rhs_value();
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
	public static class P_rhs_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode BOOL_PYTHON() { return getToken(GrammarParser.BOOL_PYTHON, 0); }
		public P_stringContext p_string() {
			return getRuleContext(P_stringContext.class,0);
		}
		public P_listContext p_list() {
			return getRuleContext(P_listContext.class,0);
		}
		public P_rhs_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_rhs_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_rhs_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_rhs_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_rhs_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_rhs_valueContext p_rhs_value() throws RecognitionException {
		P_rhs_valueContext _localctx = new P_rhs_valueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_p_rhs_value);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				match(NUMBER);
				}
				break;
			case BOOL_PYTHON:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(BOOL_PYTHON);
				}
				break;
			case STRING:
			case STRING_SMALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				p_string();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
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
	public static class P_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode STRING_SMALL() { return getToken(GrammarParser.STRING_SMALL, 0); }
		public P_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_stringContext p_string() throws RecognitionException {
		P_stringContext _localctx = new P_stringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_p_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_SMALL) ) {
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
	public static class P_listContext extends ParserRuleContext {
		public List<P_rhs_valueContext> p_rhs_value() {
			return getRuleContexts(P_rhs_valueContext.class);
		}
		public P_rhs_valueContext p_rhs_value(int i) {
			return getRuleContext(P_rhs_valueContext.class,i);
		}
		public P_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_listContext p_list() throws RecognitionException {
		P_listContext _localctx = new P_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_p_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__8);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 18210111579226624L) != 0) {
				{
				setState(581);
				p_rhs_value();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(582);
					match(T__4);
					setState(583);
					p_rhs_value();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(591);
			match(T__9);
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
		public TerminalNode INT_TYPE() { return getToken(GrammarParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GrammarParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GrammarParser.STRING_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(GrammarParser.DOUBLE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GrammarParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GrammarParser.BOOL_TYPE, 0); }
		public J_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_typeContext j_type() throws RecognitionException {
		J_typeContext _localctx = new J_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_j_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0) ) {
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
	public static class J_loopFunContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public J_loopFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_loopFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_loopFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_loopFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_loopFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_loopFunContext j_loopFun() throws RecognitionException {
		J_loopFunContext _localctx = new J_loopFunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_j_loopFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T__12);
			setState(602);
			match(T__1);
			setState(603);
			conditionStatement();
			setState(604);
			match(T__2);
			setState(605);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Condition_greater_lessContext condition_greater_less() {
			return getRuleContext(Condition_greater_lessContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode BOOL_JAVA() { return getToken(GrammarParser.BOOL_JAVA, 0); }
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditionStatement);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(ID);
				setState(608);
				condition_greater_less();
				setState(609);
				match(NUMBER);
				}
				break;
			case BOOL_JAVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(BOOL_JAVA);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__13);
			setState(617);
			match(T__1);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE) {
				{
				setState(618);
				forInit();
				}
			}

			setState(621);
			match(T__0);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(622);
				expression();
				}
			}

			setState(625);
			match(T__0);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398515773440L) != 0) {
				{
				setState(626);
				forUpdate();
				}
			}

			setState(629);
			match(T__2);
			setState(630);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stmt);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				block();
				}
				break;
			case T__12:
			case T__13:
			case T__25:
			case INT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(T__10);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35747322109386752L) != 0) {
				{
				{
				setState(637);
				j_line();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			match(T__11);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Condition_greater_lessContext condition_greater_less() {
			return getRuleContext(Condition_greater_lessContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(ID);
			setState(652);
			condition_greater_less();
			setState(653);
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
	public static class Condition_greater_lessContext extends ParserRuleContext {
		public Condition_greater_lessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_greater_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition_greater_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition_greater_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondition_greater_less(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_greater_lessContext condition_greater_less() throws RecognitionException {
		Condition_greater_lessContext _localctx = new Condition_greater_lessContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_condition_greater_less);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
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
	public static class Condition_equal_unequalContext extends ParserRuleContext {
		public Condition_equal_unequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_equal_unequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition_equal_unequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition_equal_unequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondition_equal_unequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_equal_unequalContext condition_equal_unequal() throws RecognitionException {
		Condition_equal_unequalContext _localctx = new Condition_equal_unequalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition_equal_unequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IncDecExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecExpressionContext incDecExpression() throws RecognitionException {
		IncDecExpressionContext _localctx = new IncDecExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_incDecExpression);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(T__20);
				setState(660);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(T__21);
				setState(662);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(ID);
				setState(664);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(ID);
				setState(666);
				match(T__21);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_forloopContext p_forloop() throws RecognitionException {
		P_forloopContext _localctx = new P_forloopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_p_forloop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__13);
			setState(670);
			match(ID);
			setState(671);
			match(T__22);
			setState(672);
			p_exp();
			setState(673);
			match(T__23);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(674);
					p_line();
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
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
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_expContext p_exp() throws RecognitionException {
		P_expContext _localctx = new P_expContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_p_exp);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case STRING_SMALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				p_string();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(ID);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				p_range();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
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
	public static class P_rangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public P_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_rangeContext p_range() throws RecognitionException {
		P_rangeContext _localctx = new P_rangeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_p_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__24);
			setState(687);
			match(T__1);
			setState(688);
			match(NUMBER);
			setState(689);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_ifContext extends ParserRuleContext {
		public List<J_conditionContext> j_condition() {
			return getRuleContexts(J_conditionContext.class);
		}
		public J_conditionContext j_condition(int i) {
			return getRuleContext(J_conditionContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public J_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_ifContext j_if() throws RecognitionException {
		J_ifContext _localctx = new J_ifContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_j_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__25);
			setState(692);
			match(T__1);
			setState(693);
			j_condition();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__27) {
				{
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				j_condition();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(T__2);
			setState(702);
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
	public static class J_conditionContext extends ParserRuleContext {
		public List<TerminalNode> BOOL_JAVA() { return getTokens(GrammarParser.BOOL_JAVA); }
		public TerminalNode BOOL_JAVA(int i) {
			return getToken(GrammarParser.BOOL_JAVA, i);
		}
		public List<J_function_callContext> j_function_call() {
			return getRuleContexts(J_function_callContext.class);
		}
		public J_function_callContext j_function_call(int i) {
			return getRuleContext(J_function_callContext.class,i);
		}
		public Condition_equal_unequalContext condition_equal_unequal() {
			return getRuleContext(Condition_equal_unequalContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<TerminalNode> DOBULE() { return getTokens(GrammarParser.DOBULE); }
		public TerminalNode DOBULE(int i) {
			return getToken(GrammarParser.DOBULE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(GrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(GrammarParser.CHAR, i);
		}
		public List<IncDecExpressionContext> incDecExpression() {
			return getRuleContexts(IncDecExpressionContext.class);
		}
		public IncDecExpressionContext incDecExpression(int i) {
			return getRuleContext(IncDecExpressionContext.class,i);
		}
		public Condition_greater_lessContext condition_greater_less() {
			return getRuleContext(Condition_greater_lessContext.class,0);
		}
		public J_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_conditionContext j_condition() throws RecognitionException {
		J_conditionContext _localctx = new J_conditionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_j_condition);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(BOOL_JAVA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				j_function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				_la = _input.LA(1);
				if ( !(_la==BOOL_JAVA || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(707);
				condition_equal_unequal();
				setState(708);
				_la = _input.LA(1);
				if ( !(_la==BOOL_JAVA || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(711);
				condition_equal_unequal();
				setState(712);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(714);
					match(ID);
					}
					break;
				case 2:
					{
					setState(715);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(716);
					match(DOBULE);
					}
					break;
				case 4:
					{
					setState(717);
					match(CHAR);
					}
					break;
				case 5:
					{
					setState(718);
					incDecExpression();
					}
					break;
				case 6:
					{
					setState(719);
					j_function_call();
					}
					break;
				}
				setState(724);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(722);
					condition_greater_less();
					}
					break;
				case T__18:
				case T__19:
					{
					setState(723);
					condition_equal_unequal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(726);
					match(ID);
					}
					break;
				case 2:
					{
					setState(727);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(728);
					match(DOBULE);
					}
					break;
				case 4:
					{
					setState(729);
					match(CHAR);
					}
					break;
				case 5:
					{
					setState(730);
					incDecExpression();
					}
					break;
				case 6:
					{
					setState(731);
					j_function_call();
					}
					break;
				}
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
	public static class P_ifContext extends ParserRuleContext {
		public List<P_conditionContext> p_condition() {
			return getRuleContexts(P_conditionContext.class);
		}
		public P_conditionContext p_condition(int i) {
			return getRuleContext(P_conditionContext.class,i);
		}
		public List<P_lineContext> p_line() {
			return getRuleContexts(P_lineContext.class);
		}
		public P_lineContext p_line(int i) {
			return getRuleContext(P_lineContext.class,i);
		}
		public P_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_ifContext p_if() throws RecognitionException {
		P_ifContext _localctx = new P_ifContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_p_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(T__28);
			setState(737);
			p_condition();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(738);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(739);
				p_condition();
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
			match(T__23);
			setState(747); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(746);
					p_line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(749); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class P_conditionContext extends ParserRuleContext {
		public TerminalNode BOOL_PYTHON() { return getToken(GrammarParser.BOOL_PYTHON, 0); }
		public List<P_function_callContext> p_function_call() {
			return getRuleContexts(P_function_callContext.class);
		}
		public P_function_callContext p_function_call(int i) {
			return getRuleContext(P_function_callContext.class,i);
		}
		public Condition_equal_unequalContext condition_equal_unequal() {
			return getRuleContext(Condition_equal_unequalContext.class,0);
		}
		public List<TerminalNode> STRING_SMALL() { return getTokens(GrammarParser.STRING_SMALL); }
		public TerminalNode STRING_SMALL(int i) {
			return getToken(GrammarParser.STRING_SMALL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<TerminalNode> DOBULE() { return getTokens(GrammarParser.DOBULE); }
		public TerminalNode DOBULE(int i) {
			return getToken(GrammarParser.DOBULE, i);
		}
		public Condition_greater_lessContext condition_greater_less() {
			return getRuleContext(Condition_greater_lessContext.class,0);
		}
		public P_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_conditionContext p_condition() throws RecognitionException {
		P_conditionContext _localctx = new P_conditionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_p_condition);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(BOOL_PYTHON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				p_function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 18067175067615232L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(754);
				condition_equal_unequal();
				setState(755);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 18067175067615232L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(757);
					match(ID);
					}
					break;
				case 2:
					{
					setState(758);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(759);
					match(DOBULE);
					}
					break;
				case 4:
					{
					setState(760);
					p_function_call();
					}
					break;
				}
				setState(765);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(763);
					condition_greater_less();
					}
					break;
				case T__18:
				case T__19:
					{
					setState(764);
					condition_equal_unequal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(767);
					match(ID);
					}
					break;
				case 2:
					{
					setState(768);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(769);
					match(DOBULE);
					}
					break;
				case 4:
					{
					setState(770);
					p_function_call();
					}
					break;
				}
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
	public static class J_arg_code_blockContext extends ParserRuleContext {
		public JavaContext java() {
			return getRuleContext(JavaContext.class,0);
		}
		public J_arg_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg_code_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg_code_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg_code_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_arg_code_blockContext j_arg_code_block() throws RecognitionException {
		J_arg_code_blockContext _localctx = new J_arg_code_blockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_j_arg_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(775);
			match(T__31);
			setState(776);
			java();
			setState(777);
			match(T__31);
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
	public static class J_arg_conditionContext extends ParserRuleContext {
		public J_conditionContext j_condition() {
			return getRuleContext(J_conditionContext.class,0);
		}
		public J_arg_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_arg_conditionContext j_arg_condition() throws RecognitionException {
		J_arg_conditionContext _localctx = new J_arg_conditionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_j_arg_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(T__32);
			setState(780);
			j_condition();
			setState(781);
			match(T__32);
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
	public static class J_arg_functionContext extends ParserRuleContext {
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public J_arg_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_arg_functionContext j_arg_function() throws RecognitionException {
		J_arg_functionContext _localctx = new J_arg_functionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_j_arg_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T__33);
			setState(784);
			j_function_call();
			setState(785);
			match(T__33);
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
	public static class J_arg_special_functionContext extends ParserRuleContext {
		public J_seqSeqContext j_seqSeq() {
			return getRuleContext(J_seqSeqContext.class,0);
		}
		public J_arg_special_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg_special_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg_special_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg_special_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg_special_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_arg_special_functionContext j_arg_special_function() throws RecognitionException {
		J_arg_special_functionContext _localctx = new J_arg_special_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_j_arg_special_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			j_seqSeq();
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
	public static class J_arg_universalContext extends ParserRuleContext {
		public J_arg_code_blockContext j_arg_code_block() {
			return getRuleContext(J_arg_code_blockContext.class,0);
		}
		public J_arg_functionContext j_arg_function() {
			return getRuleContext(J_arg_functionContext.class,0);
		}
		public J_arg_special_functionContext j_arg_special_function() {
			return getRuleContext(J_arg_special_functionContext.class,0);
		}
		public J_arg_universalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_arg_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_arg_universal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_arg_universal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_arg_universal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_arg_universalContext j_arg_universal() throws RecognitionException {
		J_arg_universalContext _localctx = new J_arg_universalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_j_arg_universal);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				j_arg_code_block();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				j_arg_function();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				j_arg_special_function();
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
	public static class P_arg_code_blockContext extends ParserRuleContext {
		public PythonContext python() {
			return getRuleContext(PythonContext.class,0);
		}
		public P_arg_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg_code_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg_code_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg_code_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_arg_code_blockContext p_arg_code_block() throws RecognitionException {
		P_arg_code_blockContext _localctx = new P_arg_code_blockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_p_arg_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(794);
			match(T__31);
			setState(795);
			python();
			setState(796);
			match(T__31);
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
	public static class P_arg_conditionContext extends ParserRuleContext {
		public P_conditionContext p_condition() {
			return getRuleContext(P_conditionContext.class,0);
		}
		public P_arg_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_arg_conditionContext p_arg_condition() throws RecognitionException {
		P_arg_conditionContext _localctx = new P_arg_conditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_p_arg_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(T__32);
			setState(799);
			p_condition();
			setState(800);
			match(T__32);
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
	public static class P_arg_functionContext extends ParserRuleContext {
		public P_function_callContext p_function_call() {
			return getRuleContext(P_function_callContext.class,0);
		}
		public P_arg_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_arg_functionContext p_arg_function() throws RecognitionException {
		P_arg_functionContext _localctx = new P_arg_functionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_p_arg_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(T__33);
			setState(803);
			p_function_call();
			setState(804);
			match(T__33);
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
	public static class P_arg_special_functionContext extends ParserRuleContext {
		public P_seqSeqContext p_seqSeq() {
			return getRuleContext(P_seqSeqContext.class,0);
		}
		public P_arg_special_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg_special_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg_special_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg_special_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg_special_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_arg_special_functionContext p_arg_special_function() throws RecognitionException {
		P_arg_special_functionContext _localctx = new P_arg_special_functionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_p_arg_special_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			p_seqSeq();
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
	public static class P_arg_universalContext extends ParserRuleContext {
		public P_arg_code_blockContext p_arg_code_block() {
			return getRuleContext(P_arg_code_blockContext.class,0);
		}
		public P_arg_functionContext p_arg_function() {
			return getRuleContext(P_arg_functionContext.class,0);
		}
		public P_arg_special_functionContext p_arg_special_function() {
			return getRuleContext(P_arg_special_functionContext.class,0);
		}
		public P_arg_universalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_arg_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_arg_universal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_arg_universal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_arg_universal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_arg_universalContext p_arg_universal() throws RecognitionException {
		P_arg_universalContext _localctx = new P_arg_universalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_p_arg_universal);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				p_arg_code_block();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				p_arg_function();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				p_arg_special_function();
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
	public static class J_seqSeqContext extends ParserRuleContext {
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_seqSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_seqSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_seqSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_seqSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_seqSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_seqSeqContext j_seqSeq() throws RecognitionException {
		J_seqSeqContext _localctx = new J_seqSeqContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_j_seqSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__34);
			setState(814);
			j_arg_universal();
			setState(815);
			match(T__4);
			setState(816);
			j_arg_universal();
			setState(817);
			match(T__4);
			setState(818);
			j_arg_universal();
			setState(819);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_seqSeqContext extends ParserRuleContext {
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_seqSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_seqSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_seqSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_seqSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_seqSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_seqSeqContext p_seqSeq() throws RecognitionException {
		P_seqSeqContext _localctx = new P_seqSeqContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_p_seqSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(T__34);
			setState(822);
			p_arg_universal();
			setState(823);
			match(T__4);
			setState(824);
			p_arg_universal();
			setState(825);
			match(T__4);
			setState(826);
			p_arg_universal();
			setState(827);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_choiceContext extends ParserRuleContext {
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_choiceContext j_choice() throws RecognitionException {
		J_choiceContext _localctx = new J_choiceContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_j_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(T__35);
			setState(830);
			j_arg_universal();
			setState(831);
			match(T__4);
			setState(832);
			j_arg_universal();
			setState(833);
			match(T__4);
			setState(834);
			j_arg_universal();
			setState(835);
			match(T__4);
			setState(836);
			j_arg_universal();
			setState(837);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_choiceContext extends ParserRuleContext {
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_choiceContext p_choice() throws RecognitionException {
		P_choiceContext _localctx = new P_choiceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_p_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(T__35);
			setState(840);
			p_arg_universal();
			setState(841);
			match(T__4);
			setState(842);
			p_arg_universal();
			setState(843);
			match(T__4);
			setState(844);
			p_arg_universal();
			setState(845);
			match(T__4);
			setState(846);
			p_arg_universal();
			setState(847);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_repeatContext extends ParserRuleContext {
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_arg_conditionContext p_arg_condition() {
			return getRuleContext(P_arg_conditionContext.class,0);
		}
		public P_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_repeatContext p_repeat() throws RecognitionException {
		P_repeatContext _localctx = new P_repeatContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_p_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__36);
			setState(850);
			p_arg_universal();
			setState(851);
			match(T__4);
			setState(852);
			p_arg_universal();
			setState(853);
			match(T__4);
			setState(854);
			p_arg_condition();
			setState(855);
			match(T__4);
			setState(856);
			p_arg_universal();
			setState(857);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_repeatContext extends ParserRuleContext {
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_arg_conditionContext j_arg_condition() {
			return getRuleContext(J_arg_conditionContext.class,0);
		}
		public J_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_repeatContext j_repeat() throws RecognitionException {
		J_repeatContext _localctx = new J_repeatContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_j_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(T__36);
			setState(860);
			j_arg_universal();
			setState(861);
			match(T__4);
			setState(862);
			j_arg_universal();
			setState(863);
			match(T__4);
			setState(864);
			j_arg_condition();
			setState(865);
			match(T__4);
			setState(866);
			j_arg_universal();
			setState(867);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_loopContext extends ParserRuleContext {
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_arg_conditionContext j_arg_condition() {
			return getRuleContext(J_arg_conditionContext.class,0);
		}
		public J_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_loopContext j_loop() throws RecognitionException {
		J_loopContext _localctx = new J_loopContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_j_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(T__37);
			setState(870);
			j_arg_universal();
			setState(871);
			match(T__4);
			setState(872);
			j_arg_condition();
			setState(873);
			match(T__4);
			setState(874);
			j_arg_universal();
			setState(875);
			match(T__4);
			setState(876);
			j_arg_universal();
			setState(877);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_loopContext extends ParserRuleContext {
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_arg_conditionContext p_arg_condition() {
			return getRuleContext(P_arg_conditionContext.class,0);
		}
		public P_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_loopContext p_loop() throws RecognitionException {
		P_loopContext _localctx = new P_loopContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_p_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__37);
			setState(880);
			p_arg_universal();
			setState(881);
			match(T__4);
			setState(882);
			p_arg_condition();
			setState(883);
			match(T__4);
			setState(884);
			p_arg_universal();
			setState(885);
			match(T__4);
			setState(886);
			p_arg_universal();
			setState(887);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_paraContext extends ParserRuleContext {
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_paraContext j_para() throws RecognitionException {
		J_paraContext _localctx = new J_paraContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_j_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(T__38);
			setState(890);
			j_arg_universal();
			setState(891);
			match(T__4);
			setState(892);
			j_arg_universal();
			setState(893);
			match(T__4);
			setState(894);
			j_arg_universal();
			setState(895);
			match(T__4);
			setState(896);
			j_arg_universal();
			setState(897);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_paraContext extends ParserRuleContext {
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_paraContext p_para() throws RecognitionException {
		P_paraContext _localctx = new P_paraContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_p_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(T__38);
			setState(900);
			p_arg_universal();
			setState(901);
			match(T__4);
			setState(902);
			p_arg_universal();
			setState(903);
			match(T__4);
			setState(904);
			p_arg_universal();
			setState(905);
			match(T__4);
			setState(906);
			p_arg_universal();
			setState(907);
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

	@SuppressWarnings("CheckReturnValue")
	public static class J_condContext extends ParserRuleContext {
		public J_arg_conditionContext j_arg_condition() {
			return getRuleContext(J_arg_conditionContext.class,0);
		}
		public List<J_arg_universalContext> j_arg_universal() {
			return getRuleContexts(J_arg_universalContext.class);
		}
		public J_arg_universalContext j_arg_universal(int i) {
			return getRuleContext(J_arg_universalContext.class,i);
		}
		public J_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJ_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJ_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJ_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_condContext j_cond() throws RecognitionException {
		J_condContext _localctx = new J_condContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_j_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(T__39);
			setState(910);
			j_arg_condition();
			setState(911);
			match(T__4);
			setState(912);
			j_arg_universal();
			setState(913);
			match(T__4);
			setState(914);
			j_arg_universal();
			setState(915);
			match(T__4);
			setState(916);
			j_arg_universal();
			setState(917);
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

	@SuppressWarnings("CheckReturnValue")
	public static class P_condContext extends ParserRuleContext {
		public P_arg_conditionContext p_arg_condition() {
			return getRuleContext(P_arg_conditionContext.class,0);
		}
		public List<P_arg_universalContext> p_arg_universal() {
			return getRuleContexts(P_arg_universalContext.class);
		}
		public P_arg_universalContext p_arg_universal(int i) {
			return getRuleContext(P_arg_universalContext.class,i);
		}
		public P_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterP_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitP_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitP_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_condContext p_cond() throws RecognitionException {
		P_condContext _localctx = new P_condContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_p_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(T__39);
			setState(920);
			p_arg_condition();
			setState(921);
			match(T__4);
			setState(922);
			p_arg_universal();
			setState(923);
			match(T__4);
			setState(924);
			p_arg_universal();
			setState(925);
			match(T__4);
			setState(926);
			p_arg_universal();
			setState(927);
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
		"\u0004\u00017\u03a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0099\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u009e"+
		"\b\u0001\n\u0001\f\u0001\u00a1\t\u0001\u0001\u0002\u0005\u0002\u00a4\b"+
		"\u0002\n\u0002\f\u0002\u00a7\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00ad\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00bf\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00c4\b\u0006\n\u0006\f\u0006\u00c7\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00d8\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e9"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00f7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u010b\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0114\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0142\b\u0014\n\u0014\f\u0014\u0145\t\u0014\u0003\u0014"+
		"\u0147\b\u0014\u0001\u0014\u0003\u0014\u014a\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u014f\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0155\b\u0014\n\u0014\f\u0014\u0158\t\u0014"+
		"\u0003\u0014\u015a\b\u0014\u0001\u0014\u0003\u0014\u015d\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u016d\b\u0014\n\u0014\f\u0014\u0170\t\u0014"+
		"\u0003\u0014\u0172\b\u0014\u0001\u0014\u0003\u0014\u0175\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u017a\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0180\b\u0014\n\u0014\f\u0014"+
		"\u0183\t\u0014\u0003\u0014\u0185\b\u0014\u0001\u0014\u0003\u0014\u0188"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0198\b\u0014\n\u0014\f\u0014"+
		"\u019b\t\u0014\u0003\u0014\u019d\b\u0014\u0001\u0014\u0003\u0014\u01a0"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a5\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01ab\b\u0014"+
		"\n\u0014\f\u0014\u01ae\t\u0014\u0003\u0014\u01b0\b\u0014\u0001\u0014\u0003"+
		"\u0014\u01b3\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01c3\b\u0014\n"+
		"\u0014\f\u0014\u01c6\t\u0014\u0003\u0014\u01c8\b\u0014\u0001\u0014\u0003"+
		"\u0014\u01cb\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01d0"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01d6"+
		"\b\u0014\n\u0014\f\u0014\u01d9\t\u0014\u0003\u0014\u01db\b\u0014\u0001"+
		"\u0014\u0003\u0014\u01de\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01ee"+
		"\b\u0014\n\u0014\f\u0014\u01f1\t\u0014\u0003\u0014\u01f3\b\u0014\u0001"+
		"\u0014\u0003\u0014\u01f6\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01fb\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0201\b\u0014\n\u0014\f\u0014\u0204\t\u0014\u0003\u0014\u0206\b"+
		"\u0014\u0001\u0014\u0003\u0014\u0209\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0219\b\u0014\n\u0014\f\u0014\u021c\t\u0014\u0003\u0014\u021e\b"+
		"\u0014\u0001\u0014\u0003\u0014\u0221\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0226\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u022c\b\u0014\n\u0014\f\u0014\u022f\t\u0014\u0003\u0014"+
		"\u0231\b\u0014\u0001\u0014\u0003\u0014\u0234\b\u0014\u0003\u0014\u0236"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0241\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0249\b\u0018\n\u0018\f\u0018\u024c\t\u0018\u0003\u0018\u024e\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0258\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0265\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u026c"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0270\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0274\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0003 \u027b\b \u0001!\u0001!\u0005!\u027f\b!\n!\f!\u0282"+
		"\t!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u029c\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u02a4\b)\n)\f)\u02a7\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02ad\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u02b9\b,\n,\f,\u02bc\t,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02d1\b-\u0001-\u0001-\u0003"+
		"-\u02d5\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02dd\b-\u0003"+
		"-\u02df\b-\u0001.\u0001.\u0001.\u0001.\u0005.\u02e5\b.\n.\f.\u02e8\t."+
		"\u0001.\u0001.\u0004.\u02ec\b.\u000b.\f.\u02ed\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02fa\b/\u0001/\u0001"+
		"/\u0003/\u02fe\b/\u0001/\u0001/\u0001/\u0001/\u0003/\u0304\b/\u0003/\u0306"+
		"\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00034\u0319\b4\u0001"+
		"5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00019\u00019\u00019\u00039\u032c\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0000\u0000F\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u0000\f\u0002\u0000))66\u0002\u0000,,66\u0002\u0000..66\u0002\u0000"+
		"++66\u0002\u0000**66\u0001\u0000,-\u0001\u000005\u0001\u0000\u000f\u0012"+
		"\u0001\u0000\u0013\u0014\u0001\u0000\u001b\u001c\u0001\u0000\u001e\u001f"+
		"\u0002\u0000,-66\u03f5\u0000\u0098\u0001\u0000\u0000\u0000\u0002\u009f"+
		"\u0001\u0000\u0000\u0000\u0004\u00a5\u0001\u0000\u0000\u0000\u0006\u00ac"+
		"\u0001\u0000\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n\u00b8\u0001"+
		"\u0000\u0000\u0000\f\u00c5\u0001\u0000\u0000\u0000\u000e\u00cf\u0001\u0000"+
		"\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u00de\u0001\u0000"+
		"\u0000\u0000\u0014\u00e8\u0001\u0000\u0000\u0000\u0016\u00f6\u0001\u0000"+
		"\u0000\u0000\u0018\u010a\u0001\u0000\u0000\u0000\u001a\u0113\u0001\u0000"+
		"\u0000\u0000\u001c\u0115\u0001\u0000\u0000\u0000\u001e\u011a\u0001\u0000"+
		"\u0000\u0000 \u011f\u0001\u0000\u0000\u0000\"\u0124\u0001\u0000\u0000"+
		"\u0000$\u0129\u0001\u0000\u0000\u0000&\u012e\u0001\u0000\u0000\u0000("+
		"\u0235\u0001\u0000\u0000\u0000*\u0237\u0001\u0000\u0000\u0000,\u0240\u0001"+
		"\u0000\u0000\u0000.\u0242\u0001\u0000\u0000\u00000\u0244\u0001\u0000\u0000"+
		"\u00002\u0251\u0001\u0000\u0000\u00004\u0253\u0001\u0000\u0000\u00006"+
		"\u0257\u0001\u0000\u0000\u00008\u0259\u0001\u0000\u0000\u0000:\u0264\u0001"+
		"\u0000\u0000\u0000<\u0266\u0001\u0000\u0000\u0000>\u0268\u0001\u0000\u0000"+
		"\u0000@\u027a\u0001\u0000\u0000\u0000B\u027c\u0001\u0000\u0000\u0000D"+
		"\u0285\u0001\u0000\u0000\u0000F\u0287\u0001\u0000\u0000\u0000H\u0289\u0001"+
		"\u0000\u0000\u0000J\u028b\u0001\u0000\u0000\u0000L\u028f\u0001\u0000\u0000"+
		"\u0000N\u0291\u0001\u0000\u0000\u0000P\u029b\u0001\u0000\u0000\u0000R"+
		"\u029d\u0001\u0000\u0000\u0000T\u02ac\u0001\u0000\u0000\u0000V\u02ae\u0001"+
		"\u0000\u0000\u0000X\u02b3\u0001\u0000\u0000\u0000Z\u02de\u0001\u0000\u0000"+
		"\u0000\\\u02e0\u0001\u0000\u0000\u0000^\u0305\u0001\u0000\u0000\u0000"+
		"`\u0307\u0001\u0000\u0000\u0000b\u030b\u0001\u0000\u0000\u0000d\u030f"+
		"\u0001\u0000\u0000\u0000f\u0313\u0001\u0000\u0000\u0000h\u0318\u0001\u0000"+
		"\u0000\u0000j\u031a\u0001\u0000\u0000\u0000l\u031e\u0001\u0000\u0000\u0000"+
		"n\u0322\u0001\u0000\u0000\u0000p\u0326\u0001\u0000\u0000\u0000r\u032b"+
		"\u0001\u0000\u0000\u0000t\u032d\u0001\u0000\u0000\u0000v\u0335\u0001\u0000"+
		"\u0000\u0000x\u033d\u0001\u0000\u0000\u0000z\u0347\u0001\u0000\u0000\u0000"+
		"|\u0351\u0001\u0000\u0000\u0000~\u035b\u0001\u0000\u0000\u0000\u0080\u0365"+
		"\u0001\u0000\u0000\u0000\u0082\u036f\u0001\u0000\u0000\u0000\u0084\u0379"+
		"\u0001\u0000\u0000\u0000\u0086\u0383\u0001\u0000\u0000\u0000\u0088\u038d"+
		"\u0001\u0000\u0000\u0000\u008a\u0397\u0001\u0000\u0000\u0000\u008c\u0099"+
		"\u0003t:\u0000\u008d\u0099\u0003v;\u0000\u008e\u0099\u0003x<\u0000\u008f"+
		"\u0099\u0003z=\u0000\u0090\u0099\u0003~?\u0000\u0091\u0099\u0003|>\u0000"+
		"\u0092\u0099\u0003\u0080@\u0000\u0093\u0099\u0003\u0082A\u0000\u0094\u0099"+
		"\u0003\u0084B\u0000\u0095\u0099\u0003\u0086C\u0000\u0096\u0099\u0003\u0088"+
		"D\u0000\u0097\u0099\u0003\u008aE\u0000\u0098\u008c\u0001\u0000\u0000\u0000"+
		"\u0098\u008d\u0001\u0000\u0000\u0000\u0098\u008e\u0001\u0000\u0000\u0000"+
		"\u0098\u008f\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000\u0000\u0000"+
		"\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000"+
		"\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\u0000\u0000\u0001\u009b\u0001\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0003\b\u0004\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0003\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\u0006\u0003\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u0005\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ad\u0003\u0010\b\u0000\u00a9\u00ad\u0003*\u0015\u0000\u00aa\u00ad"+
		"\u0003R)\u0000\u00ab\u00ad\u0003\\.\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0007\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b5\u0003\u0016\u000b\u0000\u00af\u00b5\u0003\u0018\f\u0000"+
		"\u00b0\u00b5\u0003\u001a\r\u0000\u00b1\u00b5\u0003\n\u0005\u0000\u00b2"+
		"\u00b5\u00034\u001a\u0000\u00b3\u00b5\u0003X,\u0000\u00b4\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\t\u0001\u0000"+
		"\u0000\u0000\u00b8\u00be\u00056\u0000\u0000\u00b9\u00ba\u0005\u0002\u0000"+
		"\u0000\u00ba\u00bb\u0003\f\u0006\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bf\u0005\u0004\u0000\u0000"+
		"\u00be\u00b9\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u000b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\u000e\u0007\u0000"+
		"\u00c1\u00c2\u0005\u0005\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d0\u0005.\u0000\u0000\u00cb\u00d0\u0003\n\u0005\u0000\u00cc\u00d0"+
		"\u0005)\u0000\u0000\u00cd\u00d0\u0005,\u0000\u0000\u00ce\u00d0\u00056"+
		"\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u000f\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d7\u00056\u0000\u0000\u00d2\u00d3\u0005\u0002\u0000"+
		"\u0000\u00d3\u00d4\u0003\u0012\t\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005\u0004\u0000\u0000"+
		"\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u0011\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u0014\n\u0000\u00da"+
		"\u00db\u0005\u0005\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0003\u0014\n\u0000\u00e2\u0013\u0001\u0000\u0000\u0000\u00e3\u00e9"+
		"\u0005/\u0000\u0000\u00e4\u00e9\u0003.\u0017\u0000\u00e5\u00e9\u0005)"+
		"\u0000\u0000\u00e6\u00e9\u0003\u0010\b\u0000\u00e7\u00e9\u00056\u0000"+
		"\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u0015\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u00050\u0000\u0000\u00eb\u00f7\u00056\u0000\u0000\u00ec"+
		"\u00ed\u00052\u0000\u0000\u00ed\u00f7\u00056\u0000\u0000\u00ee\u00ef\u0005"+
		"5\u0000\u0000\u00ef\u00f7\u00056\u0000\u0000\u00f0\u00f1\u00054\u0000"+
		"\u0000\u00f1\u00f7\u00056\u0000\u0000\u00f2\u00f3\u00053\u0000\u0000\u00f3"+
		"\u00f7\u00056\u0000\u0000\u00f4\u00f5\u00051\u0000\u0000\u00f5\u00f7\u0005"+
		"6\u0000\u0000\u00f6\u00ea\u0001\u0000\u0000\u0000\u00f6\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7\u0017\u0001\u0000\u0000\u0000\u00f8\u00f9\u00050\u0000"+
		"\u0000\u00f9\u00fa\u0005\u0006\u0000\u0000\u00fa\u010b\u00056\u0000\u0000"+
		"\u00fb\u00fc\u00052\u0000\u0000\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd"+
		"\u010b\u00056\u0000\u0000\u00fe\u00ff\u00055\u0000\u0000\u00ff\u0100\u0005"+
		"\u0006\u0000\u0000\u0100\u010b\u00056\u0000\u0000\u0101\u0102\u00054\u0000"+
		"\u0000\u0102\u0103\u0005\u0006\u0000\u0000\u0103\u010b\u00056\u0000\u0000"+
		"\u0104\u0105\u00053\u0000\u0000\u0105\u0106\u0005\u0006\u0000\u0000\u0106"+
		"\u010b\u00056\u0000\u0000\u0107\u0108\u00051\u0000\u0000\u0108\u0109\u0005"+
		"\u0006\u0000\u0000\u0109\u010b\u00056\u0000\u0000\u010a\u00f8\u0001\u0000"+
		"\u0000\u0000\u010a\u00fb\u0001\u0000\u0000\u0000\u010a\u00fe\u0001\u0000"+
		"\u0000\u0000\u010a\u0101\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000"+
		"\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u0019\u0001\u0000"+
		"\u0000\u0000\u010c\u0114\u0003\u001c\u000e\u0000\u010d\u0114\u0003\"\u0011"+
		"\u0000\u010e\u0114\u0003$\u0012\u0000\u010f\u0114\u0003 \u0010\u0000\u0110"+
		"\u0114\u0003\u001e\u000f\u0000\u0111\u0114\u0003&\u0013\u0000\u0112\u0114"+
		"\u0003(\u0014\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113\u010d\u0001"+
		"\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u010f\u0001"+
		"\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u001b\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u00050\u0000\u0000\u0116\u0117\u00056\u0000"+
		"\u0000\u0117\u0118\u0005\u0007\u0000\u0000\u0118\u0119\u0007\u0000\u0000"+
		"\u0000\u0119\u001d\u0001\u0000\u0000\u0000\u011a\u011b\u00052\u0000\u0000"+
		"\u011b\u011c\u00056\u0000\u0000\u011c\u011d\u0005\u0007\u0000\u0000\u011d"+
		"\u011e\u0007\u0001\u0000\u0000\u011e\u001f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u00055\u0000\u0000\u0120\u0121\u00056\u0000\u0000\u0121\u0122\u0005"+
		"\u0007\u0000\u0000\u0122\u0123\u0007\u0002\u0000\u0000\u0123!\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u00054\u0000\u0000\u0125\u0126\u00056\u0000\u0000"+
		"\u0126\u0127\u0005\u0007\u0000\u0000\u0127\u0128\u0007\u0003\u0000\u0000"+
		"\u0128#\u0001\u0000\u0000\u0000\u0129\u012a\u00053\u0000\u0000\u012a\u012b"+
		"\u00056\u0000\u0000\u012b\u012c\u0005\u0007\u0000\u0000\u012c\u012d\u0007"+
		"\u0003\u0000\u0000\u012d%\u0001\u0000\u0000\u0000\u012e\u012f\u00051\u0000"+
		"\u0000\u012f\u0130\u00056\u0000\u0000\u0130\u0131\u0005\u0007\u0000\u0000"+
		"\u0131\u0132\u0007\u0004\u0000\u0000\u0132\'\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u00050\u0000\u0000\u0134\u0135\u0005\u0006\u0000\u0000\u0135\u0136"+
		"\u00056\u0000\u0000\u0136\u015c\u0005\u0007\u0000\u0000\u0137\u015d\u0005"+
		"6\u0000\u0000\u0138\u0139\u0005\b\u0000\u0000\u0139\u013a\u00050\u0000"+
		"\u0000\u013a\u013b\u0005\t\u0000\u0000\u013b\u013c\u0005)\u0000\u0000"+
		"\u013c\u0149\u0005\n\u0000\u0000\u013d\u0146\u0005\u000b\u0000\u0000\u013e"+
		"\u0143\u0005)\u0000\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140\u0142"+
		"\u0005)\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0005"+
		"\f\u0000\u0000\u0149\u013d\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u015d\u0001\u0000\u0000\u0000\u014b\u014c\u0005\b\u0000"+
		"\u0000\u014c\u014d\u00050\u0000\u0000\u014d\u014f\u0005\u0006\u0000\u0000"+
		"\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0159\u0005\u000b\u0000\u0000"+
		"\u0151\u0156\u0005)\u0000\u0000\u0152\u0153\u0005\u0005\u0000\u0000\u0153"+
		"\u0155\u0005)\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u0151\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0005\f\u0000\u0000\u015c\u0137\u0001\u0000\u0000\u0000\u015c\u0138\u0001"+
		"\u0000\u0000\u0000\u015c\u014e\u0001\u0000\u0000\u0000\u015d\u0236\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u00052\u0000\u0000\u015f\u0160\u0005\u0006"+
		"\u0000\u0000\u0160\u0161\u00056\u0000\u0000\u0161\u0187\u0005\u0007\u0000"+
		"\u0000\u0162\u0188\u00056\u0000\u0000\u0163\u0164\u0005\b\u0000\u0000"+
		"\u0164\u0165\u00052\u0000\u0000\u0165\u0166\u0005\t\u0000\u0000\u0166"+
		"\u0167\u0005)\u0000\u0000\u0167\u0174\u0005\n\u0000\u0000\u0168\u0171"+
		"\u0005\u000b\u0000\u0000\u0169\u016e\u0005,\u0000\u0000\u016a\u016b\u0005"+
		"\u0005\u0000\u0000\u016b\u016d\u0005,\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0169\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0175\u0005\f\u0000\u0000\u0174\u0168\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0188\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005\b\u0000\u0000\u0177\u0178\u00052\u0000\u0000"+
		"\u0178\u017a\u0005\u0006\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u0184\u0005\u000b\u0000\u0000\u017c\u0181\u0005,\u0000\u0000\u017d"+
		"\u017e\u0005\u0005\u0000\u0000\u017e\u0180\u0005,\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u017c"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0188\u0005\f\u0000\u0000\u0187\u0162\u0001"+
		"\u0000\u0000\u0000\u0187\u0163\u0001\u0000\u0000\u0000\u0187\u0179\u0001"+
		"\u0000\u0000\u0000\u0188\u0236\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"5\u0000\u0000\u018a\u018b\u0005\u0006\u0000\u0000\u018b\u018c\u00056\u0000"+
		"\u0000\u018c\u01b2\u0005\u0007\u0000\u0000\u018d\u01b3\u00056\u0000\u0000"+
		"\u018e\u018f\u0005\b\u0000\u0000\u018f\u0190\u00055\u0000\u0000\u0190"+
		"\u0191\u0005\t\u0000\u0000\u0191\u0192\u0005)\u0000\u0000\u0192\u019f"+
		"\u0005\n\u0000\u0000\u0193\u019c\u0005\u000b\u0000\u0000\u0194\u0199\u0005"+
		".\u0000\u0000\u0195\u0196\u0005\u0005\u0000\u0000\u0196\u0198\u0005.\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000"+
		"\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0005\f\u0000\u0000"+
		"\u019f\u0193\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01b3\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\b\u0000\u0000\u01a2"+
		"\u01a3\u00055\u0000\u0000\u01a3\u01a5\u0005\u0006\u0000\u0000\u01a4\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01af\u0005\u000b\u0000\u0000\u01a7\u01ac"+
		"\u0005.\u0000\u0000\u01a8\u01a9\u0005\u0005\u0000\u0000\u01a9\u01ab\u0005"+
		".\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01a7\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005\f\u0000"+
		"\u0000\u01b2\u018d\u0001\u0000\u0000\u0000\u01b2\u018e\u0001\u0000\u0000"+
		"\u0000\u01b2\u01a4\u0001\u0000\u0000\u0000\u01b3\u0236\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u00054\u0000\u0000\u01b5\u01b6\u0005\u0006\u0000\u0000"+
		"\u01b6\u01b7\u00056\u0000\u0000\u01b7\u01dd\u0005\u0007\u0000\u0000\u01b8"+
		"\u01de\u00056\u0000\u0000\u01b9\u01ba\u0005\b\u0000\u0000\u01ba\u01bb"+
		"\u00054\u0000\u0000\u01bb\u01bc\u0005\t\u0000\u0000\u01bc\u01bd\u0005"+
		")\u0000\u0000\u01bd\u01ca\u0005\n\u0000\u0000\u01be\u01c7\u0005\u000b"+
		"\u0000\u0000\u01bf\u01c4\u0005+\u0000\u0000\u01c0\u01c1\u0005\u0005\u0000"+
		"\u0000\u01c1\u01c3\u0005+\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cb\u0005\f\u0000\u0000\u01ca\u01be\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01de\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0005\b\u0000\u0000\u01cd\u01ce\u00054\u0000\u0000\u01ce\u01d0"+
		"\u0005\u0006\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01da"+
		"\u0005\u000b\u0000\u0000\u01d2\u01d7\u0005+\u0000\u0000\u01d3\u01d4\u0005"+
		"\u0005\u0000\u0000\u01d4\u01d6\u0005+\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01d2\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01de\u0005\f\u0000\u0000\u01dd\u01b8\u0001\u0000\u0000"+
		"\u0000\u01dd\u01b9\u0001\u0000\u0000\u0000\u01dd\u01cf\u0001\u0000\u0000"+
		"\u0000\u01de\u0236\u0001\u0000\u0000\u0000\u01df\u01e0\u00053\u0000\u0000"+
		"\u01e0\u01e1\u0005\u0006\u0000\u0000\u01e1\u01e2\u00056\u0000\u0000\u01e2"+
		"\u0208\u0005\u0007\u0000\u0000\u01e3\u0209\u00056\u0000\u0000\u01e4\u01e5"+
		"\u0005\b\u0000\u0000\u01e5\u01e6\u00053\u0000\u0000\u01e6\u01e7\u0005"+
		"\t\u0000\u0000\u01e7\u01e8\u0005)\u0000\u0000\u01e8\u01f5\u0005\n\u0000"+
		"\u0000\u01e9\u01f2\u0005\u000b\u0000\u0000\u01ea\u01ef\u0005+\u0000\u0000"+
		"\u01eb\u01ec\u0005\u0005\u0000\u0000\u01ec\u01ee\u0005+\u0000\u0000\u01ed"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2"+
		"\u01ea\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005\f\u0000\u0000\u01f5\u01e9"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u0209"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\b\u0000\u0000\u01f8\u01f9\u0005"+
		"3\u0000\u0000\u01f9\u01fb\u0005\u0006\u0000\u0000\u01fa\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fc\u0205\u0005\u000b\u0000\u0000\u01fd\u0202\u0005+\u0000"+
		"\u0000\u01fe\u01ff\u0005\u0005\u0000\u0000\u01ff\u0201\u0005+\u0000\u0000"+
		"\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0205\u01fd\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0005\f\u0000\u0000\u0208"+
		"\u01e3\u0001\u0000\u0000\u0000\u0208\u01e4\u0001\u0000\u0000\u0000\u0208"+
		"\u01fa\u0001\u0000\u0000\u0000\u0209\u0236\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u00051\u0000\u0000\u020b\u020c\u0005\u0006\u0000\u0000\u020c\u020d"+
		"\u00056\u0000\u0000\u020d\u0233\u0005\u0007\u0000\u0000\u020e\u0234\u0005"+
		"6\u0000\u0000\u020f\u0210\u0005\b\u0000\u0000\u0210\u0211\u00051\u0000"+
		"\u0000\u0211\u0212\u0005\t\u0000\u0000\u0212\u0213\u0005)\u0000\u0000"+
		"\u0213\u0220\u0005\n\u0000\u0000\u0214\u021d\u0005\u000b\u0000\u0000\u0215"+
		"\u021a\u0005*\u0000\u0000\u0216\u0217\u0005\u0005\u0000\u0000\u0217\u0219"+
		"\u0005*\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021c\u0001"+
		"\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001"+
		"\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021d\u0215\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0005"+
		"\f\u0000\u0000\u0220\u0214\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u0234\u0001\u0000\u0000\u0000\u0222\u0223\u0005\b\u0000"+
		"\u0000\u0223\u0224\u00051\u0000\u0000\u0224\u0226\u0005\u0006\u0000\u0000"+
		"\u0225\u0222\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0230\u0005\u000b\u0000\u0000"+
		"\u0228\u022d\u0005*\u0000\u0000\u0229\u022a\u0005\u0005\u0000\u0000\u022a"+
		"\u022c\u0005*\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u022f"+
		"\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u0230\u0228\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0005\f\u0000\u0000\u0233\u020e\u0001\u0000\u0000\u0000\u0233\u020f\u0001"+
		"\u0000\u0000\u0000\u0233\u0225\u0001\u0000\u0000\u0000\u0234\u0236\u0001"+
		"\u0000\u0000\u0000\u0235\u0133\u0001\u0000\u0000\u0000\u0235\u015e\u0001"+
		"\u0000\u0000\u0000\u0235\u0189\u0001\u0000\u0000\u0000\u0235\u01b4\u0001"+
		"\u0000\u0000\u0000\u0235\u01df\u0001\u0000\u0000\u0000\u0235\u020a\u0001"+
		"\u0000\u0000\u0000\u0236)\u0001\u0000\u0000\u0000\u0237\u0238\u00056\u0000"+
		"\u0000\u0238\u0239\u0005\u0007\u0000\u0000\u0239\u023a\u0003,\u0016\u0000"+
		"\u023a+\u0001\u0000\u0000\u0000\u023b\u0241\u00056\u0000\u0000\u023c\u0241"+
		"\u0005)\u0000\u0000\u023d\u0241\u0005/\u0000\u0000\u023e\u0241\u0003."+
		"\u0017\u0000\u023f\u0241\u00030\u0018\u0000\u0240\u023b\u0001\u0000\u0000"+
		"\u0000\u0240\u023c\u0001\u0000\u0000\u0000\u0240\u023d\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u023f\u0001\u0000\u0000"+
		"\u0000\u0241-\u0001\u0000\u0000\u0000\u0242\u0243\u0007\u0005\u0000\u0000"+
		"\u0243/\u0001\u0000\u0000\u0000\u0244\u024d\u0005\t\u0000\u0000\u0245"+
		"\u024a\u0003,\u0016\u0000\u0246\u0247\u0005\u0005\u0000\u0000\u0247\u0249"+
		"\u0003,\u0016\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024d\u0245\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0005"+
		"\n\u0000\u0000\u02501\u0001\u0000\u0000\u0000\u0251\u0252\u0007\u0006"+
		"\u0000\u0000\u02523\u0001\u0000\u0000\u0000\u0253\u0254\u00036\u001b\u0000"+
		"\u02545\u0001\u0000\u0000\u0000\u0255\u0258\u0003<\u001e\u0000\u0256\u0258"+
		"\u00038\u001c\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0256\u0001"+
		"\u0000\u0000\u0000\u02587\u0001\u0000\u0000\u0000\u0259\u025a\u0005\r"+
		"\u0000\u0000\u025a\u025b\u0005\u0002\u0000\u0000\u025b\u025c\u0003:\u001d"+
		"\u0000\u025c\u025d\u0005\u0003\u0000\u0000\u025d\u025e\u0003@ \u0000\u025e"+
		"9\u0001\u0000\u0000\u0000\u025f\u0260\u00056\u0000\u0000\u0260\u0261\u0003"+
		"L&\u0000\u0261\u0262\u0005)\u0000\u0000\u0262\u0265\u0001\u0000\u0000"+
		"\u0000\u0263\u0265\u0005.\u0000\u0000\u0264\u025f\u0001\u0000\u0000\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0265;\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0003>\u001f\u0000\u0267=\u0001\u0000\u0000\u0000\u0268\u0269\u0005"+
		"\u000e\u0000\u0000\u0269\u026b\u0005\u0002\u0000\u0000\u026a\u026c\u0003"+
		"D\"\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026f\u0005\u0001"+
		"\u0000\u0000\u026e\u0270\u0003J%\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u0273\u0005\u0001\u0000\u0000\u0272\u0274\u0003H$\u0000\u0273\u0272"+
		"\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0277"+
		"\u0003@ \u0000\u0277?\u0001\u0000\u0000\u0000\u0278\u027b\u0003B!\u0000"+
		"\u0279\u027b\u0003\b\u0004\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u0279\u0001\u0000\u0000\u0000\u027bA\u0001\u0000\u0000\u0000\u027c\u0280"+
		"\u0005\u000b\u0000\u0000\u027d\u027f\u0003\b\u0004\u0000\u027e\u027d\u0001"+
		"\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0001"+
		"\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0284\u0005"+
		"\f\u0000\u0000\u0284C\u0001\u0000\u0000\u0000\u0285\u0286\u0003F#\u0000"+
		"\u0286E\u0001\u0000\u0000\u0000\u0287\u0288\u0003\u001c\u000e\u0000\u0288"+
		"G\u0001\u0000\u0000\u0000\u0289\u028a\u0003P(\u0000\u028aI\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u00056\u0000\u0000\u028c\u028d\u0003L&\u0000"+
		"\u028d\u028e\u0005)\u0000\u0000\u028eK\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0007\u0007\u0000\u0000\u0290M\u0001\u0000\u0000\u0000\u0291\u0292\u0007"+
		"\b\u0000\u0000\u0292O\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u0015"+
		"\u0000\u0000\u0294\u029c\u00056\u0000\u0000\u0295\u0296\u0005\u0016\u0000"+
		"\u0000\u0296\u029c\u00056\u0000\u0000\u0297\u0298\u00056\u0000\u0000\u0298"+
		"\u029c\u0005\u0015\u0000\u0000\u0299\u029a\u00056\u0000\u0000\u029a\u029c"+
		"\u0005\u0016\u0000\u0000\u029b\u0293\u0001\u0000\u0000\u0000\u029b\u0295"+
		"\u0001\u0000\u0000\u0000\u029b\u0297\u0001\u0000\u0000\u0000\u029b\u0299"+
		"\u0001\u0000\u0000\u0000\u029cQ\u0001\u0000\u0000\u0000\u029d\u029e\u0005"+
		"\u000e\u0000\u0000\u029e\u029f\u00056\u0000\u0000\u029f\u02a0\u0005\u0017"+
		"\u0000\u0000\u02a0\u02a1\u0003T*\u0000\u02a1\u02a5\u0005\u0018\u0000\u0000"+
		"\u02a2\u02a4\u0003\u0006\u0003\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6S\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a8\u02ad\u0003.\u0017\u0000\u02a9\u02ad"+
		"\u00056\u0000\u0000\u02aa\u02ad\u0003V+\u0000\u02ab\u02ad\u00030\u0018"+
		"\u0000\u02ac\u02a8\u0001\u0000\u0000\u0000\u02ac\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000"+
		"\u0000\u02adU\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0019\u0000\u0000"+
		"\u02af\u02b0\u0005\u0002\u0000\u0000\u02b0\u02b1\u0005)\u0000\u0000\u02b1"+
		"\u02b2\u0005\u0003\u0000\u0000\u02b2W\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0005\u001a\u0000\u0000\u02b4\u02b5\u0005\u0002\u0000\u0000\u02b5\u02ba"+
		"\u0003Z-\u0000\u02b6\u02b7\u0007\t\u0000\u0000\u02b7\u02b9\u0003Z-\u0000"+
		"\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000"+
		"\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bd\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0005\u0003\u0000\u0000\u02be\u02bf\u0003@ \u0000\u02bfY"+
		"\u0001\u0000\u0000\u0000\u02c0\u02df\u0005.\u0000\u0000\u02c1\u02df\u0003"+
		"\n\u0005\u0000\u02c2\u02c3\u0007\u0002\u0000\u0000\u02c3\u02c4\u0003N"+
		"\'\u0000\u02c4\u02c5\u0007\u0002\u0000\u0000\u02c5\u02df\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0007\u0001\u0000\u0000\u02c7\u02c8\u0003N\'\u0000"+
		"\u02c8\u02c9\u0007\u0001\u0000\u0000\u02c9\u02df\u0001\u0000\u0000\u0000"+
		"\u02ca\u02d1\u00056\u0000\u0000\u02cb\u02d1\u0005)\u0000\u0000\u02cc\u02d1"+
		"\u0005+\u0000\u0000\u02cd\u02d1\u0005*\u0000\u0000\u02ce\u02d1\u0003P"+
		"(\u0000\u02cf\u02d1\u0003\n\u0005\u0000\u02d0\u02ca\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cb\u0001\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cd\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d5\u0003L&\u0000\u02d3\u02d5\u0003N\'\u0000\u02d4\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d5\u02dc"+
		"\u0001\u0000\u0000\u0000\u02d6\u02dd\u00056\u0000\u0000\u02d7\u02dd\u0005"+
		")\u0000\u0000\u02d8\u02dd\u0005+\u0000\u0000\u02d9\u02dd\u0005*\u0000"+
		"\u0000\u02da\u02dd\u0003P(\u0000\u02db\u02dd\u0003\n\u0005\u0000\u02dc"+
		"\u02d6\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001\u0000\u0000\u0000\u02dc"+
		"\u02d8\u0001\u0000\u0000\u0000\u02dc\u02d9\u0001\u0000\u0000\u0000\u02dc"+
		"\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd"+
		"\u02df\u0001\u0000\u0000\u0000\u02de\u02c0\u0001\u0000\u0000\u0000\u02de"+
		"\u02c1\u0001\u0000\u0000\u0000\u02de\u02c2\u0001\u0000\u0000\u0000\u02de"+
		"\u02c6\u0001\u0000\u0000\u0000\u02de\u02d0\u0001\u0000\u0000\u0000\u02df"+
		"[\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005\u001d\u0000\u0000\u02e1\u02e6"+
		"\u0003^/\u0000\u02e2\u02e3\u0007\n\u0000\u0000\u02e3\u02e5\u0003^/\u0000"+
		"\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e9\u02eb\u0005\u0018\u0000\u0000\u02ea\u02ec\u0003\u0006\u0003\u0000"+
		"\u02eb\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ee]\u0001\u0000\u0000\u0000\u02ef\u0306\u0005/\u0000\u0000\u02f0\u0306"+
		"\u0003\u0010\b\u0000\u02f1\u02f2\u0007\u000b\u0000\u0000\u02f2\u02f3\u0003"+
		"N\'\u0000\u02f3\u02f4\u0007\u000b\u0000\u0000\u02f4\u0306\u0001\u0000"+
		"\u0000\u0000\u02f5\u02fa\u00056\u0000\u0000\u02f6\u02fa\u0005)\u0000\u0000"+
		"\u02f7\u02fa\u0005+\u0000\u0000\u02f8\u02fa\u0003\u0010\b\u0000\u02f9"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f9\u02f6\u0001\u0000\u0000\u0000\u02f9"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fb\u02fe\u0003L&\u0000\u02fc\u02fe\u0003"+
		"N\'\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe\u0303\u0001\u0000\u0000\u0000\u02ff\u0304\u00056\u0000"+
		"\u0000\u0300\u0304\u0005)\u0000\u0000\u0301\u0304\u0005+\u0000\u0000\u0302"+
		"\u0304\u0003\u0010\b\u0000\u0303\u02ff\u0001\u0000\u0000\u0000\u0303\u0300"+
		"\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302"+
		"\u0001\u0000\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u02ef"+
		"\u0001\u0000\u0000\u0000\u0305\u02f0\u0001\u0000\u0000\u0000\u0305\u02f1"+
		"\u0001\u0000\u0000\u0000\u0305\u02f9\u0001\u0000\u0000\u0000\u0306_\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0005 \u0000\u0000\u0308\u0309\u0003\u0002"+
		"\u0001\u0000\u0309\u030a\u0005 \u0000\u0000\u030aa\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0005!\u0000\u0000\u030c\u030d\u0003Z-\u0000\u030d\u030e"+
		"\u0005!\u0000\u0000\u030ec\u0001\u0000\u0000\u0000\u030f\u0310\u0005\""+
		"\u0000\u0000\u0310\u0311\u0003\n\u0005\u0000\u0311\u0312\u0005\"\u0000"+
		"\u0000\u0312e\u0001\u0000\u0000\u0000\u0313\u0314\u0003t:\u0000\u0314"+
		"g\u0001\u0000\u0000\u0000\u0315\u0319\u0003`0\u0000\u0316\u0319\u0003"+
		"d2\u0000\u0317\u0319\u0003f3\u0000\u0318\u0315\u0001\u0000\u0000\u0000"+
		"\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0317\u0001\u0000\u0000\u0000"+
		"\u0319i\u0001\u0000\u0000\u0000\u031a\u031b\u0005 \u0000\u0000\u031b\u031c"+
		"\u0003\u0004\u0002\u0000\u031c\u031d\u0005 \u0000\u0000\u031dk\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0005!\u0000\u0000\u031f\u0320\u0003^/\u0000"+
		"\u0320\u0321\u0005!\u0000\u0000\u0321m\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0005\"\u0000\u0000\u0323\u0324\u0003\u0010\b\u0000\u0324\u0325\u0005"+
		"\"\u0000\u0000\u0325o\u0001\u0000\u0000\u0000\u0326\u0327\u0003v;\u0000"+
		"\u0327q\u0001\u0000\u0000\u0000\u0328\u032c\u0003j5\u0000\u0329\u032c"+
		"\u0003n7\u0000\u032a\u032c\u0003p8\u0000\u032b\u0328\u0001\u0000\u0000"+
		"\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032b\u032a\u0001\u0000\u0000"+
		"\u0000\u032cs\u0001\u0000\u0000\u0000\u032d\u032e\u0005#\u0000\u0000\u032e"+
		"\u032f\u0003h4\u0000\u032f\u0330\u0005\u0005\u0000\u0000\u0330\u0331\u0003"+
		"h4\u0000\u0331\u0332\u0005\u0005\u0000\u0000\u0332\u0333\u0003h4\u0000"+
		"\u0333\u0334\u0005\u0003\u0000\u0000\u0334u\u0001\u0000\u0000\u0000\u0335"+
		"\u0336\u0005#\u0000\u0000\u0336\u0337\u0003r9\u0000\u0337\u0338\u0005"+
		"\u0005\u0000\u0000\u0338\u0339\u0003r9\u0000\u0339\u033a\u0005\u0005\u0000"+
		"\u0000\u033a\u033b\u0003r9\u0000\u033b\u033c\u0005\u0003\u0000\u0000\u033c"+
		"w\u0001\u0000\u0000\u0000\u033d\u033e\u0005$\u0000\u0000\u033e\u033f\u0003"+
		"h4\u0000\u033f\u0340\u0005\u0005\u0000\u0000\u0340\u0341\u0003h4\u0000"+
		"\u0341\u0342\u0005\u0005\u0000\u0000\u0342\u0343\u0003h4\u0000\u0343\u0344"+
		"\u0005\u0005\u0000\u0000\u0344\u0345\u0003h4\u0000\u0345\u0346\u0005\u0003"+
		"\u0000\u0000\u0346y\u0001\u0000\u0000\u0000\u0347\u0348\u0005$\u0000\u0000"+
		"\u0348\u0349\u0003r9\u0000\u0349\u034a\u0005\u0005\u0000\u0000\u034a\u034b"+
		"\u0003r9\u0000\u034b\u034c\u0005\u0005\u0000\u0000\u034c\u034d\u0003r"+
		"9\u0000\u034d\u034e\u0005\u0005\u0000\u0000\u034e\u034f\u0003r9\u0000"+
		"\u034f\u0350\u0005\u0003\u0000\u0000\u0350{\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0005%\u0000\u0000\u0352\u0353\u0003r9\u0000\u0353\u0354\u0005"+
		"\u0005\u0000\u0000\u0354\u0355\u0003r9\u0000\u0355\u0356\u0005\u0005\u0000"+
		"\u0000\u0356\u0357\u0003l6\u0000\u0357\u0358\u0005\u0005\u0000\u0000\u0358"+
		"\u0359\u0003r9\u0000\u0359\u035a\u0005\u0003\u0000\u0000\u035a}\u0001"+
		"\u0000\u0000\u0000\u035b\u035c\u0005%\u0000\u0000\u035c\u035d\u0003h4"+
		"\u0000\u035d\u035e\u0005\u0005\u0000\u0000\u035e\u035f\u0003h4\u0000\u035f"+
		"\u0360\u0005\u0005\u0000\u0000\u0360\u0361\u0003b1\u0000\u0361\u0362\u0005"+
		"\u0005\u0000\u0000\u0362\u0363\u0003h4\u0000\u0363\u0364\u0005\u0003\u0000"+
		"\u0000\u0364\u007f\u0001\u0000\u0000\u0000\u0365\u0366\u0005&\u0000\u0000"+
		"\u0366\u0367\u0003h4\u0000\u0367\u0368\u0005\u0005\u0000\u0000\u0368\u0369"+
		"\u0003b1\u0000\u0369\u036a\u0005\u0005\u0000\u0000\u036a\u036b\u0003h"+
		"4\u0000\u036b\u036c\u0005\u0005\u0000\u0000\u036c\u036d\u0003h4\u0000"+
		"\u036d\u036e\u0005\u0003\u0000\u0000\u036e\u0081\u0001\u0000\u0000\u0000"+
		"\u036f\u0370\u0005&\u0000\u0000\u0370\u0371\u0003r9\u0000\u0371\u0372"+
		"\u0005\u0005\u0000\u0000\u0372\u0373\u0003l6\u0000\u0373\u0374\u0005\u0005"+
		"\u0000\u0000\u0374\u0375\u0003r9\u0000\u0375\u0376\u0005\u0005\u0000\u0000"+
		"\u0376\u0377\u0003r9\u0000\u0377\u0378\u0005\u0003\u0000\u0000\u0378\u0083"+
		"\u0001\u0000\u0000\u0000\u0379\u037a\u0005\'\u0000\u0000\u037a\u037b\u0003"+
		"h4\u0000\u037b\u037c\u0005\u0005\u0000\u0000\u037c\u037d\u0003h4\u0000"+
		"\u037d\u037e\u0005\u0005\u0000\u0000\u037e\u037f\u0003h4\u0000\u037f\u0380"+
		"\u0005\u0005\u0000\u0000\u0380\u0381\u0003h4\u0000\u0381\u0382\u0005\u0003"+
		"\u0000\u0000\u0382\u0085\u0001\u0000\u0000\u0000\u0383\u0384\u0005\'\u0000"+
		"\u0000\u0384\u0385\u0003r9\u0000\u0385\u0386\u0005\u0005\u0000\u0000\u0386"+
		"\u0387\u0003r9\u0000\u0387\u0388\u0005\u0005\u0000\u0000\u0388\u0389\u0003"+
		"r9\u0000\u0389\u038a\u0005\u0005\u0000\u0000\u038a\u038b\u0003r9\u0000"+
		"\u038b\u038c\u0005\u0003\u0000\u0000\u038c\u0087\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0005(\u0000\u0000\u038e\u038f\u0003b1\u0000\u038f\u0390"+
		"\u0005\u0005\u0000\u0000\u0390\u0391\u0003h4\u0000\u0391\u0392\u0005\u0005"+
		"\u0000\u0000\u0392\u0393\u0003h4\u0000\u0393\u0394\u0005\u0005\u0000\u0000"+
		"\u0394\u0395\u0003h4\u0000\u0395\u0396\u0005\u0003\u0000\u0000\u0396\u0089"+
		"\u0001\u0000\u0000\u0000\u0397\u0398\u0005(\u0000\u0000\u0398\u0399\u0003"+
		"l6\u0000\u0399\u039a\u0005\u0005\u0000\u0000\u039a\u039b\u0003r9\u0000"+
		"\u039b\u039c\u0005\u0005\u0000\u0000\u039c\u039d\u0003r9\u0000\u039d\u039e"+
		"\u0005\u0005\u0000\u0000\u039e\u039f\u0003r9\u0000\u039f\u03a0\u0005\u0003"+
		"\u0000\u0000\u03a0\u008b\u0001\u0000\u0000\u0000S\u0098\u009f\u00a5\u00ac"+
		"\u00b4\u00be\u00c5\u00cf\u00d7\u00de\u00e8\u00f6\u010a\u0113\u0143\u0146"+
		"\u0149\u014e\u0156\u0159\u015c\u016e\u0171\u0174\u0179\u0181\u0184\u0187"+
		"\u0199\u019c\u019f\u01a4\u01ac\u01af\u01b2\u01c4\u01c7\u01ca\u01cf\u01d7"+
		"\u01da\u01dd\u01ef\u01f2\u01f5\u01fa\u0202\u0205\u0208\u021a\u021d\u0220"+
		"\u0225\u022d\u0230\u0233\u0235\u0240\u024a\u024d\u0257\u0264\u026b\u026f"+
		"\u0273\u027a\u0280\u029b\u02a5\u02ac\u02ba\u02d0\u02d4\u02dc\u02de\u02e6"+
		"\u02ed\u02f9\u02fd\u0303\u0305\u0318\u032b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}