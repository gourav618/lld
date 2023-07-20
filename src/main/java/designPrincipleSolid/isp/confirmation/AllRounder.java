package designPrincipleSolid.isp.confirmation;

public class AllRounder implements Player, Bowler, Fielder{
    @Override
    public void bowl() {
        System.out.println("All Rounder Bowling");
    }

    @Override
    public void field() {
        System.out.println("All Rounder Fielding");
    }

    @Override
    public void bat() {
        System.out.println("All Rounder Batting");
    }
}
