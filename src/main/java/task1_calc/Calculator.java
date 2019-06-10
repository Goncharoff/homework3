package task1_calc;

import static task1_calc.Parser.infixToPostfix;

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

class Calculator {
  private String inputExpression;

  Calculator(String inputExpression) {
    this.inputExpression = inputExpression;
  }


  Double calculate() {
    String input = infixToPostfix(inputExpression);
    Deque<Expression> numbers = new ArrayDeque<>();

    Arrays.stream(input.split(" ")).forEach(number -> {
      switch (number) {
        case "+":
          calcSign(numbers, (n1, n2) -> new Plus(n1, n2).interpret());
          break;
        case "-":
          calcSign(numbers, (n1, n2) -> new Minus(n1, n2).interpret());
          break;
        case "*":
          calcSign(numbers, (n1, n2) -> new Multiply(n1, n2).interpret());
          break;
        case "/":
          calcSign(numbers, (n1, n2) -> new Division(n1, n2).interpret());
          break;
        default:
          numbers.push(new Number(Double.parseDouble(number)));
      }
    });

    return numbers.pop().interpret();
  }

  private void calcSign(Deque<Expression> numbers, BiFunction<Expression, Expression, Double> operation) {
    numbers.push(new Number(operation.apply(numbers.pop(), numbers.pop())));
  }


}
