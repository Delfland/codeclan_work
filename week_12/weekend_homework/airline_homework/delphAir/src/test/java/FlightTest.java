import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember flightAttendant1;
    CabinCrewMember flightAttendant2;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){

        pilot = new Pilot("Peter Capaldi", RankType.CAPTAIN, "PC43567T");
        flightAttendant1 = new CabinCrewMember("Donna Vaughn", RankType.FLIGHT_ATTENDANT);
        flightAttendant2 = new CabinCrewMember("Simon Swan", RankType.FLIGHT_ATTENDANT);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "BA6534", "CDG", "EDI", "10:20");
        passenger1 = new Passenger("Thom Wall", 1);
        passenger2 = new Passenger("Eden Wall", 2);
    }

    @Test
    public void flightHasAPilot(){
        assertEquals("Peter Capaldi", flight.getPilot().getName());
    }

    @Test
    public void flightHasCabinCrewMembers(){
        flight.addCrew(flightAttendant1);
        flight.addCrew(flightAttendant2);
        assertEquals(2, flight.getNumberOfCrew());
    }

    @Test
    public void flightPassengerListStartsEmpty(){
        assertEquals(0, flight.getPassengerNumbers());
    }

    @Test
    public void flightHasAPlane(){
        assertEquals(4, flight.getPlane().getCapacity());
    }

    @Test
    public void flightHasAFlightNumber(){
        assertEquals("BA6534", flight.getFlightNumber());
    }

    @Test
    public void flightHasADestination(){
        assertEquals("CDG", flight.getDestination());
    }

    @Test
    public void flightHasADepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test public void flightHasADepartureTime(){
        assertEquals("10:20", flight.getDepartureTime());
    }

    @Test
    public void flightCanBookAPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengerNumbers());
    }

    @Test
    public void flightCanReturnNumberOfAvailableSeats(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getAvailableSeats());
    }

    @Test
    public void flightCannotBookPassengerIfAtCapacity(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger1);
        assertEquals(4, flight.getPassengerNumbers());
    }

    @Test
    public void flightCanGetTotalLuggageAllowance(){
        assertEquals(80, flight.getTotalLuggage(), 0.0);
    }
}
