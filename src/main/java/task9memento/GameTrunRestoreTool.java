package task9memento;

import java.util.ArrayList;
import java.util.Arrays;

public class GameTrunRestoreTool {
  public ArrayList<State> gameTurns = new ArrayList<>();

  public void addGameField(GameTurn gameTurn) {
    int[][] tmp = gameTurn.getGameField();
    StringBuilder result = new StringBuilder();

    for (int[] ints : tmp)
      for (int anInt : ints) {
        result.append(anInt).append(" ");
      }

    gameTurns.add(new State(result.toString()));
  }

  public void deleteLastGameTurn() {
    gameTurns.remove(gameTurns.size() - 1);
  }

  public void getLastGameTrun(GameTurn gameTurn) {

    if (gameTurns != null && gameTurns.size() > 0) {

      String state = gameTurns.get(gameTurns.size() - 1).getState();
      String[] parsed = state.split(" ");

      int[][] tmp = new int[3][3];
      int cnt = 0;
      for (int i = 0; i < tmp.length; i++) {
        for (int j = 0; j < tmp.length; j++) {
          tmp[i][j] = Integer.valueOf(parsed[cnt]);
          cnt++;
        }
      }

      gameTurn.setGameField(tmp);
      gameTurns.remove(gameTurns.size() - 1);
    }
  }

}
