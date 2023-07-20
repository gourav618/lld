package designPrincipleSolid.isp.violation.usingAbstractClass;

public class WicketKeeper extends Keeper{
    @Override
    public void keepWicket() {
        System.out.println("Wicket Keeper Keeping Wicket");
    }

    @Override
    public void bat() {
        System.out.println("Wicket Keeper Batting");
    }
}

