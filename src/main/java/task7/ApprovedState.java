package task7;

public class ApprovedState implements State {
  @Override
  public void next(Office office) {
    System.out.println("Your submission is approved, doesn't have other option with it");
  }

  @Override
  public void previous(Office office) {
    office.setState(new ReviewingState());
  }

  @Override
  public void printStatus() {
    System.out.println("Congrats! Your submission is approved!");
  }
}
