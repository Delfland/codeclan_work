
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanetTest {
    private Planet planet;

    @Before
    public void setup() {
        planet = new Planet("Venus", 60518);
    }

    @Test
    public void planetHasAName() {
        assertEquals("Venus", planet.getName());
    }

    @Test
    public void planetHasASize() {
        assertEquals(60518, planet.getSize());
    }

    @Test
    public void planetCanExplode() {
        assertEquals("Boom! Venus has exploded.", planet.explode());
    }
}
