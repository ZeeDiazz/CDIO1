import java.util.Random;
public class Die {

    private int faceValue;
    private Random Rng;

    //Contructor for class.
    public Die(){
        Rng = new Random();
    }

public  int roll() {
    faceValue = Rng.nextInt(6) + 1;
    return faceValue;
}
public int getFaceValue() {
        return faceValue;
}

}