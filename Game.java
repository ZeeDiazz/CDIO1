public class Game {
        private static Die die1, die2;


       public static void main(String[] args) {
           die1 = new Die();
           die2 = new Die();

               for (int i = 0; i < 10; i++) {
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
