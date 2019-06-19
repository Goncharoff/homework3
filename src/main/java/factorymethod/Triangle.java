package factorymethod;

public class Triangle implements Figure {

  private int x = 3;
  private int y = 3;
  private int z = 5;

   Triangle() {
    randomizeShape();
  }

  @Override
  public void randomizeShape() {
    if (Math.random() < 0.1) {
      this.x *= Figure.SCALE;
      this.y *= Figure.SCALE;
      this.z *= Figure.SCALE;
    }
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "x=" + x +
            ", y=" + y +
            ", z=" + z +
            '}';
  }
}
