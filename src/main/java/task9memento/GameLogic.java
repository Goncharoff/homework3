package task9memento;

import static task9memento.GameView.O_CODE;
import static task9memento.GameView.X_CODE;

import java.util.Arrays;
import java.util.Scanner;

class GameLogic {
  private GameTrunRestoreTool gameTrunRestoreTool;
  private GameTurn gameTurn;
  private GameView gameView;
  private boolean isFinished = false;
  private static final String RETURN_KEYWORD = "return";

  GameLogic() {
    gameTrunRestoreTool = new GameTrunRestoreTool();
    gameTurn = new GameTurn();
    gameView = new GameView();
  }

  void startGameSession() {
    int firstPlayerSymbolCode = gameView.getFirstPlayerSymbol();
    int gameTurnCount = 0;

    while (!stopGameConditions(gameTurnCount)) {
      gameView.renderGameField(gameTurn.getGameField());
      boolean isChanged = setGameField(firstPlayerSymbolCode);

      if (isChanged) {
        firstPlayerSymbolCode = changePlayerSymbol(firstPlayerSymbolCode);
        gameTurnCount++;
        isFinished = checkIfVictory(gameTurn.getGameField());
        if (isFinished)
          System.out.println("Congrats! " + firstPlayerSymbolCode + " won!");
        gameTrunRestoreTool.addGameField(gameTurn);
      }


    }

  }


  private boolean stopGameConditions(int gameTurnsCount) {
    return isFinished || gameTurnsCount == 9;
  }

  private boolean checkIfVictory(int[][] currentGameField) {

    for (int i = 0; i < currentGameField.length; i++) {
      boolean isHorizontalVictory = currentGameField[i][0] == currentGameField[i][1] && currentGameField[i][1] == currentGameField[i][2];
      boolean isVerticalVictory = currentGameField[0][i] == currentGameField[1][i] && currentGameField[1][i] == currentGameField[2][i];

      if (currentGameField[i][i] != 0 && (isHorizontalVictory || isVerticalVictory)) {
        return true;
      }
    }

    //diagonal victory check
    return currentGameField[0][0] == currentGameField[1][1] && currentGameField[1][1] == currentGameField[2][2];
  }

  private boolean setGameField(int currentPlayerNumber) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Enter x and y or return to \"return\" turn");
    String input = sc.nextLine();
    String[] parsedParams;

    checkIfInputCorrect(input);

    if (checkIfPlayerWantReturnTurn(input)) {
      return false;
    } else {
      parsedParams = input.split(" ");
    }

    int x = Integer.parseInt(parsedParams[0]);
    int y = Integer.parseInt(parsedParams[1]);

    int[][] currentField = gameTurn.getGameField();

    currentField[x - 1][y - 1] = currentPlayerNumber == O_CODE ? O_CODE : X_CODE;

    gameTurn.setGameField(currentField);
    return true;
  }

  private int changePlayerSymbol(int currentSymbol) {
    return currentSymbol == 2 ? 1 : 2;
  }

  private boolean checkIfPlayerWantReturnTurn(String input) {

    if (input.equals(RETURN_KEYWORD)) {
      gameTrunRestoreTool.getLastGameTrun(gameTurn);
      return true;
    }

    return false;
  }

  private void checkIfInputCorrect(String inputString) {
    String[] splited = inputString.split(" ");

    for (String item : splited) {
      if (!item.equals(RETURN_KEYWORD) && !item.equals("1") && !item.equals("2") && !item.equals("3")) {
        throw new IllegalArgumentException("Illegal input symbol = " + item);
      }
    }
  }

}
