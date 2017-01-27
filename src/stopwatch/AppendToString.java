package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class AppendToString implements Runnable{

    AppendToString(int count){
        TaskTimer.count = count ;
    }
    @Override
    public void run() {
        String result = "";
        int k = 0;
        while(k++ < TaskTimer.count) {
            result = result + TaskTimer.CHAR;
        }
    }

    @Override
    public String toString() {
        return String.format("Append to String with count = %,d\n", TaskTimer.count);
    }
}
