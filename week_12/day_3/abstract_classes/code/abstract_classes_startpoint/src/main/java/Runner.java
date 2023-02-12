import java.util.ArrayList;

public class Runner {

    public void printHowManyWheels(Vehicle vehicle) {
        System.out.println("Vehicle has " + vehicle.getNumberOfWheels() + " weheels");
    }

    public static void main(String[] args) {
        Car focus = new Car("Focus", 4);
        Car robin = new Car("Reliant", 2);

        Motorbike harley = new Motorbike("Harley");
        Motorbike ninja = new Motorbike("Ninja");

        printHowManyWheels(focus);
        printHowManyWheels(ninja);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(focus);
        vehicles.add(robin);
        vehicles.add(harley);
        vehicles.add(ninja);

        Vehicle aVehicle = vehicles.get(1);
        if (aVehicle instanceof Car) { //example of casting
            Car castedCar = (Car) aVehicle;
            System.out.println(castedCar.openDoors());
        } else {
            System.out.println("You don't have a car!");
        }

    }
}
