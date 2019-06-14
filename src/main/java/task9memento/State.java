package task9memento;

public class State {
  private String state;

  public State(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  @Override
  public String toString() {
    return "State{" +
            "state='" + state + '\'' +
            '}';
  }
}
