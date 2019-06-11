package task1_calc;

import static task1_calc.Parser.infixToPostfix;

import java.security.cert.Extension;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiFunction;
import task1_calc.leafs.Division;
import task1_calc.leafs.Minus;
import task1_calc.leafs.Multiply;
import task1_calc.leafs.Number;
import task1_calc.leafs.Plus;

class Calculator implements Expression {

  private String inputExpression;

  Calculator(String inputExpression) {
    this.inputExpression = inputExpression;
  }


  @Override
  public double calculate() {
    String input = infixToPostfix(inputExpression);
    Deque<Expression> expressionsStack = new ArrayDeque<>();

    Arrays.stream(input.split(" "))
            .forEach(expression -> expressionsStack.push(getExpressionFromInputStringOperator(expressionsStack, expression)));

    return expressionsStack.pop().calculate();
  }

  /**
   * Method for returning number expression or result of expression calculating
   *
   * @param expressions - stack of expressions
   * @param expression  - expression as string
   * @return result expression
   */
  private Expression getExpressionFromInputStringOperator(Deque<Expression> expressions, String expression) {
    return isNumber(expression) ? getNumberExpression(expression) : getSignOperationResult(expressions, expression);
  }

  /**
   * Get result from expression operations
   *
   * @param expressions stack of expressions
   * @param expression  expression as string
   * @return result of calculating expression
   */
  private Expression getSignOperationResult(Deque<Expression> expressions, String expression) {
    Operations operation = Operations.getOperationBySymbol(expression);
    return ExpressionFactory.getExpression(operation, expressions.poll(), expressions.poll());
  }

  /**
   * Returns number from expression
   *
   * @param expression as string
   * @return number in double format
   */
  private Expression getNumberExpression(String expression) {
    return new Number(Double.parseDouble(expression));
  }

  /**
   * Check if input string is number
   *
   * @param token - string input symbol
   * @return true if number, else - false
   */
  private boolean isNumber(String token) {
    try {
      Double.parseDouble(token);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }
}
