import behaviours.IPower;
import cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;
import powerDevices.Battery;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    IPower powerDevice;
    Battery battery;

    @Before
    public void before(){
        battery = new Battery();
        electricCar = new ElectricCar("Tesla","S", "black", 60000,0, powerDevice);
    }

    @Test
    public void canDrive20miles(){
        electricCar.setPowerDevice(battery);
        electricCar.drive(20);
        assertEquals(80, ((Battery) electricCar.getPowerDevice()).getCapacity());
    }

}
