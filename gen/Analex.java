// Generated from C:/Users/practica/Downloads/ejercicio_2/src/Analex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESQUEMA=1, FUENTE=2, DATOS=3, DESTINO=4, RESTRICCIONES=5, VAR=6, IMPLICA=7, 
		PA=8, PC=9, COMA=10, PyC=11, NUMERO=12, IDENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESQUEMA", "FUENTE", "DATOS", "DESTINO", "RESTRICCIONES", "VAR", "IMPLICA", 
			"PA", "PC", "COMA", "PyC", "NUMERO", "IDENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ESQUEMA'", "'FUENTE'", "'DATOS'", "'DESTINO'", "'RESTRICCIONES'", 
			"'VAR'", "'implica'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESQUEMA", "FUENTE", "DATOS", "DESTINO", "RESTRICCIONES", "VAR", 
			"IMPLICA", "PA", "PC", "COMA", "PyC", "NUMERO", "IDENT", "WS"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\u0004\u0000\u000eo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000b^\b\u000b\u000b\u000b\f\u000b_\u0001\f\u0001\f\u0005\fd\b\f\n\f"+
		"\f\fg\t\f\u0001\r\u0004\rj\b\r\u000b\r\f\rk\u0001\r\u0001\r\u0000\u0000"+
		"\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  q\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000"+
		"\u0005,\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t:\u0001"+
		"\u0000\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000"+
		"\u0000\u000fT\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013"+
		"X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017]\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bi\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005E\u0000\u0000\u001e\u001f\u0005S\u0000\u0000\u001f"+
		" \u0005Q\u0000\u0000 !\u0005U\u0000\u0000!\"\u0005E\u0000\u0000\"#\u0005"+
		"M\u0000\u0000#$\u0005A\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005"+
		"F\u0000\u0000&\'\u0005U\u0000\u0000\'(\u0005E\u0000\u0000()\u0005N\u0000"+
		"\u0000)*\u0005T\u0000\u0000*+\u0005E\u0000\u0000+\u0004\u0001\u0000\u0000"+
		"\u0000,-\u0005D\u0000\u0000-.\u0005A\u0000\u0000./\u0005T\u0000\u0000"+
		"/0\u0005O\u0000\u000001\u0005S\u0000\u00001\u0006\u0001\u0000\u0000\u0000"+
		"23\u0005D\u0000\u000034\u0005E\u0000\u000045\u0005S\u0000\u000056\u0005"+
		"T\u0000\u000067\u0005I\u0000\u000078\u0005N\u0000\u000089\u0005O\u0000"+
		"\u00009\b\u0001\u0000\u0000\u0000:;\u0005R\u0000\u0000;<\u0005E\u0000"+
		"\u0000<=\u0005S\u0000\u0000=>\u0005T\u0000\u0000>?\u0005R\u0000\u0000"+
		"?@\u0005I\u0000\u0000@A\u0005C\u0000\u0000AB\u0005C\u0000\u0000BC\u0005"+
		"I\u0000\u0000CD\u0005O\u0000\u0000DE\u0005N\u0000\u0000EF\u0005E\u0000"+
		"\u0000FG\u0005S\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005V\u0000"+
		"\u0000IJ\u0005A\u0000\u0000JK\u0005R\u0000\u0000K\f\u0001\u0000\u0000"+
		"\u0000LM\u0005i\u0000\u0000MN\u0005m\u0000\u0000NO\u0005p\u0000\u0000"+
		"OP\u0005l\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005c\u0000\u0000RS\u0005"+
		"a\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005(\u0000\u0000U\u0010"+
		"\u0001\u0000\u0000\u0000VW\u0005)\u0000\u0000W\u0012\u0001\u0000\u0000"+
		"\u0000XY\u0005,\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005;\u0000"+
		"\u0000[\u0016\u0001\u0000\u0000\u0000\\^\u0007\u0000\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\u0018\u0001\u0000\u0000\u0000ae\u0007\u0001"+
		"\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\u001a\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0007\u0003"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0006\r\u0000\u0000n\u001c\u0001\u0000\u0000\u0000\u0004\u0000_ek\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}