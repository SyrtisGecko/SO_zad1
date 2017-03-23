import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Przemek on 2017-03-23.
 */
public class SimFCFS {

    private int currentTime;

    ArrayList<Task> toBeProcessedList;
    Iterator iterator;

    public SimFCFS(ArrayList<Task> toBeProcessedList) {
        this.toBeProcessedList = toBeProcessedList;
        currentTime = 0;
    }

    public void runSim() {
        System.out.println("------------------------------------------------------");
        System.out.println("---- Started running FCFS simulator ----");
        System.out.println("Current time: " + currentTime);

        iterator = toBeProcessedList.iterator();

        while(iterator.hasNext()) {
            Task t = (Task) iterator.next();
            System.out.print("Processing: ");
            t.displayTask();
            currentTime += t.getBurstTime();
            System.out.println("Current time: " + currentTime);
        }

        System.out.println("---- Ended running FCFS simulator ----");
        System.out.println("------------------------------------------------------");
    }
}
