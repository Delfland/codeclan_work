package powerDevices;

import behaviours.IPower;

public class Battery implements IPower {

    int capacity;

    public Battery(){
        this.capacity = 100;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void decreaseCapacity(int distance) {
        capacity -= distance;
    }

    @Override
    public void refill() {
        capacity = 100;
    }
}