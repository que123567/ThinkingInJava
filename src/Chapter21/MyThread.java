package Chapter21;

/**
 * Created by smaug on 2017/6/4.
 */


public class MyThread extends Thread
{
    private int ticket = 10;
    private String name;

    public MyThread(String name) {
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
        MyThread my1 = new MyThread("张三");
        MyThread my2 = new MyThread("张二");
        MyThread my3 = new MyThread("张一");
        my1.start();
        my2.start();
        my3.start();

    }
}