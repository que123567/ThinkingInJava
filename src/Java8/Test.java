package Java8;

import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 3};
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        long cnt = countCnts(arrayList, 1);
        System.out.println(cnt);
    }

    /**
     * 数组分割
     *
     * @param numbers
     * @param size
     * @return
     */
    public static int[][] chunk(int[] numbers, int size) {
        return IntStream.iterate(0, i -> i + size)
                .limit((long) Math.ceil((double) numbers.length / size))
                .mapToObj(cur -> Arrays.copyOfRange(numbers, cur, cur + size > numbers.length ? numbers.length : cur + size))
                .toArray(int[][]::new);
    }


    public static long countCnts(List<Integer> numbers, int value) {
        return numbers.stream().filter(number -> number == value).count();
    }

    /**
     * 返回a集合-b集合结果
     *
     * @param first
     * @param second
     * @return
     */
//    public static int[] difference(List<Integer> first, List<Integer> second) {
//        Set<Integer> set = null;
//        return Arrays.stream(first)
//                .filter(value -> !set.contains(value))
//                .toArray();
//    }
}
