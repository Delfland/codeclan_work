package accessories;

public class DrumSticks extends Accessories{

    String size;

    public DrumSticks(double boughtPrice, double sellPrice, String size) {
        super(boughtPrice, sellPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
