package task7;

public class ReviewingState implements State{
  @Override
  public void next(Office office) {
     office.setState(new ApprovedState());
  }

  @Override
  public void previous(Office office) {
   office.setState(new CreatedState());
  }

  @Override
  public void printStatus() {
    System.out.println("Your submission is reviewed now");
  }
}
