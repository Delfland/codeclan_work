import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Peter Capaldi", RankType.CAPTAIN, "PC43567T");
    }

    @Test
    public void pilotHasAName(){
        assertEquals("Peter Capaldi", pilot.getName());
    }

    @Test
    public void pilotHasARank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasALicenseNumber(){
        assertEquals("PC43567T", pilot.getLicense());
    }

    @Test
    public void pilotCanFlyThePlane(){
        assertEquals("All passengers, prepare for take-off!", pilot.fly());
    }

}
