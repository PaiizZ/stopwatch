package stopwatch;

/**
 * AppendToString, this is task to measure the elapsed time between combining CHAR to String.
 * You can change the count of a counter.
 *
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class AppendToString implements Runnable {
    /**
     * Constructor for a new AppendToString.
     * Set new count for run in loop.
     *
     * @param count is the counter, type is int
     */
    public AppendToString(int count) {
        TaskTimer.count = count;
    }

    /**
     * to run this task that combining CHAR to String.
     */
    public void run() {
        TaskTimer.sum = "";
        int k = 0;
        while (k++ < TaskTimer.count) {
            TaskTimer.sum = TaskTimer.sum + TaskTimer.CHAR;
        }
    }

    /**
     * To print length of the string.
     *
     * @return a string of last string result length.
     */
    public String sumPrint() {
        return "final string length = " + TaskTimer.sum.length();
    }

    /**
     * To print the describes the task and a constructor to initialize the task.
     *
     * @return a string of information and count.
     */
    public String toString() {
        return String.format("Append %,d chars to String", TaskTimer.count);
    }

}
