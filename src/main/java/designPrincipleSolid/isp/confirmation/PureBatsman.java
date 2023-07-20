package designPrincipleSolid.isp.confirmation;

public class PureBatsman implements Player, Fielder{
    @Override
    public void field() {
        System.out.println("Pure Batsman Fielding");
    }

    @Override
    public void bat() {
        System.out.println("Pure Batsman Batting");
    }
}
