package stopwatch;

import java.math.BigDecimal;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class SumBigDecimal implements Runnable {

    BigDecimal[] values = new BigDecimal[TaskTimer.ARRAY_SIZE];

    BigDecimal sum = new BigDecimal(0.0);

    SumBigDecimal(int count) {
        TaskTimer.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<TaskTimer.ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
        // count = loop counter, i = array index value
        for(int count=0, i=0; count<TaskTimer.count; count++, i++) {
            if (i >= values.length) i = 0;
            sum = sum.add( values[i] );
        }
    }

    @Override
    public String toString() {
        return String.format("Sum array of BigDecimal with count=%,d\n", TaskTimer.count);
    }
}
