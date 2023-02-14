package cars;

import behaviours.IPower;

public class HybridCar extends Car {

    public HybridCar(String make, String model, String colour, double price, int mileage, IPower powerDevice) {
        super(make, model, colour, price, mileage, powerDevice);
    }
}
