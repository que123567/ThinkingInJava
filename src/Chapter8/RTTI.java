package Chapter8;

/**
 * Created by smaug on 2017/5/2.
 */
class Useful
{
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful
{
    public void f() {
    }

    public void g() {
    }

    public void m() {
    }

}

public class RTTI
{
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].f();
        ((MoreUseful) x[0]).m();// ClassCastException
        ((MoreUseful) x[1]).m();
    }
}
