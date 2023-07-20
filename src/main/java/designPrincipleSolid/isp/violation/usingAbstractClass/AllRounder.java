package designPrincipleSolid.isp.violation.usingAbstractClass;

public class AllRounder extends Bowler{
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
