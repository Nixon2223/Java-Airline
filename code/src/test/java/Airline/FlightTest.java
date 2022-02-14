package Airline;

import Airline.Employees.CabinCrew;
import org.junit.Before;
import org.junit.Test;

import static Airline.Plane.Type.AIRBUS_A380;

public class FlightTest {

    Flight flight;
    Plane plane;
    CabinCrew cabinCrew;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(AIRBUS_A380);
        cabinCrew = new CabinCrew("Ron","Trainee");
        passenger = new Passenger("Jeff", 2);
        flight = new Flight()
    }

    @Test
    public void setPilot() {
    }

    @Test
    public void setCabinCrew() {
    }

    @Test
    public void setPassengers() {
    }

    @Test
    public void setPlane() {
    }

    @Test
    public void setFlightNum() {
    }

    @Test
    public void setDepartureAirport() {
    }

    @Test
    public void setGetDepartureTime() {
    }

    @Test
    public void getPilot() {
    }

    @Test
    public void getCabinCrew() {
    }

    @Test
    public void getPassengers() {
    }

    @Test
    public void getPlane() {
    }

    @Test
    public void getFlightNum() {
    }

    @Test
    public void getDepartureAirport() {
    }

    @Test
    public void getGetDepartureTime() {
    }
}
