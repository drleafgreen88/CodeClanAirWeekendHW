import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot ("Leslie Nielson", Rank.CAPTAIN, "LN12345");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Leslie Nielson", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("LN12345", pilot.getPilotLicenseNumber());
    }
}
