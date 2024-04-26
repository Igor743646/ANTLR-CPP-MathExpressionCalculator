// Generated from c:/Users/Igor/Desktop/c++/MathExpressionParser/grammar/TParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plus=1, Minus=2, Mul=3, Div=4, LT=5, GT=6, LEQ=7, GEQ=8, Equal=9, And=10, 
		Or=11, OpenPar=12, ClosePar=13, Comma=14, Dot=15, Qmark=16, Colon=17, 
		Int=18, Float=19, Id=20, WS=21;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_un_op = 2, RULE_bin_op = 3, RULE_func = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "un_op", "bin_op", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'&&'", "'||'", "'('", "')'", "','", "'.'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Plus", "Minus", "Mul", "Div", "LT", "GT", "LEQ", "GEQ", "Equal", 
			"And", "Or", "OpenPar", "ClosePar", "Comma", "Dot", "Qmark", "Colon", 
			"Int", "Float", "Id", "WS"
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
	public String getGrammarFileName() { return "TParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			expr(0);
			setState(11);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ExprContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FunctionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Brackets_operationContext extends ExprContext {
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public Brackets_operationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentialContext extends ExprContext {
		public TerminalNode Id() { return getToken(TParser.Id, 0); }
		public IdentialContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ExprContext {
		public TerminalNode Int() { return getToken(TParser.Int, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public ValueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operationContext extends ExprContext {
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_operationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Binary_operationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ternary_operationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Qmark() { return getToken(TParser.Qmark, 0); }
		public TerminalNode Colon() { return getToken(TParser.Colon, 0); }
		public Ternary_operationContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new IdentialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(14);
				match(Id);
				}
				break;
			case 2:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(Int);
				}
				break;
			case 3:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(Float);
				}
				break;
			case 4:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				func();
				}
				break;
			case 5:
				{
				_localctx = new Unary_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				un_op();
				setState(19);
				expr(4);
				}
				break;
			case 6:
				{
				_localctx = new Brackets_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(OpenPar);
				setState(22);
				expr(0);
				setState(23);
				match(ClosePar);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_operationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(27);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(28);
						bin_op();
						setState(29);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Ternary_operationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(32);
						match(Qmark);
						setState(33);
						expr(0);
						setState(34);
						match(Colon);
						setState(35);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Un_opContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Minus() { return getToken(TParser.Minus, 0); }
		public Un_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_op; }
	}

	public final Un_opContext un_op() throws RecognitionException {
		Un_opContext _localctx = new Un_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_un_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((Un_opContext)_localctx).op = match(Minus);
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
	public static class Bin_opContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Plus() { return getToken(TParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TParser.Minus, 0); }
		public TerminalNode Mul() { return getToken(TParser.Mul, 0); }
		public TerminalNode Div() { return getToken(TParser.Div, 0); }
		public TerminalNode And() { return getToken(TParser.And, 0); }
		public TerminalNode Or() { return getToken(TParser.Or, 0); }
		public TerminalNode LEQ() { return getToken(TParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(TParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(TParser.LT, 0); }
		public TerminalNode GT() { return getToken(TParser.GT, 0); }
		public TerminalNode Equal() { return getToken(TParser.Equal, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((Bin_opContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4094L) != 0)) ) {
				((Bin_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(TParser.Id, 0); }
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public List<TerminalNode> Comma() { return getTokens(TParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TParser.Comma, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Id);
			setState(47);
			match(OpenPar);
			setState(48);
			expr(0);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(49);
				match(Comma);
				setState(50);
				expr(0);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(ClosePar);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00044\b\u0004\n\u0004"+
		"\f\u00047\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001\u0002"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0001\u000b="+
		"\u0000\n\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b.\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000"+
		"\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0006\u0001\uffff\uffff"+
		"\u0000\u000e\u001a\u0005\u0014\u0000\u0000\u000f\u001a\u0005\u0012\u0000"+
		"\u0000\u0010\u001a\u0005\u0013\u0000\u0000\u0011\u001a\u0003\b\u0004\u0000"+
		"\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0003\u0002\u0001\u0004"+
		"\u0014\u001a\u0001\u0000\u0000\u0000\u0015\u0016\u0005\f\u0000\u0000\u0016"+
		"\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0005\r\u0000\u0000\u0018\u001a"+
		"\u0001\u0000\u0000\u0000\u0019\r\u0001\u0000\u0000\u0000\u0019\u000f\u0001"+
		"\u0000\u0000\u0000\u0019\u0010\u0001\u0000\u0000\u0000\u0019\u0011\u0001"+
		"\u0000\u0000\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0015\u0001"+
		"\u0000\u0000\u0000\u001a\'\u0001\u0000\u0000\u0000\u001b\u001c\n\u0003"+
		"\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0003\u0002"+
		"\u0001\u0004\u001e&\u0001\u0000\u0000\u0000\u001f \n\u0001\u0000\u0000"+
		" !\u0005\u0010\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0005\u0011\u0000"+
		"\u0000#$\u0003\u0002\u0001\u0002$&\u0001\u0000\u0000\u0000%\u001b\u0001"+
		"\u0000\u0000\u0000%\u001f\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000"+
		"+\u0005\u0001\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000-\u0007\u0001"+
		"\u0000\u0000\u0000./\u0005\u0014\u0000\u0000/0\u0005\f\u0000\u000005\u0003"+
		"\u0002\u0001\u000012\u0005\u000e\u0000\u000024\u0003\u0002\u0001\u0000"+
		"31\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0005\r\u0000\u00009\t\u0001\u0000\u0000\u0000\u0004\u0019"+
		"%\'5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}