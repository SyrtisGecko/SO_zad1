/**
 * Created by Przemek on 2017-03-23.
 */
public class Task {
    private final int burst_time;
    private int processed_time;
    private final int id;

    public Task(int id, int burst_time) {
        this.id = id;
        this.burst_time = burst_time;
        processed_time = 0;
    }

    public void displayTask() {
        System.out.println("Task no. " + id + ". Burst time: " + burst_time);
    }
}
