package task7;

public class CreatedState implements State {

  @Override
  public void next(Office office) {
     office.setState(new ReviewingState());
  }

  @Override
  public void previous(Office office) {
    System.out.println("Started state can not go back");
  }

  @Override
  public void printStatus() {
    System.out.println("Submission is only created, but still is not reviewed");
  }
}
