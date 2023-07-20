package designPrincipleSolid.isp.confirmation;

import java.util.Arrays;
import java.util.List;

public class CricketGameSimulator {

    public final List<PureBatsman> batsmen;
    public final List<AllRounder> allRounders;
    public final WicketKeeper keeper;
    public final CricketGameHelper helper;

    public CricketGameSimulator(List<PureBatsman> batsmen, List<AllRounder> allRounders, WicketKeeper keeper, CricketGameHelper helper) {
        this.batsmen = batsmen;
        this.allRounders = allRounders;
        this.keeper = keeper;
        this.helper = helper;
    }

    public void simulate(){
        System.out.println("Cricket Game Simulation Started");
        startBatting();
        startBowling();
        startFielding();
        startKeeping();
        System.out.println("Cricket Game Simulation Ended");
    }

    private void startBatting() {
        batsmen.forEach(helper::bat);
        helper.bat(keeper);
        allRounders.forEach(helper::bat);
    }

    private void startBowling() {
        allRounders.forEach(helper::bowl);

        //we get a compilation error here because the CricketGameHelper class does not have a bowl method that takes a PureBatsman as an argument,
        //and we don't get a runtime error like previous so better design
        //helper.bowl(batsmen.get(0));
    }

    private void startFielding() {
        batsmen.forEach(helper::field);
        allRounders.forEach(helper::field);
    }

    private void startKeeping() {
        helper.keep(keeper);
    }

    public static void main(String[] args){
        List<PureBatsman> pureBatsmen = Arrays.asList(new PureBatsman(), new PureBatsman(), new PureBatsman(), new PureBatsman());
        List<AllRounder> allRounders = Arrays.asList(new AllRounder(), new AllRounder(), new AllRounder(), new AllRounder(), new AllRounder());
        WicketKeeper keeper = new WicketKeeper();

        CricketGameSimulator simulator = new CricketGameSimulator(pureBatsmen, allRounders, keeper, new CricketGameHelper());
        simulator.simulate();
    }
}
