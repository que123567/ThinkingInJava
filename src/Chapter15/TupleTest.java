package Chapter15;

/**
 * Created by smaug on 2017/7/14.
 */
public class TupleTest
{
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<TupleTest, String, Integer> f1() {
        return new ThreeTuple<>(new TupleTest(), "1", 1);
    }

    public static void main(String[] args){

        System.out.println(f());
        System.out.println(f1());
    }
}
