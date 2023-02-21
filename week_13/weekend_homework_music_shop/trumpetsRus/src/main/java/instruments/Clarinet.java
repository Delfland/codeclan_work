package instruments;

public class Clarinet extends Instrument{

    private String range;

    public Clarinet(double boughtPrice, double sellPrice, String material, String colour, String type, String range) {
        super(boughtPrice, sellPrice, material, colour, type);
        this.range = range;
    }

    public String getRange() {
        return range;
    }

    @Override
    public String play() {
        return "doodle doodle det";
    }
}
