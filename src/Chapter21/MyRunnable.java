package Chapter21;

/**
 * Created by smaug on 2017/6/4.
 */
public class MyRunnable implements Runnable
{
    private int ticket = 10;
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0)
                System.out.println(this.name + "卖票" + this.ticket--);
        }
    }

    public static void main(String[] args) {
        MyRunnable mt1 = new MyRunnable("Runnable");
        Thread t1=new Thread(mt1,"一号");
        Thread t2=new Thread(mt1,"二号");
        Thread t3=new Thread(mt1,"三号");
        t1.start();
        t2.start();
        t3.start();

    }
}
