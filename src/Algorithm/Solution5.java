package Algorithm;

/**
 * Created by smaug on 2017/5/29.
 */
public class Solution5
{
    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }

    public static int Fibonacci(int n) {//0 1 1 2 3 5 8 13
        int[] res = new int[]{1, 2};
        if (n < 2)
            return res[n];
        int fibOne = 0;
        int fibTwo = 1;
        int fibTmp = 0;

        for (int i = 2; i <= n; i++) {
            fibTmp = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = fibTmp;
        }
        return fibTmp;
    }

}
