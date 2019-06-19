package strategy;

public class Harpy implements MovementStrategy {
  private int stamina;

  public Harpy(int stamina) {
    this.stamina = stamina;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    System.out.println("Harpy can not walk");
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    if (numberOfFlyingSteps <= stamina) {
      stamina -= numberOfFlyingSteps;
      System.out.println("Harpy flied on " + numberOfFlyingSteps + " steps");
    }
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    System.out.println("Harpy already flying");
    return false;
  }


}
