package designPrincipleSolid.isp.violation.usingInterface;

/**
 * All-rounder is a concrete class which implements Player interface
 * and is forced to implement wicketKeeping() method
 */
public class AllRounder implements Player{

    @Override
    public void bat() {
        System.out.println("All rounder is batting");
    }

    @Override
    public void bowl() {
        System.out.println("All rounder is bowling");
    }

    @Override
    public void field() {
        System.out.println("All rounder is fielding");
    }

    @Override
    public void wicketKeeping() {
        throw new RuntimeException("All rounder cannot wicket keep");
    }
}
