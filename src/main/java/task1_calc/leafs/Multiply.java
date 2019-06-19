package task1_calc.leafs;

import task1_calc.Expression;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;


    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {

        return right.calculate() * left.calculate();
    }
}
