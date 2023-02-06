import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;

    @Before
    public void setup() {
        bear = new Bear("Baloo", 25, 95.62, 'm');
    }

    @Test
    public void bearHasAName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void bearHasAnAge() {
        assertEquals(25, bear.getAge());
    }

    @Test
    public void bearHasAWeight() {
        assertEquals(95.62, bear.getWeight(), 0.00);
    }

    @Test
    public void bearIsReadyToHibernateIfWeightGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void bearIsNotReadyToHibernateIfWeightIsLessThan80() {
        bear = new Bear("Gruff", 12, 75.62, 'f');
        assertEquals(false, bear.readyToHibernate());
    }

    @Test
    public void bearHasSex() {
        assertEquals('m', bear.getSex());
    }
}
