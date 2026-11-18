package org.ioopm.calculator.ast;

public abstract class SymbolicExpression {

    public boolean isConstant() {
        return false;
    }

    public double getValue() {
        throw new RuntimeException("getValue() called on expression without a value");
    }

    public String getName() {
        throw new RuntimeException("getName() called on expression with no operator");
    }
}