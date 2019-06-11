package task1_calc;

import task1_calc.leafs.Division;
import task1_calc.leafs.Minus;
import task1_calc.leafs.Multiply;
import task1_calc.leafs.Plus;

public class ExpressionFactory {

  private ExpressionFactory() {
    }

  public static Expression getExpression(Operations operations, Expression firstExpression, Expression secondExpression) {
    Expression result;

    switch (operations) {
      case PLUS:
        result = new Plus(firstExpression, secondExpression);
        break;
      case MINUS:
        result = new Minus(firstExpression, secondExpression);
        break;
      case MULTIPLY:
        result = new Multiply(firstExpression, secondExpression);
        break;
      case DIVISION:
        result = new Division(firstExpression, secondExpression);
        break;
      default:
        throw new IllegalArgumentException("Illegal input parameter");
    }

    return result;
  }
}
