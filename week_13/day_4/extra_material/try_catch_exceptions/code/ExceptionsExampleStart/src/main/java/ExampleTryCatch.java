import behaviours.Pet;
import exceptions.NullStringException;
import pets.Cat;
import pets.Dog;
import pets.Fish;

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();

        try{
            Pet found = shop.findPetByName(null);
            System.out.println("Found pet: " + found.getName());
        }
        catch (NullStringException ex){
            ex.printStackTrace();
            System.out.println("Exception Message: ");
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("log out of database or tie up any other loose ends");
        }

    }

    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("RoveR"));
        shop.addPet(new Cat("meowintons"));
        shop.addPet(new Fish("FINlay"));
    }
}