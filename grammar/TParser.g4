parser grammar TParser;

options {
	tokenVocab = TLexer;
}

root: expr EOF;

expr: Id                            # idential
    | Int                           # value
    | Float                         # value 
    | func                          # function
    | un_op expr                    # unary_operation
    | expr bin_op expr              # binary_operation
    | OpenPar expr ClosePar         # brackets_operation
    | expr Qmark expr Colon expr    # ternary_operation
    ;

un_op: op=Minus;
bin_op: op=(Plus | Minus | Mul | Div | And 
        | Or | LEQ | GEQ | LT | GT | Equal);

func: Id OpenPar expr (Comma expr)* ClosePar;
