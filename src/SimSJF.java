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
//        ArrayList<Task> processingQueue = new ArrayList<Task>(toBeProcessedList);

        System.out.println("------------------------------------------------------");
        System.out.println("---- Started running SJF simulator ----");
        System.out.println("Current time: " + currentTime);

//        int i = 0;
        for (Task task: toBeProcessedList) {
//            processingQueue.add(toBeProcessedList.get(i++));
            delays += task.getDelay();
            task.setArrivalTime(delays);
            task.setStartTime(0);
            task.setEndTime(0);
            task.setWaitingTime(0);
            task.setProcessedTime(0);
        }

        ArrayList<Task> processingQueue = new ArrayList<>();
        int index = 0;
        processingQueue.add(toBeProcessedList.get(index));
        Task currentTask;

        for(int i = 0; i <toBeProcessedList.size(); i++) {
            currentTask = processingQueue.get(index);


            while() {

            }
        }

/*
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
        System.out.println("------------------------------------------------------");*/
    }

    public void getAverageWaitingTime() {
        int sum = 0;

        for(int i = 0; i < avgWaitingFCFS.length; i++) {
            sum += avgWaitingFCFS[i];
        }

        System.out.println("Average waiting time for Tasks to be processed (SJF): " + (double)sum/ avgWaitingFCFS.length);
        System.out.println("------------------------------------------------------");
    }
}
