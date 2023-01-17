import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;
    private BusStop busstop;

    private Person person;

    @Before
    public void before(){
        passenger = new Passenger();
        bus = new Bus("London", 50);
        person = new Person();
        busstop = new BusStop("London");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfEnoughCapacity(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassengerFromTheBus(){
        bus.removePassenger(passenger);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void removePersonFromBusStopAndAddToPassengers(){
        bus.pickUp(person, passenger);
        bus.pickUp(person, passenger);
        assertEquals(0, busstop.personCount());
        assertEquals(2, bus.passengerCount());
    }

}
