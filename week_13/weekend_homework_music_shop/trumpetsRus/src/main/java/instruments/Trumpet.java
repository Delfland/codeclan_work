package instruments;

public class Trumpet extends Instrument{

    private String trumpetType;

    public Trumpet(double boughtPrice, double sellPrice, String material, String colour, String type, String trumpetType) {
        super(boughtPrice, sellPrice, material, colour, type);
        this.trumpetType = trumpetType;
    }

    @Override
    public String play() {
        return "Ta-tada-ta-ta";
    }
}
