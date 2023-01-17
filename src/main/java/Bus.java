import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> bus;
    private ArrayList<Person> queue;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.bus = new ArrayList<Passenger>();
        this.queue = new ArrayList<Person>();
    }

    public int passengerCount(){
        return this.bus.size();
    }

    public int addPassenger(Passenger passenger){
        if (this.bus.size() < 50) {
            this.bus.add(passenger);
            return this.bus.size();
        }
        return this.bus.size();
    }

    public void removePassenger(Passenger passenger){
        this.bus.remove(passenger);
    }

    public void pickUp(Person person, Passenger passenger){
        if (this.bus.size() < 50) {
            this.queue.add(person);
            this.queue.remove(person);
            this.bus.add(passenger);
        }

    }
}
