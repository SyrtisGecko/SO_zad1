import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Przemek on 2017-03-23.
 */
public class SimFCFS {

    private int currentTime;

    ArrayList<Task> toBeProcessedList;
    Iterator iterator;
    Task task;

    private int[] avgWaiting;

    public SimFCFS(ArrayList<Task> toBeProcessedList) {
        this.toBeProcessedList = toBeProcessedList;
        currentTime = 0;

        avgWaiting = new int[toBeProcessedList.size()];
    }

    public void runSim() {
        System.out.println("------------------------------------------------------");
        System.out.println("---- Started running FCFS simulator ----");
        System.out.println("Current time: " + currentTime);

        iterator = toBeProcessedList.iterator();
        int i = 0;

        while(iterator.hasNext()) {
            task = (Task) iterator.next();
            task.setWaitingTime(currentTime);
            avgWaiting[i++] = currentTime;
            System.out.println("Waiting time: " + avgWaiting[i-1]);
            System.out.print("Processing: ");
            task.displayTask();
            currentTime += task.getBurstTime();
            System.out.println("Current time: " + currentTime);
        }

        System.out.println("---- Ended running FCFS simulator ----");
        System.out.println("------------------------------------------------------");
    }

    public void getAverageWaitingTime() {
        int sum = 0;

        for(int i = 0; i < avgWaiting.length; i++) {
            sum += avgWaiting[i];
        }

        System.out.println("Average waiting time for Tasks to be processed: " + (double)sum/avgWaiting.length);

    }
}
