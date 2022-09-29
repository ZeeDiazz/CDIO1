import java.util.Scanner;

public class Player {
    public final String Name; //So that player can write their name
    private int currentScore;

    //Constructor
    public Player(int playerNum) {
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("Player %d. Please enter your name ", playerNum));
        this.Name = in.nextLine();
        this.currentScore = 0;
    }

    public int getScore() {
        return currentScore;
    }
    public void addToScore(int points) {
        this.currentScore += points;
    }
    public void setScore(int newScore) {
		this.currentScore = newScore;
    }
}
