package Chapter21;

import java.util.concurrent.TimeUnit;

/**
 * Created by smaug on 2017/6/4.
 */
public class SimpleDeamon implements Runnable
{


    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamon());
            deamon.setDaemon(true);
            deamon.start();
        }
        System.out.println("all deamon start!");
        TimeUnit.MILLISECONDS.sleep(150);
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(10);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                System.out.println("sleep() interupted");
            }
        }
    }



}
