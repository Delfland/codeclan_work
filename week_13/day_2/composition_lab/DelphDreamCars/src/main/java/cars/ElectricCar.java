package cars;

import behaviours.IPower;

public class ElectricCar extends Car{

    public ElectricCar(String make, String model, String colour, double price, int mileage, IPower powerDevice) {
        super(make, model, colour, price, mileage, powerDevice);
    }
}
