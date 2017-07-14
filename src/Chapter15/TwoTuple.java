package Chapter15;

/**
 * Created by smaug on 2017/7/14.
 */
public class TwoTuple<A, B>
{
    public final A First;
    public final B Second;


    public TwoTuple(A first, B second) {
        First = first;
        Second = second;
    }

    @Override
    public String toString() {
        return "(" + First + " , " + Second + ")";
    }
}
