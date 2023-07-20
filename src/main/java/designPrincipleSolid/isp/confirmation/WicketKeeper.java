package designPrincipleSolid.isp.confirmation;

public class WicketKeeper implements Player, Keeper{
    @Override
    public void keepWicket() {
        System.out.println("Wicket Keeper Keeping Wicket");
    }

    @Override
    public void bat() {
        System.out.println("Wicket Keeper Batting");
    }
}
