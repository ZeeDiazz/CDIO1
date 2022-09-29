public class Game {

    private Die die1, die2;

    public Game() {
        die1 = new Die();
        die2 = new Die();
    }

    public void playRound() {
        die1.roll();
        die2.roll();
    }

        public void printDiceResult() {
            System.out.println("You rolled: %d & %d" + die1.getFaceValue() + die2.getFaceValue());
        }

        public static void main (String[]args){
            Player[] players = new Player[2]; //Der der skal være to spiller
        }



}
