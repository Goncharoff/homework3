package task1_calc.leafs;

import task1_calc.Expression;

public class Plus implements Expression {
  Expression left;
  Expression right;

  public Plus(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  public  double interpret() {
    return left.interpret() + right.interpret();
  }
}
