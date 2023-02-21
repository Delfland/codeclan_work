import accessories.DrumSticks;
import accessories.Muffler;
import instruments.Clarinet;
import instruments.Guitar;
import instruments.Trumpet;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Clarinet clarinet;
    Guitar guitar;
    Trumpet trumpet;
    Violin violin;
    Muffler muffler;
    DrumSticks drumSticks;

    @Before
    public void before(){
        shop = new Shop("Trumpet'R'Us", 1000);
        clarinet = new Clarinet(69.99, 99.99, "resin", "black", "woodwind", "soprano");
        trumpet = new Trumpet(89.99, 139.99, "brass", "gold", "brass", "cornet");
        violin = new Violin(45.99, 59.99, "maple", "wood", "string", "3/4 size");
        muffler = new Muffler(30, 53, "Tom Crown");
        drumSticks = new DrumSticks(5.99, 9.99, "7A");
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canBuyInstrumentAndAddToStock(){
        shop.buyStock(clarinet);
        assertEquals(1, shop.getStockCount());
        assertEquals(930.01, shop.getTill(), 0.0);
    }

    @Test
    public void canBuyAccessoryAndAddToStock(){
        shop.buyStock(drumSticks);
        shop.buyStock(muffler);
        assertEquals(2, shop.getStockCount());
        assertEquals(964.01, shop.getTill(), 0.0);
    }

    @Test
    public void canSellAStockItem(){
        shop.buyStock(clarinet);
        shop.buyStock(violin);
        shop.buyStock(trumpet);
        shop.buyStock(muffler);
        shop.sell(violin);
        shop.sell(muffler);
        assertEquals(2, shop.getStockCount());
        assertEquals(877.02, shop.getTill(), 0.0);
    }

    @Test
    public void canGetTotalProfit(){
        shop.buyStock(clarinet);
        shop.buyStock(violin);
        shop.buyStock(trumpet);
        shop.buyStock(muffler);
        shop.buyStock(drumSticks);
        assertEquals(121, shop.getProjectedProfit(), 0.0);
    }
}
