package accessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private double boughtPrice;
    private double sellPrice;

    public Accessories(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - boughtPrice;
    }
}
