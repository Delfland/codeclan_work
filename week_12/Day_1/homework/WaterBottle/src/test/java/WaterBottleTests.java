import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    WaterBottle waterBottle;

    @Before
    public void setup() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void waterBottleHasAVolumeOf100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void waterBottleCanBeDrunkFrom() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void waterBottleCanBeDrunkFromMoreThanOnce() {
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(70, waterBottle.getVolume());
    }

    @Test
    public void waterBottleCanBeEmptied() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void waterBottleCanBeFilled() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
