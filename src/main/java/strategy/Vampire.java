package strategy;

public class Vampire implements MovementStrategy {
  private int mana;
  private int stamina;

  public Vampire(int mana, int stamina) {
    this.mana = mana;
    this.stamina = stamina;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    if (numberOfSteps <= stamina) {
      stamina -= numberOfSteps;
      System.out.println("Vampire walked on " + stamina + " steps.");
      return true;
    }
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    System.out.println("Vampire can not fly without magic");
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    if (numberOfMana <= mana) {
      mana -= numberOfMana;
      System.out.println("Vampire casted flying magic and moved on " + mana);
      return true;
    }
    return false;
  }
}
