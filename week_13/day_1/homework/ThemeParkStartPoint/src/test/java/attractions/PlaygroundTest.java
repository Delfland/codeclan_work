package attractions;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(8, 1.35, 20);
        visitor2 = new Visitor(18, 2.05, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void AllowsInVisitorsUnder15() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void doesNotAllowInVisitorsOver15() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }


}
