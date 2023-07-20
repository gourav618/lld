package designPrincipleSolid.isp.confirmation;

public class CricketGameHelper {

    public void bat(Player player) {
        player.bat();
    }

    public void bowl(Bowler bowler) {
        bowler.bowl();
    }

    public void field(Fielder fielder) {
        fielder.field();
    }

    public void keep(WicketKeeper wicketKeeper) {
        wicketKeeper.keepWicket();
    }
}
