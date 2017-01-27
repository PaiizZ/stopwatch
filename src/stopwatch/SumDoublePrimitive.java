package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class SumDoublePrimitive implements Runnable {

    double[] values = new double[TaskTimer.ARRAY_SIZE];

    double sum = 0.0;
    public SumDoublePrimitive(int count) {
        TaskTimer.count = count ;
    }
    @Override
    public void run() {
        for (int k = 0; k < TaskTimer.ARRAY_SIZE; k++) values[k] = k + 1;
        for (int count = 0, i = 0; count < TaskTimer.count; count++, i++) {
            if (i >= values.length) i = 0;  // reuse the array when get to last value
            sum = sum + values[i];
        }
    }
    @Override
    public String toString(){
        return String.format("Sum array of double primitives with count=%,d\n", TaskTimer.count);
    }
}
