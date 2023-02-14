import org.junit.Before;
import org.junit.Test;
import powerDevices.Battery;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery();
    }

    @Test
    public void canDecreaseCapacity(){
        battery.decreaseCapacity(10);
        assertEquals(90, battery.getCapacity());
    }

    @Test
    public void canRefillBattery(){
        battery.decreaseCapacity(10);
        battery.decreaseCapacity(20);
        battery.refill();
        assertEquals(100, battery.getCapacity());
    }
}
