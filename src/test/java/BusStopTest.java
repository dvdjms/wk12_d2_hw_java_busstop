import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void before(){
        busstop = new BusStop("London");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, busstop.personCount());
    }

    @Test
    public void addPersonToBusStop(){
        busstop.addPerson(person);
        assertEquals(1, busstop.personCount());
    }

    @Test
    public void removePersonFromBUsStop(){
        busstop.removePerson(person);
        assertEquals(0, busstop.personCount());
    }

}
