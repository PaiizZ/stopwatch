package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class Main {
    public static void main(String[] arg) {
        TaskTimer taskTimer = new TaskTimer();

        taskTimer.measureAndPrint(new AppendToString(100000));
        taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
        taskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
        taskTimer.measureAndPrint(new SumDouble(1000000000));
        taskTimer.measureAndPrint(new SumBigDecimal(1000000000));

    }
}
