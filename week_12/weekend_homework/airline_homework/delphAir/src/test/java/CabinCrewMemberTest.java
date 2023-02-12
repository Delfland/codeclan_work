import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Donna Vaughn", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasAName(){
        assertEquals("Donna Vaughn", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasARank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberCanRelayMessagesToPassengers(){
       assertEquals("Please listen to the safety instructions", cabinCrewMember.relayMessage());
    }
}
