// Analizador sintáctico lenguaje expr
parser grammar Anasint;

options{
 tokenVocab=Analex;
}

programa : esquemaFuente datosFuente esquemaDestino restricciones EOF ;

esquemaFuente : ESQUEMA FUENTE elementoEsquema+ ;

datosFuente : DATOS FUENTE elementoDato+ ;

esquemaDestino : ESQUEMA DESTINO elementoEsquema+ ;

restricciones : RESTRICCIONES restriccion+ ;

elementoEsquema : IDENT PA atributos PC ;

atributos : IDENT COMA atributos
          | IDENT
          ;

elementoDato : IDENT PA datos PC ;

datos : dato COMA datos
      | dato
      ;

dato : IDENT
     | NUMERO ;

restriccion : variables implicacion ;

variables : VAR atributos PyC ;

implicacion : elementoDato IMPLICA elementoDato ;