package strategy;

public class Pegas implements MovementStrategy {
  private int stamina;

  public Pegas(int stamina) {
    this.stamina = stamina;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    System.out.println("Pegas can not walk.");
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    if (numberOfFlyingSteps <= stamina) {
      stamina -= numberOfFlyingSteps;
      System.out.println("Pagas flied " + numberOfFlyingSteps + " steps.");
      return true;
    }
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    System.out.println("Pegas can not use flying magic");
    return false;
  }
}
