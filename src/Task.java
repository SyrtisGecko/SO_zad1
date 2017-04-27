/**
 * Created by Przemek on 2017-03-23.
 */
public class Task {

    private final int burstTime;
    private int delay;
    private int processedTime;
    private int waitingTime;
    private int arrivalTime;
    private int startTime;
    private int endTime;
    private final int id;

    public Task(int id, int burstTime, int delay) {
        this.id = id;
        this.burstTime = burstTime;
        this.delay = delay;
        processedTime = 0;
        waitingTime = 0;
        arrivalTime = 0;
        startTime = 0;
        endTime = 0;
    }

    public void displayTask() {
        System.out.println("Task no. " + id + ". Burst time: " + burstTime + ". Delay: " + delay + ". Arrival time: " + arrivalTime +
                            ". Start time: " + startTime + " (waiting: " + waitingTime + "). End time: " + endTime);
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

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(int processedTime) {
        this.processedTime = processedTime;
    }
}
