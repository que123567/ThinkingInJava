package Chapter15;

/**
 * Created by smaug on 2017/7/14.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B>
{
    public final C Third;


    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        Third = third;
    }

    @Override
    public String toString() {
        return "(" + First + " , " + Second + "," + Third + ")";
    }
}

