import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int personCount(){
        return this.queue.size();
    }

    public void addPerson(Person person){
        this.queue.add(person);
//        return this.queue.size();
    }

    public void removePerson(Person person){
        this.queue.remove(person);
    }

}
