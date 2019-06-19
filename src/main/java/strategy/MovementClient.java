package strategy;

public class MovementClient {

  public static void main(String[] args) {
    GameContext elfMovementContext = new GameContext(new Elf(10, 20));


    System.out.println("==================== elf movement ======================");
    elfMovementContext.executeFlying(12);
    elfMovementContext.executeFlyingMagic(10);
    elfMovementContext.executeFlyingMagic(10);
    elfMovementContext.executeFlyingMagic(13);
    elfMovementContext.executeMovement(91);
    System.out.println("=================================================");

    System.out.println("================= harpy movement ====================");
    GameContext harpyMovementContext = new GameContext(new Harpy(20));
    harpyMovementContext.executeMovement(1);
    harpyMovementContext.executeFlying(15);
    harpyMovementContext.executeFlyingMagic(11);
    System.out.println("=================================================");

    System.out.println("================= orc movement ====================");
    GameContext orcMovement = new GameContext(new Orc(25));
    orcMovement.executeFlyingMagic(12);
    orcMovement.executeFlying(31);
    orcMovement.executeMovement(12);
    System.out.println("=================================================");


    System.out.println("================= pegas movement ====================");
    GameContext pegasMovement = new GameContext(new Pegas(12));
    pegasMovement.executeMovement(12);
    pegasMovement.executeFlying(11);
    pegasMovement.executeFlyingMagic(133);
    System.out.println("=================================================");

    System.out.println("================= troll movement ====================");
    GameContext trollMovement = new GameContext(new Troll(14));
    trollMovement.executeFlyingMagic(13);
    trollMovement.executeFlying(11);
    trollMovement.executeMovement(13);
    System.out.println("=================================================");

    System.out.println("================= vampire movement ====================");
    GameContext vampireMovement = new GameContext(new Vampire(132, 22));
    vampireMovement.executeMovement(12);
    vampireMovement.executeFlying(31);
    vampireMovement.executeFlyingMagic(50);
    System.out.println("=================================================");

  }
}
