package designPrincipleSolid.isp.violation.usingInterface;

/**
 * Pure Batsman is a concrete class which implements Player interface
 * and is forced to implement bowl() and wicketKeeping() methods
 */
public class PureBatsMan implements Player{
    @Override
    public void bat() {
        System.out.println("Batsman is batting");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("Batsman cannot bowl");
    }

    @Override
    public void field() {
        System.out.println("Batsman is fielding");
    }

    @Override
    public void wicketKeeping() {
        throw new RuntimeException("Batsman cannot wicket keep");
    }
}
