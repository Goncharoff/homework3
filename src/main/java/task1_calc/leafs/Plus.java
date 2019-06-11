package task1_calc.leafs;

import task1_calc.Expression;

public class Plus implements Expression {
  private Expression left;
  private Expression right;

  public Plus(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public  double calculate() {
    return left.calculate() + right.calculate();
  }
}
