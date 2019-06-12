package task7;

public class StateClient {
  public static void main(String[] args) {
    Office office = new Office();

    office.printStatus();

    office.setDelayes(true, 12);
    office.printStatus();
    office.setDelayes(false, 0);

    office.nextState();
    office.printStatus();

    office.setGotBack(true);
    office.nextState();
    office.setGotBack(false);

    office.setRegected(true);
    office.nextState();
    office.setRegected(false);

    office.nextState();
    office.printStatus();
  }
}
