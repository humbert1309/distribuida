package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]

WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}

"select"+(" ")*+("*")+((" ")+)+"from"+((" ")+)+({L}+)+((" ")*)+";" {lexeme=yytext(); return SELECDIR;} 
"select"+((" ")+)+(({L}+))+((" ")+)+"from"+((" ")+)+({L}+)+((" ")*)+";" {lexeme=yytext(); return SELEC;} 
"select"+((" ")+)+((({L}+)+","+({L}+))+)+((" ")+)+"from"+((" ")+)+({L}+)+((" ")*)+";" {lexeme=yytext(); return SELEC;} 
"select"+((" ")+)+((({L}+))|((({L}+)+","+({L}+))+)|("*"))+((" ")+)+"from"+((" ")+)+({L}+)+((" ")+)+"where"+"="+(({D}+)|("'"+({L})+"'"))+((" ")*)+";" {lexeme=yytext(); return SELEC;} 
"select"+((" ")+)+("*")+(" ")+"from"+((" ")+)+((({L}+)+","+({L}+))+)+((" ")+)+"where"+" "+({L}+)+"."+({L}+)+"="+({L}+)+"."+({L}+)+((" ")*)+";" {lexeme=yytext(); return SELEC;}


"insert"+((" ")+)+"into"+((" ")+)+({L}+)+((" ")+)+((("(")|("'"+({L}+)+"'"+",")|("'"+({L}+)+"'")|(({D}+)+",")|({D}+)|(")"))*)+((" ")*)+"values"+((" ")*)+((("(")|("'"+({L}+)+"'"+",")|("'"+({L}+)+"'")|(({D}+)+",")|({D}+)|(")"))+)+((" ")*)+";" {lexeme=yytext(); return SELECDIR;} 


"delete"+((" ")+)+"from"+((" ")+)+({L}+)+((" ")+)+"where"+((" ")+)+({L}+)+"="+(({D}+)|("'"+({L}+)+"'"))+((" ")*)+";" {lexeme=yytext(); return DELET;} 
"delete"+((" ")+)+(((({L}+))|((({L}+)+","+({L}+))+))*)+((" ")+)+"from"+((" ")+)+((({L}+)+","+({L}+))+)+((" ")+)+"where"+" "+((({L}+)+"."+({L}+)+"="+({L}+)+"."+({L}+)+((" ")*))+)+";" {lexeme=yytext(); return DELET;} 

"update"+((" ")+)+({L}*)+((" ")+)+"set"+((" ")+)+({L}+)+"="+(({D}+)|("'"+({L})+"'"))+((" ")*)+";" {lexeme=yytext(); return UPDAT;} 
"update"+((" ")+)+(((({L}+))|(({L}+)+","+(({L}+))+))*)+((" ")+)+"set"+((" ")+)+({L}+)+"."+({L}+)+"="+({L}+)+"."+({L}+)+((" ")+)+"where"+((" ")+)+({L}+)+"."+({L}+)+"="+({L}+)+"."+({L}+)+((" ")*)+";" {lexeme=yytext(); return UPDAT;} 

. {return ERROR;}


