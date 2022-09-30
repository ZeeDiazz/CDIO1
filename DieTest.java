import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    @Test
    public void dieRollTakesLessThan10ms() {
        Die d = new Die();
        for (int i = 0; i < 10; i++) {
            assertTimeout(Duration.ofMillis(10), d::roll);
        }
    }

    @Test
    public void dieFaceCanChangeValue() {
        Die d = new Die();
        d.roll();
        int startValue = d.getFaceValue();

        assertTimeout(Duration.ofSeconds(1), () -> {
            while (startValue == d.getFaceValue()) {
                d.roll();
            }
        });
    }
}