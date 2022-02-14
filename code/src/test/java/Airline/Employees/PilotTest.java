package Airline.Employees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Bob","Co-pilot");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals("Co-pilot", pilot.getRank());
    }
}
