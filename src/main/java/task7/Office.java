package task7;

public class Office {
  private State state = new CreatedState();
  private boolean isGotBack = false;
  private boolean isRegected = false;
  private boolean isDelayes = false;
  private int numberOfDaysForDelay;

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void previousState() {
    state.previous(this);
  }

  public void nextState() {
    if (isAviabile()) {
      state.next(this);
    }
  }

  public void printStatus() {
    if (isAviabile()) {
      state.printStatus();
    }
  }

  public void setGotBack(boolean gotBack) {
      isGotBack = gotBack;

  }

  public void setRegected(boolean regected) {
    isRegected = regected;
  }

  public int setDelayes(boolean delayed, int numberOfDaysForDelay) {
    this.isDelayes = delayed;
    this.numberOfDaysForDelay = numberOfDaysForDelay;
    return numberOfDaysForDelay;
  }

  public boolean isAviabile() {
    if (isGotBack) {
      System.out.println("You took back your submission");
      return false;
    }

    if (isRegected) {
      System.out.println("Sorry but your submission was rejected");
      return false;
    }

    if (isDelayes) {
      System.out.println("Sorry but your subbmision is delayed on " + numberOfDaysForDelay + " days");
      return false;
    }

    return true;
  }

}
