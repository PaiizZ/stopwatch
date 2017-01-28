package stopwatch;

/**
 * Created by PaiizZ on 1/27/2017 AD.
 */
public class TaskTimer {

    /**
     * size of the array used in floating point tasks.
     */
    static final int ARRAY_SIZE = 500000;

    /**
     * a word CHAR for test(can be changed).
     * */
    public static final char CHAR = 'a';

    /**
     * the loop counter used in the tasks (can be changed).
     * */
    public static int count = 0;

    /**
     * The result String of combining CHAR.
     * */
    public static String sum = "";

    /**
     * Create timer for use StopWatch.
     * */
    public static Stopwatch timer = new Stopwatch();

    /**
     *
     * @param runnable
     */
    public static void measureAndPrint(Runnable runnable) {
        System.out.println(runnable.toString());
        timer = new Stopwatch();
        timer.start();
        runnable.run();
        timer.stop();
        System.out.println(runnable.sumPrint());
        System.out.printf("Elapsed time %.6f sec\n\n",timer.getElapsed());
    }

}
