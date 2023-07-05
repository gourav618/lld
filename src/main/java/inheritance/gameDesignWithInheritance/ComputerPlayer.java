package inheritance.gameDesignWithInheritance;

public class ComputerPlayer extends Player{

        //overriding the play method from the parent class Player
        @Override
        public void play() {
            /**
            * logic for play for computer player
            */
        }

        @Override
        public void celebrateWin() {
            System.out.println("computer wins!!");
        }
}
