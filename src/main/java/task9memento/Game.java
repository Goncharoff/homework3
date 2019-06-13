package task9memento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
  private static final String[] gameSybmols = {"X", "O", "-"};

  private static int[][] gameField = {{0, 0, 0},
          {0, 0, 0},
          {0, 0, 0}};

  private static final int SYMBOL_X_PLACE = 1;
  private static final int SYMBOL_O_PLACE = 2;

  public static void renderGameField(int[][] currentGameField) {
    for (int i = 0; i < gameField.length; i++) {
      for (int j = 0; j < gameField.length; j++) {
        if (j != 2) {
          System.out.print(checkSymbol(currentGameField[i][j]) + " | ");
        } else {
          System.out.print(checkSymbol(currentGameField[i][j]));
        }
      }
      System.out.println();
    }
  }

  public static String checkSymbol(int gameFieldItem) {
    if (gameFieldItem == 0) {
      return "-";
    } else if (gameFieldItem == 1) {
      return "X";
    } else {
      return "O";
    }
  }

  private static boolean checkIfVictory(int[][] currentGameField) {

    for (int i = 0; i < currentGameField.length; i++) {
      if (currentGameField[i][i] != 0) {
        if (currentGameField[0][i] == currentGameField[1][i] && currentGameField[1][i] == currentGameField[2][i]) {
          return true;
        } else if (currentGameField[i][0] == currentGameField[i][1] && currentGameField[i][1] == currentGameField[i][2]) {
          return true;
        }
      }

    }

    return currentGameField[0][0] == currentGameField[1][1] && currentGameField[1][1] == currentGameField[2][2];
  }

  public static void main(String[] args) {
    boolean isFinished = false;
    int count = 0;

    // 1 - X, 2 - O
    int firstPlayerSymbol = startGameInput();

    while (isFinished || count == 9) {
      renderGameField(gameField);


      isFinished = checkIfVictory(gameField);
      count++;
    }
  }

  public static int startGameInput() throws InputMismatchException {
    System.out.println("Pick first player symbol: ");
    System.out.println("X - 1");
    System.out.println("O - 2");
    Scanner sc = new Scanner(System.in);
    int resultInput = sc.nextInt();

    if (resultInput != 1 && resultInput != 2) {
      System.out.println("Wrong number, please choose correct one");
      startGameInput();
    }

    return resultInput;
  }

  public int[][] setGameField(int[][] currentField) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x ");
    int x = sc.nextInt();
    System.out.println("Enter y ");
    int y = sc.nextInt();

  }
}
