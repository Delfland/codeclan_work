import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.plane = plane;
        this.crewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void addCrew(CabinCrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public int getNumberOfCrew() {
        return crewMembers.size();
    }

    public int getPassengerNumbers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void bookPassenger(Passenger passenger) {
        if(this.getAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public double getTotalLuggage() {
        return plane.getTotalWeight() / 2;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
