package strategy;

public class Elf implements MovementStrategy {
  private int marginOfSteps;
  private int marginOfMana;

  public Elf(int marginOfSteps, int marginOfMana) {
    this.marginOfSteps = marginOfSteps;
    this.marginOfMana = marginOfMana;
  }

  @Override
  public boolean canWalk(int numberOfSteps) {
    if (numberOfSteps <= marginOfSteps) {
      marginOfSteps -= numberOfSteps;
      System.out.println("Elf moved to " + numberOfSteps);
      return true;
    }

    System.out.println("too much steps for elf");
    return false;
  }

  @Override
  public boolean canFly(int numberOfFlyingSteps) {
    System.out.println("Elf can not fly without magic;");
    return false;
  }

  @Override
  public boolean startFlyingWithMagic(int numberOfMana) {
    if (numberOfMana <= marginOfMana) {
      marginOfMana -= numberOfMana;
      System.out.println("Elf started flying! And moved  to " + numberOfMana);
      return true;
    }
    System.out.println("Not enough mana");
    return false;
  }
}
