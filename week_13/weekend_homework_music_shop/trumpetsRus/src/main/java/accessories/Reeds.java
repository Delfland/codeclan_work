package accessories;

public class Reeds extends Accessories{

    String cut;
    double size;
    public Reeds(double boughtPrice, double sellPrice, String cut, double size) {
        super(boughtPrice, sellPrice);
        this.cut = cut;
        this.size = size;
    }
}
