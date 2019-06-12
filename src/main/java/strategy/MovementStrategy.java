package strategy;

public interface MovementStrategy {
  boolean canWalk(int numberOfSteps);

  boolean canFly(int numberOfFlyingSteps);

  boolean startFlyingWithMagic(int numberOfMana);
}
