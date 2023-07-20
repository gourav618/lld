package designPrincipleSolid.isp.violation.usingAbstractClass;

public class PureBatsman extends Fielder{
    @Override
    public void field() {
        System.out.println("Pure Batsman Fielding");
    }

    @Override
    public void bat() {
        System.out.println("Pure Batsman Batting");
    }
}
