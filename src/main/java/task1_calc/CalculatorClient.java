package task1_calc;

public class CalculatorClient {
  public static void main(String[] args) {

    //  System.out.println(new Calculator().calculate("(1 + 2) * 4 + 5 * (3 + 6)"));
    //System.out.println(new Calculator().calc("(1 + 2) * 4 + 5 * (3 + 6)"));

    System.out.println(new Calculator("(1 + 2) * 4 + 5 * (3 + 6)").calculate());
    System.out.println(new Calculator("3 * 4").calculate());
    System.out.println(new Calculator("1 + 2 - 3").calculate());
  }
}
