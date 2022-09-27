import java.util.Scanner;

public class Player {
    public final String Name;
    private int currentScore;
    public Player(int playerNum) {
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("Player %d. Please enter your name", playerNum));
        this.Name = in.nextLine();
        this.currentScore = 0;
    }
}
