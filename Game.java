Public class Game {   
        private Die die1, die2;


       public Game() {
               die1 = new die();
               die2 = new die();
       }

       public static void main(String[] args) {
               for (int i = 0; i < 10; i++) {
                       playRound();
                       printDiceResults();
              } 
      }


        public int playRound() {
                die1.roll();
                die2.roll();
        }

        public int diceSum() {
                return die1.getFaceValue() + die2.getFaceValue();
        }

        public void printDiceResult() {
                System.out.println(“You rolled: %d & %d”, die1.getFaceValue(), die2.getFaceValue());
                System.out.println(String.format(“You rolled: %d & %d”, die1.getFaceValue(), die2.getFaceValue()));
        }
}
