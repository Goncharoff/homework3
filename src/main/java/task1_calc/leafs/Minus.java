package task1_calc.leafs;

import task1_calc.Expression;

public class Minus implements Expression {
  private Expression left;
  private Expression right;


  public Minus(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public double calculate() {
    return right.calculate() - left.calculate();
  }
}
