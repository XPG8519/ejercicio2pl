// Generated from C:/Users/practica/Downloads/ejercicio_2/src/Anasint.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#esquemaFuente}.
	 * @param ctx the parse tree
	 */
	void enterEsquemaFuente(Anasint.EsquemaFuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#esquemaFuente}.
	 * @param ctx the parse tree
	 */
	void exitEsquemaFuente(Anasint.EsquemaFuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#datosFuente}.
	 * @param ctx the parse tree
	 */
	void enterDatosFuente(Anasint.DatosFuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#datosFuente}.
	 * @param ctx the parse tree
	 */
	void exitDatosFuente(Anasint.DatosFuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#esquemaDestino}.
	 * @param ctx the parse tree
	 */
	void enterEsquemaDestino(Anasint.EsquemaDestinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#esquemaDestino}.
	 * @param ctx the parse tree
	 */
	void exitEsquemaDestino(Anasint.EsquemaDestinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 */
	void enterRestricciones(Anasint.RestriccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 */
	void exitRestricciones(Anasint.RestriccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#elementoEsquema}.
	 * @param ctx the parse tree
	 */
	void enterElementoEsquema(Anasint.ElementoEsquemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#elementoEsquema}.
	 * @param ctx the parse tree
	 */
	void exitElementoEsquema(Anasint.ElementoEsquemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(Anasint.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(Anasint.AtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#elementoDato}.
	 * @param ctx the parse tree
	 */
	void enterElementoDato(Anasint.ElementoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#elementoDato}.
	 * @param ctx the parse tree
	 */
	void exitElementoDato(Anasint.ElementoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#datos}.
	 * @param ctx the parse tree
	 */
	void enterDatos(Anasint.DatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#datos}.
	 * @param ctx the parse tree
	 */
	void exitDatos(Anasint.DatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(Anasint.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(Anasint.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#restriccion}.
	 * @param ctx the parse tree
	 */
	void enterRestriccion(Anasint.RestriccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#restriccion}.
	 * @param ctx the parse tree
	 */
	void exitRestriccion(Anasint.RestriccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#implicacion}.
	 * @param ctx the parse tree
	 */
	void enterImplicacion(Anasint.ImplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#implicacion}.
	 * @param ctx the parse tree
	 */
	void exitImplicacion(Anasint.ImplicacionContext ctx);
}