// Generated from c:/Users/Igor/Desktop/c++/MathExpressionParser/grammar/TLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plus=1, Minus=2, Mul=3, Div=4, LT=5, GT=6, LEQ=7, GEQ=8, Equal=9, And=10, 
		Or=11, OpenPar=12, ClosePar=13, Comma=14, Dot=15, Qmark=16, Colon=17, 
		Int=18, Float=19, Id=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Plus", "Minus", "Mul", "Div", "LT", "GT", "LEQ", "GEQ", "Equal", "And", 
			"Or", "OpenPar", "ClosePar", "Comma", "Dot", "Qmark", "Colon", "Digit", 
			"Int", "Float", "Letter", "Id", "WS"
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


	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLexer.g4"; }

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
		"\u0004\u0000\u0015z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"Z\b\u0012\u000b\u0012\f\u0012[\u0001\u0013\u0005\u0013_\b\u0013\n\u0013"+
		"\f\u0013b\t\u0013\u0001\u0013\u0001\u0013\u0004\u0013f\b\u0013\u000b\u0013"+
		"\f\u0013g\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015o\b\u0015\n\u0015\f\u0015r\t\u0015\u0001\u0016\u0004\u0016"+
		"u\b\u0016\u000b\u0016\f\u0016v\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0012\'\u0013)\u0000+\u0014-\u0015"+
		"\u0001\u0000\u0003\u0001\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r "+
		" }\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00053"+
		"\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f>\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013D"+
		"\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017J\u0001\u0000"+
		"\u0000\u0000\u0019L\u0001\u0000\u0000\u0000\u001bN\u0001\u0000\u0000\u0000"+
		"\u001dP\u0001\u0000\u0000\u0000\u001fR\u0001\u0000\u0000\u0000!T\u0001"+
		"\u0000\u0000\u0000#V\u0001\u0000\u0000\u0000%Y\u0001\u0000\u0000\u0000"+
		"\'`\u0001\u0000\u0000\u0000)i\u0001\u0000\u0000\u0000+k\u0001\u0000\u0000"+
		"\u0000-t\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\u0002\u0001\u0000"+
		"\u0000\u000012\u0005-\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"*\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005/\u0000\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0005<\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005"+
		">\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005<\u0000\u0000<=\u0005"+
		"=\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005>\u0000\u0000?@\u0005"+
		"=\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000BC\u0005"+
		"=\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005&\u0000\u0000EF\u0005"+
		"&\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0005|\u0000\u0000HI\u0005"+
		"|\u0000\u0000I\u0016\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000K\u0018"+
		"\u0001\u0000\u0000\u0000LM\u0005)\u0000\u0000M\u001a\u0001\u0000\u0000"+
		"\u0000NO\u0005,\u0000\u0000O\u001c\u0001\u0000\u0000\u0000PQ\u0005.\u0000"+
		"\u0000Q\u001e\u0001\u0000\u0000\u0000RS\u0005?\u0000\u0000S \u0001\u0000"+
		"\u0000\u0000TU\u0005:\u0000\u0000U\"\u0001\u0000\u0000\u0000VW\u0007\u0000"+
		"\u0000\u0000W$\u0001\u0000\u0000\u0000XZ\u0003#\u0011\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\&\u0001\u0000\u0000\u0000]_\u0003#\u0011\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0003\u001d\u000e\u0000df\u0003#\u0011\u0000ed\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h(\u0001\u0000\u0000\u0000ij\u0007\u0001\u0000\u0000j*\u0001"+
		"\u0000\u0000\u0000kp\u0003)\u0014\u0000lo\u0003)\u0014\u0000mo\u00020"+
		"9\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q,\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0007\u0002\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u0016"+
		"\u0000\u0000y.\u0001\u0000\u0000\u0000\u0007\u0000[`gnpv\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}