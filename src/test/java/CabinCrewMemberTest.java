import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Nicolas Cage", Rank.CAPTAIN);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Nicolas Cage", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

}
