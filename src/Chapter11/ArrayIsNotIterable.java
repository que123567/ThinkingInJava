package Chapter11;

import java.util.Arrays;

/**
 * Created by smaug on 2017/7/14.
 */
public class ArrayIsNotIterable
{
    static <T> void test(Iterable<T> ib) {
        for (T t : ib)
            System.out.println(t);
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        test(Arrays.asList(strings));
    }
}
