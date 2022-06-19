import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before (){
        plane = new Plane(PlaneType.AIRBUSA330);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.AIRBUSA330, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(PlaneType.AIRBUSA330.getCapacity(), plane.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(PlaneType.AIRBUSA330.getWeight(), plane.getWeight());
    }

}
