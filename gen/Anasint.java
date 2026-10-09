// Generated from C:/Users/practica/Downloads/ejercicio_2/src/Anasint.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESQUEMA=1, FUENTE=2, DATOS=3, DESTINO=4, RESTRICCIONES=5, VAR=6, IMPLICA=7, 
		PA=8, PC=9, COMA=10, PyC=11, NUMERO=12, IDENT=13, WS=14;
	public static final int
		RULE_programa = 0, RULE_esquemaFuente = 1, RULE_datosFuente = 2, RULE_esquemaDestino = 3, 
		RULE_restricciones = 4, RULE_elementoEsquema = 5, RULE_atributos = 6, 
		RULE_elementoDato = 7, RULE_datos = 8, RULE_dato = 9, RULE_restriccion = 10, 
		RULE_variables = 11, RULE_implicacion = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "esquemaFuente", "datosFuente", "esquemaDestino", "restricciones", 
			"elementoEsquema", "atributos", "elementoDato", "datos", "dato", "restriccion", 
			"variables", "implicacion"
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

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public EsquemaFuenteContext esquemaFuente() {
			return getRuleContext(EsquemaFuenteContext.class,0);
		}
		public DatosFuenteContext datosFuente() {
			return getRuleContext(DatosFuenteContext.class,0);
		}
		public EsquemaDestinoContext esquemaDestino() {
			return getRuleContext(EsquemaDestinoContext.class,0);
		}
		public RestriccionesContext restricciones() {
			return getRuleContext(RestriccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			esquemaFuente();
			setState(27);
			datosFuente();
			setState(28);
			esquemaDestino();
			setState(29);
			restricciones();
			setState(30);
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
	public static class EsquemaFuenteContext extends ParserRuleContext {
		public TerminalNode ESQUEMA() { return getToken(Anasint.ESQUEMA, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<ElementoEsquemaContext> elementoEsquema() {
			return getRuleContexts(ElementoEsquemaContext.class);
		}
		public ElementoEsquemaContext elementoEsquema(int i) {
			return getRuleContext(ElementoEsquemaContext.class,i);
		}
		public EsquemaFuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esquemaFuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEsquemaFuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEsquemaFuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEsquemaFuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsquemaFuenteContext esquemaFuente() throws RecognitionException {
		EsquemaFuenteContext _localctx = new EsquemaFuenteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_esquemaFuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ESQUEMA);
			setState(33);
			match(FUENTE);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				elementoEsquema();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
	public static class DatosFuenteContext extends ParserRuleContext {
		public TerminalNode DATOS() { return getToken(Anasint.DATOS, 0); }
		public TerminalNode FUENTE() { return getToken(Anasint.FUENTE, 0); }
		public List<ElementoDatoContext> elementoDato() {
			return getRuleContexts(ElementoDatoContext.class);
		}
		public ElementoDatoContext elementoDato(int i) {
			return getRuleContext(ElementoDatoContext.class,i);
		}
		public DatosFuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datosFuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDatosFuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDatosFuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDatosFuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatosFuenteContext datosFuente() throws RecognitionException {
		DatosFuenteContext _localctx = new DatosFuenteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datosFuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DATOS);
			setState(40);
			match(FUENTE);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				elementoDato();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
	public static class EsquemaDestinoContext extends ParserRuleContext {
		public TerminalNode ESQUEMA() { return getToken(Anasint.ESQUEMA, 0); }
		public TerminalNode DESTINO() { return getToken(Anasint.DESTINO, 0); }
		public List<ElementoEsquemaContext> elementoEsquema() {
			return getRuleContexts(ElementoEsquemaContext.class);
		}
		public ElementoEsquemaContext elementoEsquema(int i) {
			return getRuleContext(ElementoEsquemaContext.class,i);
		}
		public EsquemaDestinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esquemaDestino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEsquemaDestino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEsquemaDestino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEsquemaDestino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsquemaDestinoContext esquemaDestino() throws RecognitionException {
		EsquemaDestinoContext _localctx = new EsquemaDestinoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_esquemaDestino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ESQUEMA);
			setState(47);
			match(DESTINO);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				elementoEsquema();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
	public static class RestriccionesContext extends ParserRuleContext {
		public TerminalNode RESTRICCIONES() { return getToken(Anasint.RESTRICCIONES, 0); }
		public List<RestriccionContext> restriccion() {
			return getRuleContexts(RestriccionContext.class);
		}
		public RestriccionContext restriccion(int i) {
			return getRuleContext(RestriccionContext.class,i);
		}
		public RestriccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRestricciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRestricciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRestricciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionesContext restricciones() throws RecognitionException {
		RestriccionesContext _localctx = new RestriccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restricciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(RESTRICCIONES);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				restriccion();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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
	public static class ElementoEsquemaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ElementoEsquemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoEsquema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterElementoEsquema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitElementoEsquema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitElementoEsquema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoEsquemaContext elementoEsquema() throws RecognitionException {
		ElementoEsquemaContext _localctx = new ElementoEsquemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementoEsquema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENT);
			setState(60);
			match(PA);
			setState(61);
			atributos();
			setState(62);
			match(PC);
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
	public static class AtributosContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atributos);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IDENT);
				setState(65);
				match(COMA);
				setState(66);
				atributos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(IDENT);
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
	public static class ElementoDatoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ElementoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterElementoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitElementoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitElementoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoDatoContext elementoDato() throws RecognitionException {
		ElementoDatoContext _localctx = new ElementoDatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementoDato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENT);
			setState(71);
			match(PA);
			setState(72);
			datos();
			setState(73);
			match(PC);
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
	public static class DatosContext extends ParserRuleContext {
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public DatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatosContext datos() throws RecognitionException {
		DatosContext _localctx = new DatosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datos);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				dato();
				setState(76);
				match(COMA);
				setState(77);
				datos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				dato();
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
	public static class DatoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==IDENT) ) {
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
	public static class RestriccionContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ImplicacionContext implicacion() {
			return getRuleContext(ImplicacionContext.class,0);
		}
		public RestriccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRestriccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRestriccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRestriccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionContext restriccion() throws RecognitionException {
		RestriccionContext _localctx = new RestriccionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_restriccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			variables();
			setState(85);
			implicacion();
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
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VAR);
			setState(88);
			atributos();
			setState(89);
			match(PyC);
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
	public static class ImplicacionContext extends ParserRuleContext {
		public List<ElementoDatoContext> elementoDato() {
			return getRuleContexts(ElementoDatoContext.class);
		}
		public ElementoDatoContext elementoDato(int i) {
			return getRuleContext(ElementoDatoContext.class,i);
		}
		public TerminalNode IMPLICA() { return getToken(Anasint.IMPLICA, 0); }
		public ImplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterImplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitImplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitImplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicacionContext implicacion() throws RecognitionException {
		ImplicacionContext _localctx = new ImplicacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_implicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			elementoDato();
			setState(92);
			match(IMPLICA);
			setState(93);
			elementoDato();
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
		"\u0004\u0001\u000e`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001$\b\u0001"+
		"\u000b\u0001\f\u0001%\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u00032\b\u0003\u000b\u0003\f\u00033\u0001\u0004\u0001\u0004\u0004\u0004"+
		"8\b\u0004\u000b\u0004\f\u00049\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006E\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000"+
		"\f\rX\u0000\u001a\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000"+
		"\u0004\'\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b5\u0001"+
		"\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000"+
		"\u000eF\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000\u0000\u0012R"+
		"\u0001\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016W\u0001\u0000"+
		"\u0000\u0000\u0018[\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001"+
		"\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0003\u0006\u0003"+
		"\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f\u0005\u0000\u0000\u0001"+
		"\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!#\u0005"+
		"\u0002\u0000\u0000\"$\u0003\n\u0005\u0000#\"\u0001\u0000\u0000\u0000$"+
		"%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000(*\u0005"+
		"\u0002\u0000\u0000)+\u0003\u000e\u0007\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/1\u0005"+
		"\u0004\u0000\u000002\u0003\n\u0005\u000010\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4\u0007\u0001\u0000\u0000\u000057\u0005\u0005\u0000\u000068\u0003\u0014"+
		"\n\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005"+
		"\r\u0000\u0000<=\u0005\b\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005\t\u0000"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\r\u0000\u0000AB\u0005\n"+
		"\u0000\u0000BE\u0003\f\u0006\u0000CE\u0005\r\u0000\u0000D@\u0001\u0000"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000E\r\u0001\u0000\u0000\u0000FG\u0005"+
		"\r\u0000\u0000GH\u0005\b\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0005\t\u0000"+
		"\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0003\u0012\t\u0000LM\u0005\n"+
		"\u0000\u0000MN\u0003\u0010\b\u0000NQ\u0001\u0000\u0000\u0000OQ\u0003\u0012"+
		"\t\u0000PK\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0011\u0001"+
		"\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u0013\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0016\u000b\u0000UV\u0003\u0018\f\u0000V\u0015\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0006\u0000\u0000XY\u0003\f\u0006\u0000YZ\u0005\u000b"+
		"\u0000\u0000Z\u0017\u0001\u0000\u0000\u0000[\\\u0003\u000e\u0007\u0000"+
		"\\]\u0005\u0007\u0000\u0000]^\u0003\u000e\u0007\u0000^\u0019\u0001\u0000"+
		"\u0000\u0000\u0006%,39DP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}