package Chapter21;

/**
 * Created by smaug on 2017/6/4.
 */
public class ThreadTest implements Runnable
{
    private int countCount = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public ThreadTest(String a, Object c, Object o) {
    }

    public ThreadTest(int countCount) {
        this.countCount = countCount;
    }

    public String status() {
        return "#" + id + "(" + (countCount > 0 ? countCount : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countCount-- > 0) {
            System.out.print(status());
            Thread.yield();
        }

    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
////            new Thread(new ThreadTest()).start();
//        }
//        System.out.println("waiting!");
//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new ThreadTest());
//        }
//        exec.shutdown();
//    }
}
