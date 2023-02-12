import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasACapacity(){
        assertEquals(4, plane.getCapacity());
    }

    @Test
    public void planeHasATotalWeight(){
        assertEquals(160, plane.getTotalWeight(), 0.0);
    }
}
