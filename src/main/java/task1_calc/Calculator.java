package task1_calc;

import task1_calc.leafs.Minus;
import task1_calc.leafs.Number;
import task1_calc.leafs.Plus;

import java.util.Stack;

public class Calculator {
    String inputExpression;

    public double calculate(String expression) {
        Stack<Expression> stack = new Stack<Expression>();
        double result = 0;

        for (String token : infixToPostfix(expression).split("")) {

            if (isOperator(token)) {
                Expression exp = null;
                if (token.equals("+")) {
                    exp = stack.push(new Plus(stack.pop(), stack.pop()));
                } else if (token.equals("-")) {
                    exp = stack.push(new Minus(stack.pop(), stack.pop()));
                }

                if (exp != null) {
                    result = exp.interpret();
                    stack.push(new Number(result));
                }
            }


            if (isNumber(token)) {
                stack.push(new Number(Double.parseDouble(token)));
            }


        }

        return result;
    }


    public String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = "";

        // initializing empty stack
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')', pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
