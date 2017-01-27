package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class AppendToStringBuilder implements Runnable {

    AppendToStringBuilder(int count) {
        TaskTimer.count = count;
    }

    @Override
    public void run() {
        StringBuilder builder = new StringBuilder();
        int k = 0;
        while(k++ < TaskTimer.count) {
            builder = builder.append(TaskTimer.CHAR);
        }
    }

    @Override
    public String toString() {
        return String.format("Append to String with count = %,d\n", TaskTimer.count);
    }
}
