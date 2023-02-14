package cars;

import behaviours.IPower;

public abstract class Car {

    String make;
    String model;
    String colour;
    double price;
    int mileage;
    IPower powerDevice;

    public Car(String make, String model, String colour, double price, int mileage, IPower powerDevice) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.mileage = mileage;
        this.powerDevice = powerDevice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public IPower getPowerDevice() {
        return powerDevice;
    }

    public void setPowerDevice(IPower powerDevice) {
        this.powerDevice = powerDevice;
    }

    public void drive(int distance){
        powerDevice.decreaseCapacity(distance);
    }
}
