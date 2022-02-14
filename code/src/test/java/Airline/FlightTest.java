package Airline;

import Airline.Employees.CabinCrew;
import Airline.Employees.Pilot;
import org.junit.Before;
import org.junit.Test;

import static Airline.Plane.Type.AIRBUS_A380;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    CabinCrew cabinCrew;
    Passenger passenger;
    Pilot pilot;

    @Before
    public void before(){
        plane = new Plane(AIRBUS_A380);
        cabinCrew = new CabinCrew("Ron","Trainee");
        passenger = new Passenger("Jeff", 2);
        pilot = new Pilot("Bob","Co-pilot");
        flight = new Flight(pilot, plane,"1234","EDI","12:00");
    }

    @Test
    public void bookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }


    @Test
    public void canReturnNumSeatsLeft(){
        flight.bookPassenger(passenger);
        assertEquals(199, flight.seatsLeft());
    }
}
