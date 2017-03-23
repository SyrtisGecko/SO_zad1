/**
 * Created by Przemek on 2017-03-23.
 */
public class Task {

    private final int burstTime;
    private int processedTime;
    private int waitingTime;
    private final int id;

    public Task(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        processedTime = 0;
        waitingTime = 0;
    }

    public void displayTask() {
        System.out.println("Task no. " + id + ". Burst time: " + burstTime);
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
}
