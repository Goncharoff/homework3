package strategy;

public class GameContext {
  private MovementStrategy movementStrategy;

  public GameContext(MovementStrategy movementStrategy) {
    this.movementStrategy = movementStrategy;
  }

  public void executeFlyingMagic(int numberOfMana) {
    movementStrategy.startFlyingWithMagic(numberOfMana);
  }

  public void executeMovement(int numberOfSteps) {
    movementStrategy.canWalk(numberOfSteps);
  }

  public void executeFlying(int numberOfFlyingSteps) {
    movementStrategy.canFly(numberOfFlyingSteps);
  }
}
