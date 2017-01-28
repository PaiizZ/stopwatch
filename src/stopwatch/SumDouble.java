package stopwatch;

/**
 * SumDuble, this is task to measure the elapsed time between summation the values type Double object.
 * @author Wanchanapon Thanwaranurak
 * @version 1/27/2017 AD.
 */
public class SumDouble implements Runnable{
    /** The array type Double object. */
    private Double[] values = new Double[TaskTimer.ARRAY_SIZE];
    /** The result of summation Double object. */
    private Double sum = new Double(0.0);

    public SumDouble(int count) {
        TaskTimer.count = count ;
    }

    /**
     * to run this task that summation the array of Double object.
     */
    public void run() {
        /** create array of values to add, before we start the timer. */
        for(int i=0; i<TaskTimer.ARRAY_SIZE; i++) values[i] = new Double(i+1);
        /** count = loop counter, i = array index */
        for(int count=0, i=0; count<TaskTimer.count; count++, i++) {
            if (i >= TaskTimer.ARRAY_SIZE) i = 0;
            sum = sum + values[i];
        }
    }

    /**
     * To print the describes the task and a constructor to initialize the task.
     * @return a string of information and count.
     */
    public String toString(){
        return String.format("Sum array of Double objects with count=%,d\n", TaskTimer.count);
    }
}
