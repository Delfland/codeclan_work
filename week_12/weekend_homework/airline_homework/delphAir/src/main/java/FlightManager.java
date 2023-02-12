public class FlightManager {

    public double getIndividualLuggageAllowance(Flight flight){
        return flight.getTotalLuggage() / flight.getPlane().getCapacity();
    }

    public double getTotalBookedLuggageWeight(Flight flight) {
        double bookedLuggageWeight = 0;
        for (Passenger passenger : flight.getPassengers()) {
            double passengerLuggageWeight = passenger.getBagNumber() * 10;
            bookedLuggageWeight += passengerLuggageWeight;
        }
        return bookedLuggageWeight;
    }

    public double getAvailableLuggageAllowance(Flight flight) {
        return flight.getTotalLuggage() - this.getTotalBookedLuggageWeight(flight);
    }
}
