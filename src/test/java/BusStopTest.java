import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Home");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addWaitingPassenger(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addWaitingPassenger(person);
        busStop.removeWaitingPassenger();
        assertEquals(0, busStop.getQueueLength());
    }
}
