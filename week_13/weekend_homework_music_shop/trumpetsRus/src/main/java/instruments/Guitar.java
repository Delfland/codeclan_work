package instruments;

public class Guitar extends Instrument {

    private int stringNumber;

    public Guitar(double boughtPrice, double sellPrice, String material, String colour, String type, int stringNumber) {
        super(boughtPrice, sellPrice, material, colour, type);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    @Override
    public String play() {
        return "Strum strum strum";
    }
}
