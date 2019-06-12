package factorymethod;

public class FigureClient {

  public static void main(String[] args) {

    for (int i = 0; i < 30; i++) {
      System.out.println(FiguresFactory.getFigure("square"));
      System.out.println(FiguresFactory.getFigure("triangle"));
      System.out.println(FiguresFactory.getFigure("rectangle"));
    }
  }

}
