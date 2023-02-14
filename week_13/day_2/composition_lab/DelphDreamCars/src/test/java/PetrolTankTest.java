import org.junit.Before;
import org.junit.Test;
import powerDevices.Battery;
import powerDevices.PetrolTank;

import static org.junit.Assert.assertEquals;

public class PetrolTankTest {

    PetrolTank petrolTank;

    @Before
    public void before(){
        petrolTank = new PetrolTank();
    }

    @Test
    public void canDecreaseCapacity(){
        petrolTank.decreaseCapacity(10);
        assertEquals(90, petrolTank.getTankLitres());
    }

    @Test
    public void canRefillBattery(){
        petrolTank.decreaseCapacity(10);
        petrolTank.decreaseCapacity(20);
        petrolTank.refill();
        assertEquals(100, petrolTank.getTankLitres());
    }
}
