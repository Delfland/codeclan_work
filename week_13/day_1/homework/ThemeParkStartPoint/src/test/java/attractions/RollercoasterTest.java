package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(8, 1.35, 20);
        visitor2 = new Visitor(18, 2.05, 40);
        visitor3 = new Visitor(10, 1.55, 20);
        visitor4 = new Visitor(13, 1.35, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void chargesVisitorsUnder2MetersDefaultPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor3),0.0);
    }

    @Test
    public void willNotAllowVisitorsUnder12() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void AllowsInVisitorsOver12() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void willNotAllowVisitorsUnder12Over1Meter45() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void willNotAllowVisitorsOver12OUnder1Meter45() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));
    }
}
