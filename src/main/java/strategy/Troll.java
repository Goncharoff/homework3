package strategy;

public class Troll implements MovementStrategy {
  private int stamina;

  public Troll(int stamina) {
    this.stamina = stamina;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    if (numberOfSteps <= stamina) {
      stamina -= numberOfSteps;
      System.out.println("Troll moved on " + numberOfSteps + " steps.");
      return true;
    }
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    System.out.println("Troll can not fly");
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    System.out.println("Troll can not cast flying magic.");
    return false;
  }
}
