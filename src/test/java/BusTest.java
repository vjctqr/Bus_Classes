import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;


    @Before
    public void before(){
    bus = new Bus(22);
   }

    @Test
     public void hasRouteNumber(){
        assertEquals(22, bus.getRouteNumber());
        }
}


