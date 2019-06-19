package task7;

public interface State {

  void next(Office office);

  void previous(Office office);

  void printStatus();
}
