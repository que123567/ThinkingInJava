package Chapter15;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by smaug on 2017/7/14.
 * 容器填充
 */
public class Generators
{
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 18);
        for (Integer i : fnumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collection<Integer> Inumbers = fill(new ArrayList<Integer>(), new RandomFillGeneRator(), 18);
        for (int i : Inumbers) {
            System.out.print(i+" ");
        }
    }
}
