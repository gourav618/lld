package inheritance.gameDesignWithoutInheritance;

public class ComputerPlayer implements Player{
    @Override
    public void play() {
        /**
         * logic for play for computer player
         */
    }

    /**
     * This method is repeated in HumanPlayer and ComputerPlayer
     * and the code is redundant
     */
    @Override
    public void celebrateWin() {
        System.out.println("yay");
    }
}
