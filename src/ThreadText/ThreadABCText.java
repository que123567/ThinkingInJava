package ThreadText;

/**
 * Created by smaug on 2017/7/1.
 */
public class ThreadABCText implements Runnable
{
    protected String name;
    private Object pref;
    private Object self;

    public ThreadABCText(String name, Object pref, Object self) {
        this.name = name;
        this.pref = pref;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (pref) {
                synchronized (self) {
                    System.out.print(this.name);
                    count--;
                    self.notify();
                }
                try {
                    pref.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadABCText pa = new ThreadABCText("A", c, a);
        ThreadABCText pb = new ThreadABCText("B", a, b);
        ThreadABCText pc = new ThreadABCText("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
