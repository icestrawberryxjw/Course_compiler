// Generated from miniJava.g4 by ANTLR 4.6
package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, INTEGER_LITERAL=37, 
		ESPACOS=38;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_formalList = 5, RULE_formalRest = 6, 
		RULE_type = 7, RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"formalList", "formalRest", "type", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
		"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Identifier", "INTEGER_LITERAL", "ESPACOS"
	};
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
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(miniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				classDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(miniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(miniJavaParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(Identifier);
			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
			match(T__3);
			setState(34);
			match(T__4);
			setState(35);
			match(T__5);
			setState(36);
			match(T__6);
			setState(37);
			match(T__7);
			setState(38);
			match(T__8);
			setState(39);
			match(T__9);
			setState(40);
			match(Identifier);
			setState(41);
			match(T__10);
			setState(42);
			match(T__1);
			setState(43);
			statement();
			setState(44);
			match(T__11);
			setState(45);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(miniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(miniJavaParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(Identifier);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(49);
				match(T__12);
				setState(50);
				match(Identifier);
				}
			}

			setState(53);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(54);
				varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(60);
				methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(Identifier);
			setState(70);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__2);
			setState(73);
			type();
			setState(74);
			match(Identifier);
			setState(75);
			match(T__6);
			setState(76);
			formalList();
			setState(77);
			match(T__10);
			setState(78);
			match(T__1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					varDeclaration();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__14);
			setState(92);
			expression(0);
			setState(93);
			match(T__13);
			setState(94);
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

	public static class FormalListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public List<FormalRestContext> formalRest() {
			return getRuleContexts(FormalRestContext.class);
		}
		public FormalRestContext formalRest(int i) {
			return getRuleContext(FormalRestContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(Identifier);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(98);
				formalRest();
				}
				}
				setState(103);
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

	public static class FormalRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public FormalRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterFormalRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitFormalRest(this);
		}
	}

	public final FormalRestContext formalRest() throws RecognitionException {
		FormalRestContext _localctx = new FormalRestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__15);
			setState(105);
			type();
			setState(106);
			match(Identifier);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__16);
				setState(109);
				match(T__8);
				setState(110);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__1);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(117);
					statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__18);
				setState(125);
				match(T__6);
				setState(126);
				expression(0);
				setState(127);
				match(T__10);
				setState(128);
				statement();
				setState(129);
				match(T__19);
				setState(130);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__20);
				setState(133);
				match(T__6);
				setState(134);
				expression(0);
				setState(135);
				match(T__10);
				setState(136);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__21);
				setState(139);
				match(T__6);
				setState(140);
				expression(0);
				setState(141);
				match(T__10);
				setState(142);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(Identifier);
				setState(145);
				match(T__22);
				setState(146);
				expression(0);
				setState(147);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(Identifier);
				setState(150);
				match(T__8);
				setState(151);
				expression(0);
				setState(152);
				match(T__9);
				setState(153);
				match(T__22);
				setState(154);
				expression(0);
				setState(155);
				match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(miniJavaParser.INTEGER_LITERAL, 0); }
		public TerminalNode Identifier() { return getToken(miniJavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(160);
				match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(161);
				match(T__30);
				}
				break;
			case 4:
				{
				setState(162);
				match(T__31);
				}
				break;
			case 5:
				{
				setState(163);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(164);
				match(T__32);
				}
				break;
			case 7:
				{
				setState(165);
				match(T__33);
				setState(166);
				match(T__16);
				setState(167);
				match(T__8);
				setState(168);
				expression(0);
				setState(169);
				match(T__9);
				}
				break;
			case 8:
				{
				setState(171);
				match(T__33);
				setState(172);
				match(Identifier);
				setState(173);
				match(T__6);
				setState(174);
				match(T__10);
				}
				break;
			case 9:
				{
				setState(175);
				match(T__34);
				setState(176);
				expression(2);
				}
				break;
			case 10:
				{
				setState(177);
				match(T__6);
				setState(178);
				expression(0);
				setState(179);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(187);
						match(T__8);
						setState(188);
						expression(0);
						setState(189);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(192);
						match(T__28);
						setState(193);
						match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(195);
						match(T__28);
						setState(196);
						match(Identifier);
						setState(197);
						match(T__6);
						setState(206);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(198);
							expression(0);
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(199);
								match(T__15);
								setState(200);
								expression(0);
								}
								}
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						}
						setState(208);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16"+
		"\6V\13\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\7\7f\n\7\f\7\16\7i\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tu"+
		"\n\t\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cc\n\13\f\13"+
		"\16\13\u00cf\13\13\5\13\u00d1\n\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7"+
		"\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\32\36\u00ed\2\26"+
		"\3\2\2\2\4\37\3\2\2\2\6\61\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fb\3\2\2\2\16"+
		"j\3\2\2\2\20t\3\2\2\2\22\u009f\3\2\2\2\24\u00b7\3\2\2\2\26\32\5\4\3\2"+
		"\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\3\2\2 !"+
		"\7&\2\2!\"\7\4\2\2\"#\7\5\2\2#$\7\6\2\2$%\7\7\2\2%&\7\b\2\2&\'\7\t\2\2"+
		"\'(\7\n\2\2()\7\13\2\2)*\7\f\2\2*+\7&\2\2+,\7\r\2\2,-\7\4\2\2-.\5\22\n"+
		"\2./\7\16\2\2/\60\7\16\2\2\60\5\3\2\2\2\61\62\7\3\2\2\62\65\7&\2\2\63"+
		"\64\7\17\2\2\64\66\7&\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		";\7\4\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2"+
		"=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\16\2\2E\7\3\2\2\2FG\5\20\t\2GH\7&\2\2HI\7\20\2\2I\t\3\2"+
		"\2\2JK\7\5\2\2KL\5\20\t\2LM\7&\2\2MN\7\t\2\2NO\5\f\7\2OP\7\r\2\2PT\7\4"+
		"\2\2QS\5\b\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2"+
		"\2\2WY\5\22\n\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z"+
		"\3\2\2\2]^\7\21\2\2^_\5\24\13\2_`\7\20\2\2`a\7\16\2\2a\13\3\2\2\2bc\5"+
		"\20\t\2cg\7&\2\2df\5\16\b\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\r"+
		"\3\2\2\2ig\3\2\2\2jk\7\22\2\2kl\5\20\t\2lm\7&\2\2m\17\3\2\2\2no\7\23\2"+
		"\2op\7\13\2\2pu\7\f\2\2qu\7\24\2\2ru\7\23\2\2su\7&\2\2tn\3\2\2\2tq\3\2"+
		"\2\2tr\3\2\2\2ts\3\2\2\2u\21\3\2\2\2vz\7\4\2\2wy\5\22\n\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u00a0\7\16\2\2~\177"+
		"\7\25\2\2\177\u0080\7\t\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\r\2\2"+
		"\u0082\u0083\5\22\n\2\u0083\u0084\7\26\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u00a0\3\2\2\2\u0086\u0087\7\27\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5"+
		"\24\13\2\u0089\u008a\7\r\2\2\u008a\u008b\5\22\n\2\u008b\u00a0\3\2\2\2"+
		"\u008c\u008d\7\30\2\2\u008d\u008e\7\t\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u0090\7\r\2\2\u0090\u0091\7\20\2\2\u0091\u00a0\3\2\2\2\u0092\u0093\7"+
		"&\2\2\u0093\u0094\7\31\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7\20\2\2"+
		"\u0096\u00a0\3\2\2\2\u0097\u0098\7&\2\2\u0098\u0099\7\13\2\2\u0099\u009a"+
		"\5\24\13\2\u009a\u009b\7\f\2\2\u009b\u009c\7\31\2\2\u009c\u009d\5\24\13"+
		"\2\u009d\u009e\7\20\2\2\u009e\u00a0\3\2\2\2\u009fv\3\2\2\2\u009f~\3\2"+
		"\2\2\u009f\u0086\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u0092\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00b8\b\13\1\2\u00a2\u00b8\7\'\2"+
		"\2\u00a3\u00b8\7!\2\2\u00a4\u00b8\7\"\2\2\u00a5\u00b8\7&\2\2\u00a6\u00b8"+
		"\7#\2\2\u00a7\u00a8\7$\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\7\13\2\2\u00aa"+
		"\u00ab\5\24\13\2\u00ab\u00ac\7\f\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\7"+
		"$\2\2\u00ae\u00af\7&\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b8\7\r\2\2\u00b1"+
		"\u00b2\7%\2\2\u00b2\u00b8\5\24\13\4\u00b3\u00b4\7\t\2\2\u00b4\u00b5\5"+
		"\24\13\2\u00b5\u00b6\7\r\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a1\3\2\2\2\u00b7"+
		"\u00a2\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00a5\3\2"+
		"\2\2\u00b7\u00a6\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00d5\3\2\2\2\u00b9\u00ba\f\17"+
		"\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00d4\5\24\13\20\u00bc\u00bd\f\16\2\2\u00bd"+
		"\u00be\7\13\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\f\2\2\u00c0\u00d4"+
		"\3\2\2\2\u00c1\u00c2\f\r\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00d4\7 \2\2\u00c4"+
		"\u00c5\f\f\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00c7\7&\2\2\u00c7\u00d0\7\t"+
		"\2\2\u00c8\u00cd\5\24\13\2\u00c9\u00ca\7\22\2\2\u00ca\u00cc\5\24\13\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\r\2\2\u00d3\u00b9\3\2"+
		"\2\2\u00d3\u00bc\3\2\2\2\u00d3\u00c1\3\2\2\2\u00d3\u00c4\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\25\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\21\32\65;ATZgtz\u009f\u00b7\u00cd\u00d0\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}