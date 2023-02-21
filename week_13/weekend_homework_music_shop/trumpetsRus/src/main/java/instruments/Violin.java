package instruments;

public class Violin extends Instrument{

    private String size;

    public Violin(double boughtPrice, double sellPrice, String material, String colour, String type, String size) {
        super(boughtPrice, sellPrice, material, colour, type);
        this.size = size;
    }

    @Override
    public String play() {
        return "Zing-zing-zing";
    }
}
