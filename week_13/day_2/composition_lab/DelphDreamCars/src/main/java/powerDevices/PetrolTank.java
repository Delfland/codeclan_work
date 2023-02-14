package powerDevices;

import behaviours.IPower;

public class PetrolTank implements IPower {

    int tankLitres;

    public PetrolTank(){
        this.tankLitres = 100;
    }

    public int getTankLitres() {
        return tankLitres;
    }

    @Override
    public void decreaseCapacity(int distance) {
        tankLitres -= distance;
    }

    @Override
    public void refill() {
        tankLitres = 100;
    }
}
