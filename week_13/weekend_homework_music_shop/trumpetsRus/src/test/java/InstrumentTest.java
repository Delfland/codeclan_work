import instruments.Clarinet;
import instruments.Guitar;
import instruments.Trumpet;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Clarinet clarinet;
    Guitar guitar;
    Trumpet trumpet;
    Violin violin;

    @Before
    public void before(){
        clarinet = new Clarinet(69.99, 99.99, "resin", "black", "woodwind", "soprano");
        guitar = new Guitar(129, 159, "wood", "natural", "string", 6);
        trumpet = new Trumpet(89.99, 139.99, "brass", "gold", "brass", "cornet");
        violin = new Violin(45.99, 59.99, "maple", "wood", "string", "3/4 size");
    }

    @Test
    public void canPlayClarinet(){
        assertEquals("doodle doodle det", clarinet.play());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Strum strum strum", guitar.play());
    }

    @Test
    public void canPlayTrumpet(){
        assertEquals("Ta-tada-ta-ta", trumpet.play());
    }

    @Test
    public void canPlayViolin(){
        assertEquals("Zing-zing-zing", violin.play());
    }

}
