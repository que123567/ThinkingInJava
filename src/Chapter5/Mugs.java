package Chapter5;

/**
 * Created by smaug on 2017/4/20.
 */
public class Mugs
{
    public Mugs() {
        System.out.println("调用mugs构造函数");
    }

    public Mugs(int i) {
        System.out.println("int");
    }

    {
        System.out.println("默认使用");
    }

    public static void main(String[] args) {
        Mugs mugs = new Mugs(1);
    }
}
