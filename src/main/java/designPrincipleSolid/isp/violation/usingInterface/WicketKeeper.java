package designPrincipleSolid.isp.violation.usingInterface;

/**
 * Wicket keeper is a concrete class which implements Player interface
 * and is forced to implement bowl() and field() methods
 */
public class WicketKeeper implements Player{
    @Override
    public void bat() {
        System.out.println("Wicket keeper is batting");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("Wicket keeper cannot bowl");
    }

    @Override
    public void field() {
        throw new RuntimeException("Wicket keeper cannot field");
    }

    @Override
    public void wicketKeeping() {
        System.out.println("Wicket keeper is wicket keeping");
    }
}
