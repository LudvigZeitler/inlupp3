package org.ioopm.calculator.ast;

public class Negation extends Unary {
    
    public Negation (SymbolicExpression arg) {
        super(arg);
    }

    public String getName() {
        return "NEG";
    }
}