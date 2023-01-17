import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Leith", 1
        );
        busStop = new BusStop("home");
        person = new Person();
        busStop.addWaitingPassenger(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassengerIfBelowCapacity(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassenger(){
        bus.addPassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
