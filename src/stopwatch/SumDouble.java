package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */

public class SumDouble implements Runnable{
    /** The array type Double object. */
    private Double[] values = new Double[TaskTimer.ARRAY_SIZE];
    /** The result of summation Double object. */
    private Double sum = new Double(0.0);

    public SumDouble(int count) {
        TaskTimer.count = count ;
    }

    public void run() {
        /** create array of values to add, before we start the timer. */
        for(int i=0; i<TaskTimer.ARRAY_SIZE; i++) values[i] = new Double(i+1);
        /** count = loop counter, i = array index */
        for(int count=0, i=0; count<TaskTimer.count; count++, i++) {
            if (i >= TaskTimer.ARRAY_SIZE) i = 0;
            sum = sum + values[i];
        }
    }

    public String toString(){
        return String.format("Sum array of Double objects with count=%,d\n", TaskTimer.count);
    }
}
