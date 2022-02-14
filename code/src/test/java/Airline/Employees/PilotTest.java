package Airline.Employees;

import Airline.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Plane plane;

    @Before
    public void before() {
        pilot = new Pilot("Bob","Co-pilot");
        plane = new Plane(Plane.Type.AIRBUS_A380);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals("Co-pilot", pilot.getRank());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Flying AIRBUS_A380", pilot.fly(plane));
    }

}
