import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Pilot pilot;
    Plane plane;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        flightManager = new FlightManager();
        pilot = new Pilot("Peter Capaldi", RankType.CAPTAIN, "PC43567T");
        plane = new Plane(PlaneType.BOEING767);
        flight = new Flight(pilot, plane, "BA6534", "CDG", "EDI", "10:20");
        passenger1 = new Passenger("Thom Wall", 1);
        passenger2 = new Passenger("Eden Wall", 2);
    }

    @Test
    public void flightManagerCanCalculateLuggageAllowancePerPassenger(){
        assertEquals(20, flightManager.getIndividualLuggageAllowance(flight), 0.0);
    }

    @Test
    public void flightManagerCanCalculateTotalBookedLuggageWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(30, flightManager.getTotalBookedLuggageWeight(flight), 0.0);
    }

    @Test
    public void flightManagerCanCalculateAvailableLuggageAllowance(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(90, flightManager.getAvailableLuggageAllowance(flight), 0.0);
    }
}
