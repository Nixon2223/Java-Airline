package Airline;

import org.junit.Before;
import org.junit.Test;

import static Airline.Plane.Type.AIRBUS_A380;
import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(AIRBUS_A380);
    }

    @Test
    public void canGetType(){
        assertEquals(AIRBUS_A380, plane.getType());
    }
}
