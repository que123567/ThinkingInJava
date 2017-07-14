package Chapter21;

/**
 * Created by smaug on 2017/6/4.
 */
public class DeamonThreadFactory
{
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }

}
