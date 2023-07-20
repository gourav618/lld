package designPrincipleSolid.isp.violation.usingAbstractClass;

/**
 * Inheritance is tricky to understand and use. It is not always the best solution.
 * In this example, we have a Player class which is inherited by Fielder and Keeper.
 * Fielder is inherited by Bowler and Keeper is inherited by WicketKeeper.
 * Now, WicketKeeper is a Player, Fielder and Keeper. But, WicketKeeper is not a Bowler.
 * <p>
 * But let say we have a new type of Player which can bat and bowl.
 * and we have to extend it to Bowler class and we are again force to implement field() method which is not required.
 */
public abstract class Player {
    public abstract void bat();
}
