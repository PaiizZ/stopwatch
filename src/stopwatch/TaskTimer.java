package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class TaskTimer {
    static final int ARRAY_SIZE = 500000;
    public static final char CHAR = 'a';
    public static int count = 0;
    public static Stopwatch timer = new Stopwatch();
    public static void measureAndPrint(Runnable runnable) {
        System.out.println(runnable.toString());
        timer = new Stopwatch();
        timer.start();
        runnable.run();
        timer.stop();
        System.out.printf("Elapsed time %.6f sec\n\n",timer.getElapsed());
    }

}
