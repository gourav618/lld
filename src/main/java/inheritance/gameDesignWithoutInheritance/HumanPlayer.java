package inheritance.gameDesignWithoutInheritance;

public class HumanPlayer implements Player{
    @Override
    public void play() {
        /**
         * logic for play for human player
         */
    }

    /**
     * This method is repeated in HumanPlayer and ComputerPlayer
     * and the code is redundant
     */
    @Override
    public void celebrateWin() {
        System.out.println("Yay");
    }
}
