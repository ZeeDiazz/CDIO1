import java.util.Scanner;
public class Game {
        private static Die die1, die2;

        static Player[] players = new Player[2];

    public static void main(String[] args) {
        int currentPlayer = 0;
        players[0] = new Player(1); // for player 1
        players[1] = new Player(2); // for player 2

        Scanner in = new Scanner(System.in);

		die1 = new Die();
	    die2 = new Die();

        while (true) {
			Player playingPlayer = players[currentPlayer];
			playRound(die1, die2);
			printDiceResults();
			playingPlayer.addToScore(diceSum());
            //if player score 40 points or more, then the game stops.
            if (playingPlayer.getScore()>=40){
                break;
            }
            System.out.println(String.format("You currently have %d points\n", playingPlayer.getScore()));
            currentPlayer=(currentPlayer+1)%2;
		}

      }
        public static void playRound(Die die1, Die die2) {
                die1.roll();
                die2.roll();
        }

        public static int diceSum() {

           return die1.getFaceValue() + die2.getFaceValue();
        }

        public static void printDiceResults() {
                System.out.println(String.format("You rolled: %d & %d", die1.getFaceValue(), die2.getFaceValue()));
        }
}
