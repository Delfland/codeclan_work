import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Thom Wall", 2);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Thom Wall", passenger.getName());
    }

    @Test
    public void passengerHasANumberOfBags(){
        assertEquals(2, passenger.getBagNumber());
    }
}
