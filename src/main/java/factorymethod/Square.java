package factorymethod;

public class Square implements Figure {
  private int x = 5;
  private int y = 5;

   Square() {
    randomizeShape();
  }


  @Override
  public void randomizeShape() {
    if (Math.random() < 0.1) {
      this.x *= Figure.SCALE;
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
    return "Square{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
}
