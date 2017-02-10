package stopwatch;

/**
 * Runnable for create of method that use same of evey class.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public interface Runnable {
    /**
     * to run this task that combining .
     */
    public void run();
    /**
     * To print the describes the task and a constructor to initialize the task.
     * @return a string of information and count.
     */
    public String toString();
    /**
     * To print length of the String.
     * @return a string of last String result length.
     */
    public String sumPrint();
}
