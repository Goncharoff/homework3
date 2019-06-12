package factorymethod;

public class FiguresFactory {

  public static Figure getFigure(String figureName) {
    if (figureName == null) {
      return null;
    }

    Figure figure;

    switch (figureName) {
      case "square":
        figure = new Square();
        break;
      case "triangle":
        figure = new Triangle();
        break;
      case "rectangle":
        figure = new Rectangle();
        break;
      default:
        throw new FigureNotFound("Can not find figure with name + " + figureName);
    }

    return figure;
  }


}
