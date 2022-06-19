import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void SetUp(){
        pilot = new Pilot("Tom Cruise", Rank.CAPTAIN, "MAV6789");
        cabinCrewMember1 = new CabinCrewMember("Val Kilmer", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Pam Grier", Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(cabinCrewMember1);
        cabinCrew.add(cabinCrewMember2);

        plane = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Jim", 2);
        passenger2 = new Passenger("Steve", 3);
        passenger3 = new Passenger("Jill", 1);

        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        flight = new Flight(cabinCrew, passengers, pilot, plane, "DL881702", "FSD", "EDI", "06:00");
    }

    @Test
    public void canFindAvailableSeats(){
        assertEquals(0, flight.getRemainingSeats());
    }

    @Test (expected = Exception.class)
    public void cannotBookPassengerIfNoSeatsAvailable() throws Exception {
        Passenger passenger4 = new Passenger("Laura", 2);
        flight.bookPassenger(passenger4);
    }

    @Test
    public void canBookPassengerIfSeatsAvailable() throws Exception{
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(cabinCrewMember1);
        cabinCrew.add(cabinCrewMember2);

        Flight flight2 = new Flight(cabinCrew, passengers, pilot, plane, "DL881702", "FSD", "EDI", "06:00");
        flight2.bookPassenger(passenger3);
        assertEquals(3, flight2.getTotalPassengers());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Tom Cruise is flying this plane.", flight.getPilot(pilot));
    }

    @Test
    public void cabinCrewMemberCanSpeakToPassengers(){
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(cabinCrewMember1);
        assertEquals("My name is Val Kilmer and I'd like to welcome our guests today.", flight.getCabinCrewMember(cabinCrewMember1));
    }
}









