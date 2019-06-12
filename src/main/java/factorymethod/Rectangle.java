package factorymethod;

public class Rectangle implements Figure {
  private int x = 1;
  private int y = 5;

   Rectangle() {
    randomizeShape();
  }

  @Override
  public void randomizeShape() {
    if (Math.random() < 0.1) {
      this.y *= Figure.SCALE;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
}
