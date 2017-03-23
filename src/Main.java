import java.util.ArrayList;

/**
 * Created by Przemek on 2017-03-23.
 */
public class Main {

    private static Simulation simulation;

    public final static int TASKS_QUANTITY = 10;
    public final static int MAX_BURST_TIME = 100;
    public final static int MAX_DELAY = 10;




    public static void main(String[] args) {
        simulation = new Simulation(TASKS_QUANTITY);


        simulation.generateTasks();
        simulation.displayToBeProcessedList();
        simulation.runSimulations();
    }


}
