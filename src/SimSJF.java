import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Przemek on 2017-03-23.
 */
public class SimSJF {
    // TODO najpierw ustalic wszystkim arrivalTime
    ArrayList<Task> toBeProcessedList;
    Iterator iterator;
    Task task;

    private int[] avgWaitingFCFS;

    public SimSJF(ArrayList<Task> toBeProcessedList) {
        this.toBeProcessedList = toBeProcessedList;

        avgWaitingFCFS = new int[toBeProcessedList.size()];
    }

    public void runSim() {
        int currentTime = 0;
        int delays = 0;

        System.out.println("------------------------------------------------------");
        System.out.println("---- Started running FCFS simulator ----");
        System.out.println("Current time: " + currentTime);

        for (Task task: toBeProcessedList) {
            task.setArrivalTime(delays);
            delays += task.getDelay();
        }

        iterator = toBeProcessedList.iterator();
        int i = 0;

        while(iterator.hasNext()) {
            task = (Task) iterator.next();
            delays += task.getDelay();
            task.setArrivalTime(delays);
            task.setStartTime(currentTime);
            task.setEndTime(currentTime + task.getBurstTime());
            task.setWaitingTime(task.getStartTime() - task.getArrivalTime());
            avgWaitingFCFS[i++] = task.getWaitingTime();
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

        for(int i = 0; i < avgWaitingFCFS.length; i++) {
            sum += avgWaitingFCFS[i];
        }

        System.out.println("Average waiting time for Tasks to be processed: " + (double)sum/ avgWaitingFCFS.length);
        System.out.println("------------------------------------------------------");
    }
}
