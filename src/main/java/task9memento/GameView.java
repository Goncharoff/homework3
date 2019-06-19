package task9memento;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameView {
  private static int[][] initGameField = {{0, 0, 0},
          {0, 0, 0},
          {0, 0, 0}};

  private static final int EMPTY_SYMBOL_CODE = 0;
  public static final int X_CODE = 1;
  public static final int O_CODE = 2;
  private static final String X_SYMBOL = "X";
  private static final String O_SYMBOL = "O";
  private static final String EMPTY_SYMBOL = "-";
  private static final String SEPARATE_SYMBOL = "|";


  public void renderGameField(int[][] currentGameField) {
    eachTurnMessages();
    Arrays.stream(currentGameField).peek(it -> System.out.println())
            .flatMapToInt(Arrays::stream)
            .forEach(element -> System.out.print(SEPARATE_SYMBOL + " " + checkSymbol(element) + " " + SEPARATE_SYMBOL));
  }


  private String checkSymbol(int gameFieldItem) {

    switch (gameFieldItem) {
      case EMPTY_SYMBOL_CODE:
        return EMPTY_SYMBOL;
      case X_CODE:
        return X_SYMBOL;
      case O_CODE:
        return O_SYMBOL;
      default:
        throw new IllegalArgumentException("There is not such code symbol = " + gameFieldItem);
    }
  }

  private void eachTurnMessages() {
    System.out.print("Current game field: ");
  }

  public int getFirstPlayerSymbol() throws InputMismatchException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Pick first player symbol: ");
    System.out.println("X - 1");
    System.out.println("O - 2");

    int resultInput = sc.nextInt();

    if (resultInput != 1 && resultInput != 2) {
      System.out.println("Wrong number, please choose correct one");
      getFirstPlayerSymbol();
    }

    return resultInput;
  }
}
