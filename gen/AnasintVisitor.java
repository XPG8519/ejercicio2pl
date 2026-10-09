// Generated from C:/Users/practica/Downloads/ejercicio_2/src/Anasint.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#esquemaFuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsquemaFuente(Anasint.EsquemaFuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#datosFuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatosFuente(Anasint.DatosFuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#esquemaDestino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsquemaDestino(Anasint.EsquemaDestinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricciones(Anasint.RestriccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elementoEsquema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoEsquema(Anasint.ElementoEsquemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(Anasint.AtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elementoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoDato(Anasint.ElementoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos(Anasint.DatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(Anasint.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#restriccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccion(Anasint.RestriccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#implicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicacion(Anasint.ImplicacionContext ctx);
}