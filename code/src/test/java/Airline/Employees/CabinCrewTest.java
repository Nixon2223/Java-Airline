package Airline.Employees;

import Airline.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Ron","Trainee");
    }

    @Test
    public void canGetName(){
        assertEquals("Ron", cabinCrew.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals("Trainee", cabinCrew.getRank());
    }

    @Test
    public void canFastenSeatbeltsMessage(){
        assertEquals("Please fasten your seatbelts", cabinCrew.fastenSeatbelts());
    }

}