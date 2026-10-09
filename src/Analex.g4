lexer grammar Analex;

// Palabras reservadas
ESQUEMA       : 'ESQUEMA';
FUENTE        : 'FUENTE';
DATOS         : 'DATOS';
DESTINO       : 'DESTINO';
RESTRICCIONES : 'RESTRICCIONES';
VAR           : 'VAR';

// Operadores y símbolos
IMPLICA : 'implica';
PA      : '(';
PC      : ')';
COMA    : ',';
PyC     : ';';

// Números
NUMERO : [0-9]+;

// Identificadores
IDENT : [a-zA-Z] [a-zA-Z0-9_]*;

// Ignorar espacios y saltos de línea
WS : [ \t\r\n]+ -> skip;