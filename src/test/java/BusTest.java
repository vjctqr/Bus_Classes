import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;


    @Before
    public void before(){
    bus = new Bus(22, "Leith");


   }

    @Test
     public void hasRouteNumber(){
        assertEquals(22, bus.getRouteNumber());
    }
    
    @Test
     public void hasDestination(){
        assertEquals("Leith", bus.getDestination());
    }
    
    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    
//    @Test
//    public void canAddPassenger(){
//        bus.addPassenger(person);
//        assertEquals();
//    }
    
        
        
}


