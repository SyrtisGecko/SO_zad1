import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Przemek on 2017-03-23.
 */
public class Simulation {

    ArrayList<Task> toBeProcessedList;
    Iterator iterator;
    Random random;

    SimFCFS fcfs;

    private int quantity;

    public Simulation(int quantity) {
        this.quantity = quantity;

        toBeProcessedList = new ArrayList<Task>(quantity);
        random = new Random();
    }

    public void runSimulations() {
        fcfs = new SimFCFS(toBeProcessedList);
        fcfs.runSim();
    }

    public void generateTasks() {
        for(int i = 0; i < quantity; i++) {
            toBeProcessedList.add(new Task(i, randTime()));
        }
    }

    private int randTime() {
        return random.nextInt(100);
    }

    public void displayToBeProcessedList() {
        iterator = toBeProcessedList.iterator();
        while(iterator.hasNext()) {
            ((Task)iterator.next()).displayTask();
        }
    }
}
