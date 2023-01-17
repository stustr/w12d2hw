import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        if (this.passengers.size() < this.capacity){
            Person person = busStop.removeWaitingPassenger();
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
