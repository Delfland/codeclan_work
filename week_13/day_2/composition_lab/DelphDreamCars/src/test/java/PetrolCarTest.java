import behaviours.IPower;
import cars.ElectricCar;
import cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;
import powerDevices.Battery;
import powerDevices.PetrolTank;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    IPower powerDevice;
    PetrolTank petrolTank;

    @Before
    public void before(){
        petrolTank = new PetrolTank();
        petrolCar = new PetrolCar("Fiat","Punto", "red", 10000,80000, powerDevice);
    }

    @Test
    public void canDrive20miles(){
        petrolCar.setPowerDevice(petrolTank);
        petrolCar.drive(20);
        assertEquals(80, ((PetrolTank) petrolCar.getPowerDevice()).getTankLitres());
    }
}
