package task1_calc.leafs;

import task1_calc.Expression;

public class Multiply implements Expression {
    Expression left;
    Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double interpret() {

        return right.interpret() * left.interpret();
    }
}
