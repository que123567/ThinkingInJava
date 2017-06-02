package Algorithm;

/**
 * Created by smaug on 2017/5/29.
 */
public class Solution6
{
    public static void main(String[] args) {
        System.out.println(NumberOfOne(10));
    }

    static int NumberOfOne(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
