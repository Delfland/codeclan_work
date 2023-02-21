package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private double boughtPrice;
    private double sellPrice;
    private String Material;
    private String Colour;
    private String type;

    public Instrument(double boughtPrice, double sellPrice, String material, String colour, String type) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        Material = material;
        Colour = colour;
        this.type = type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getMaterial() {
        return Material;
    }

    public String getColour() {
        return Colour;
    }

    public String getType() {
        return type;
    }

    public double calculateMarkup() {
        return sellPrice - boughtPrice;
    }
}


