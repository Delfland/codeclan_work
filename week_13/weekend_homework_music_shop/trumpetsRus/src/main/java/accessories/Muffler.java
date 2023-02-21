package accessories;

public class Muffler extends Accessories{

    String brand;

    public Muffler(double boughtPrice, double sellPrice, String brand) {
        super(boughtPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
