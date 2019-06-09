package task1_calc;

public class CalculatorClient {
    public static void main(String[] args) {
        System.out.println(new Calculator().infixToPostfix("5+23"));
        System.out.println(new Calculator().infixToPostfix("5-2+1"));

    }
}
