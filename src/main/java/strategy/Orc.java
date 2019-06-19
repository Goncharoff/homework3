package strategy;

public class Orc implements MovementStrategy {
  private int stamina;

  public Orc(int stamina) {
    this.stamina = stamina;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    if (stamina <= numberOfSteps) {
      stamina -= numberOfSteps;
      System.out.println("Orc moved to " + stamina + " steps");
      return true;
    }
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    System.out.println("Orc can not fly");
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    System.out.println("Orc can not use magic");
    return false;
  }
}
