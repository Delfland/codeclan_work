package people;

import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollercoaster;
    Dodgems dodgems;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        rollercoaster = new RollerCoaster("Void of Doom", 5);
        dodgems = new Dodgems("Dodg'em All", 4);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttractionToVisitedList(){
        visitor.addAttraction(rollercoaster);
        visitor.addAttraction(dodgems);
        assertEquals(2, visitor.getVisitedAttractions().size());
    }
}
