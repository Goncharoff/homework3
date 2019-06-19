package task9memento;

import java.util.Arrays;

public class GameTurn {
  private int[][] gameField = {{0, 0, 0},
          {0, 0, 0},
          {0, 0, 0}};

  private static final int EMPTY_SYMBOL_CODE = 0;
  private static final String X_SYMBOL = "X";
  private static final String O_SYMBOL = "O";
  private static final String EMPTY_SYMBOL = "-";
  private static final String SEPARATE_SYMBOL = "|";

  public GameTurn() {
  }

  public GameTurn(int[][] gameField) {
    this.gameField = gameField;
  }

  public void setGameField(int[][] gameField) {
    this.gameField = gameField;
  }

  public int[][] getGameField() {
    return gameField;
  }


  @Override
  public String toString() {
    return "GameTurn{" +
            "gameField=" + Arrays.deepToString(gameField) +
            '}';
  }
}
