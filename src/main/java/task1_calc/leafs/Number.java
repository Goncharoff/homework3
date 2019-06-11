package task1_calc.leafs;

import task1_calc.Expression;

public class Number implements Expression {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double calculate() {
        return number;
    }
}
