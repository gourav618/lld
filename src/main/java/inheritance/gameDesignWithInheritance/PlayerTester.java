package inheritance.gameDesignWithInheritance;

public class PlayerTester {

    public static void main(String[] args) {
        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.play();
        humanPlayer.celebrateWin();

        ComputerPlayer computerPlayer = new ComputerPlayer();
        computerPlayer.play();
        computerPlayer.celebrateWin();

        Player computerPlayer1 = new ComputerPlayer();
        //the below line will not compile as the reference is of type Player and don't have play method refer polymorphism example
        //computerPlayer1.play();
        computerPlayer1.celebrateWin();

        //but we want to make it more generic and declare a play method in Player class and then override them in HumanPlayer and ComputerPlayer
        //i.e using runtime polymorphism to invoke method play according to the object type
        Player p1 = new ComputerPlayer();
        Player p2 = new HumanPlayer();
        p1.play();
        p1.celebrateWin();
        p2.play();
        p2.celebrateWin();

        //if we don't override the method then method from parent class will be invoked

    }
}
