import java.util.Scanner;
public class Game {
        private static Die die1, die2;

        static Player[] players = new Player[2];

        int currentPlayer = 0;


    public static void main(String[] args) {
        players[0] = new Player(1); // for player 1
        players[1] = new Player(2); // for player 2

        Scanner in = new Scanner(System.in);


           die1 = new Die();
           die2 = new Die();

               for (int i = 0; i < 10; i++) { //just to see if the kode works
                   playRound(die1, die2);
                   printDiceResults();
              } 
      }

        public static void playRound(Die die1, Die die2) {
                die1.roll();
                die2.roll();
        }

        public int diceSum() {

           return die1.getFaceValue() + die2.getFaceValue();
        }

        public static void printDiceResults() {
                System.out.println(String.format("You rolled: %d & %d", die1.getFaceValue(), die2.getFaceValue()));
        }
}
