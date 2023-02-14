package cars;

import behaviours.IPower;

public class PetrolCar extends Car {

    public PetrolCar(String make, String model, String colour, double price, int mileage, IPower powerDevice) {
        super(make, model, colour, price, mileage, powerDevice);
    }
}
