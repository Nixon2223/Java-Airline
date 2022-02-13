package Airline;

import org.junit.Before;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(Plane.Type.AIRBUS_A380);
    }
}
