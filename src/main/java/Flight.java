import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(ArrayList <CabinCrewMember> cabinCrewMembers, ArrayList <Passenger> passengers, Pilot pilot, Plane plane, String flightNumber, String destination, String origin, String departureTime) {
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
    }

    public int getRemainingSeats() {
        int capacity = this.plane.getCapacity();
        int passengers = this.passengers.size();
        return capacity - passengers;
    }

    public void bookPassenger(Passenger passenger) throws Exception {
        if (getRemainingSeats() > 0){
            passengers.add(passenger);
        }
        else{
            throw new Exception("Flight sold out.");
        }
    }

    public int getTotalPassengers() {
        return this.passengers.size();
    }

    public String getPilot(Pilot pilot) {
        return this.pilot.getName() + " is flying this plane.";
    }

    public String getCabinCrewMember(CabinCrewMember cabinCrewMember) {
        return "My name is " + cabinCrewMember.getName() + " and I'd like to welcome our guests today.";
    }
}

















