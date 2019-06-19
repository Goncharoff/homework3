package factorymethod;

public class FigureNotFound extends RuntimeException{
  public FigureNotFound(String message) {
    super(message);
  }
}
