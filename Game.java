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

            while (true) {
                System.out.println(playingPlayer.Name + " your turn. Please type [r]oll to roll the dice");
                String playerInput = in.nextLine();
                if (playerInput.equals("roll") | playerInput.equals("r")) {
                    break;
                }
                System.out.println("Invalid input");
            }

            //if player score 40 points or more, then the game stops.
            if (playingPlayer.getScore()>=40){
                if (diceAreSame()) {
                    break;
                } else {
                    System.out.println(playingPlayer.Name+"you only have to roll a pair to win");
                }
            }
            System.out.println(String.format("You currently have %d points\n", playingPlayer.getScore()));
            currentPlayer=(currentPlayer+1)%2;
		}
		
		Player winner = players[currentPlayer];
        Player loser = players[(currentPlayer + 1) % 2];
        System.out.println(String.format("\nCongratulations %s you won with %d points", winner.Name, winner.getScore()));
        System.out.println(String.format("%s you ended the game with %d points", loser.Name, loser.getScore()));
      }
	
	public static void playRound(Die die1, Die die2) {
		die1.roll();
		die2.roll();
	}

	public static int diceSum() {
		return die1.getFaceValue() + die2.getFaceValue();
	}
    public static boolean diceAreSame() {
        return die1.getFaceValue() == die2.getFaceValue();
    }
	public static void printDiceResults() {
		System.out.println(String.format("You rolled: %d & %d", die1.getFaceValue(), die2.getFaceValue()));
	}
}
