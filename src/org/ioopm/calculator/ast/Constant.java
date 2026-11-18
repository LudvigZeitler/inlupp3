package org.ioopm.calculator.ast;

public class Constant extends Atom {
    private double value;

    public Constant (double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public boolean isConstant() {
        return true;
    }

    public String toString() {
        return "" + this.value;
    }
}