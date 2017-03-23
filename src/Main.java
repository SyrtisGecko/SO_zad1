import java.util.ArrayList;

/**
 * Created by Przemek on 2017-03-23.
 */
public class Main {

    private static Simulation simulation;

    private final static int TASKS_QUANTITY = 10;




    public static void main(String[] args) {
        simulation = new Simulation(TASKS_QUANTITY);


        simulation.generateTasks();
        simulation.displayToBeProcessedList();
        simulation.runSimulations();
    }


}
