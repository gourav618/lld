package inheritance.gameDesignWithoutInheritance;

public interface Player {

    void play();

    /**
     * This method is repeated in HumanPlayer and ComputerPlayer
     * and the code is redundant and have exact same logic
     *
     * but since we used polymorphism we enforce that both classes use this method
     * The solution is to use inheritance
     */
    void celebrateWin();
}
