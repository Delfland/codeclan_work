import behaviours.ISell;
import instruments.Clarinet;
import instruments.Violin;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    String name;
    double till;
    ArrayList<ISell> stockList;

    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stockList = new ArrayList<>();
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }


    public int getStockCount() {
        return stockList.size();
    }

    public void buyStock(ISell newStock) {
        till -= newStock.getBoughtPrice();
        stockList.add(newStock);
    }

    public void sell(ISell stockItem) {
        stockList.remove(stockItem);
        till += stockItem.getSellPrice();
    }

    public double getProjectedProfit() {
        double projectedProfits = stockList.stream()
                .map(ISell::calculateMarkup)
                .map(num -> Math.round(num * 100) / 100.0)
                .reduce(0.00, (sum, nextNum) -> sum + nextNum);
        return projectedProfits;
    }
}
