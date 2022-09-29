import java.util.Random;
public class Die {

        Private int faceValue;
        Private Random rng;

        //Construktur for Die class. 

        public Die() {
                Rng = new Random();
        }
        public void roll() {
                FaceValue = rng.nextInt(6) + 1;
        }
        public int getFaceValue() {
                Return faceValue;
        }
}
