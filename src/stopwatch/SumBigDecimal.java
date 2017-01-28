package stopwatch;
import java.math.BigDecimal;
public class SumBigDecimal implements Runnable{
    /** The array type BigDecimal object. */
    private BigDecimal[] values = new BigDecimal[TaskTimer.ARRAY_SIZE];
    /** The result of summation BigDecimal object. */
    private BigDecimal sum = new BigDecimal(0.0);
    /**
     * Constructor for a new SumBigDecimal.
     * Set new count for run in loop.
     * @param count is the counter, type is int
     */
    public SumBigDecimal(int count) {
        TaskTimer.count = count ;
    }
    /**
     * To get the elapsed time.
     * @return a double of time with second unit.
     */
    public double getElapsed(){
        return TaskTimer.timer.getElapsed();
    }
    /**
     * to print values of the summation result.
     * @return String that refer to this summation result.
     */
    public String sumPrint() {
        return "sum = " + sum;
    }
    /**
     * to run this task that summation the array of SumBigDecimal object.
     */
    public void run() {
        /** create array of values to add, before we start the timer. */
        for(int i=0; i<TaskTimer.ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
        /** count = loop counter, i = array index */
        for(int count=0, i=0; count<TaskTimer.count; count++, i++) {
            if (i >= TaskTimer.ARRAY_SIZE) i = 0;
            sum = sum.add( values[i] );
        }

    }
    /**
     * To print the describes the task and a constructor to initialize the task.
     * @return a string of information and count.
     */
    public String toString(){
        return String.format("Sum array of BigDecimal with count=%,d", TaskTimer.count);
    }
}
