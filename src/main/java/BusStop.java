import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public void addWaitingPassenger(Person person) {
        this.queue.add(person);
    }

    public Person removeWaitingPassenger() {
        return this.queue.remove(0);
    }
}
