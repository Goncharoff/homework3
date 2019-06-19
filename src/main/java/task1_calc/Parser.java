package task1_calc;

import static task1_calc.Operations.LEFT_BRACKET;
import static task1_calc.Operations.RIGHT_BRACKET;

import java.util.ArrayDeque;
import java.util.Deque;

class Parser {
  String inputExpression;
  private static final String INVALID_EXPRESSION_MESSAGE = "Invalid Expression";


  static String infixToPostfix(String exp) {
    StringBuilder result = new StringBuilder();
    Deque<String> stack = new ArrayDeque<>();

    exp = exp.replaceAll("\\s+", "");
    String[] symbols = exp.split("");

    for (String symbol : symbols) {
      // If the scanned character is an operand, add it to output.
      if (isNumber(symbol)) result.append(symbol).append(" ");
      // If the scanned character is an '(', push it to the stack.
      else if (symbol.equals(LEFT_BRACKET.getOperationSymbol())) stack.push(symbol);
      //If the scanned character is an ')', pop and output from the stack until an '(' is encountered.
      else if (symbol.equals(RIGHT_BRACKET.getOperationSymbol())) {

        while (!stack.isEmpty() && !stack.peek().equals(LEFT_BRACKET.getOperationSymbol())) result.append(stack.pop()).append(" ");
        if (!stack.isEmpty() && !stack.peek().equals(LEFT_BRACKET.getOperationSymbol())) throw new IllegalArgumentException(INVALID_EXPRESSION_MESSAGE);
        else stack.pop();

      } else {
        // an operator is encountered

        while (!stack.isEmpty() && Operations.getOperationPriorityBySymbol(symbol) <= Operations.getOperationPriorityBySymbol(stack.peek())) {

          if (stack.peek().equals(LEFT_BRACKET.getOperationSymbol())) throw new IllegalArgumentException(INVALID_EXPRESSION_MESSAGE);
          result.append(stack.pop()).append(" ");

        }
        stack.push(symbol);
      }

    }


    result.append(popOperationsFromStack(stack));

    return result.toString();
  }

  // pop all the operators from the stack
  private static String popOperationsFromStack(Deque<String> stack) {
    StringBuilder result = new StringBuilder();

    while (!stack.isEmpty()) {
      if (stack.peek().equals(LEFT_BRACKET.getOperationSymbol()))
        throw new IllegalArgumentException(INVALID_EXPRESSION_MESSAGE);

      result.append(stack.pop()).append(" ");
    }

    return result.toString();
  }

  private static boolean isNumber(String token) {
    try {
      Double.parseDouble(token);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

}
