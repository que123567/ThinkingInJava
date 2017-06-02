package Algorithm;

/**
 * Created by smaug on 2017/5/29.
 */
public class Solution4
{
    public static void main(String[] args) {
//        System.out.println(minNumberInRotateArray(new int[]{}));
        System.out.println(minNumberInRotateArrayNew(new int[]{4, 5, 6, 7, 0, 1, 2,3}));
    }

    public static int minNumberInRotateArray(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1])
                    continue;
                else
                    return array[i + 1];
            }
        }
        return 0;
    }
//二分搜索法

    public static int minNumberInRotateArrayNew(int[] array) {
        int cusorHead = 0;
        int cusorTail = array.length - 1;
        int cusorMid = 0;
        while (array[cusorHead] >= array[cusorTail]) { //new int[]{4, 5, 6, 7, 0, 1, 2, 3};
            cusorMid = (cusorHead + cusorTail) / 2;

            if (cusorTail - cusorHead == 1) {
                return array[cusorTail];
            }
            if (array[cusorMid] >= array[cusorHead]) {
                cusorHead = cusorMid;
            }
            if (array[cusorMid] <= array[cusorTail]) {
                cusorTail = cusorMid;
            }
        }
        return array[cusorHead];
    }
}
