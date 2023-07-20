package designPrincipleSolid.isp.violation.usingInterface;

/**
 * CricketHelper is a helper class which has methods to perform cricket related activities
 * like bat, bowl, field, wicketKeeping
 * CricketHelper class has methods which accepts Player object as parameter
 * and calls respective methods
 * CricketHelper class is violating ISP principle because it has methods which are not
 * applicable for all types of players
 * CricketHelper class has methods which are applicable for only specific types of players
 * like WicketKeeper, AllRounder
 * and we have to implement an extra check to make sure that we are not calling methods which are not applicable
 * for specific type of player since it will throw runtime exception
 */
public class CricketHelper {

    public void bat(Player player){
        player.bat();
    }

    public void bowl(Player player){
        if (player instanceof AllRounder){
            player.bowl();
        }
    }

    public void field(Player player){
        if (player instanceof WicketKeeper) {
            return;
        }
        player.field();
    }

    public void wicketKeeping(Player player){
        if (player instanceof WicketKeeper) {
            player.wicketKeeping();
        }
    }
}
