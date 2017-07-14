package BeautyOfCode;

/**
 * Created by smaug on 2017/6/14.

 ??????????????????????//
 */
public class StringSimilar
{
    public int fun(String source, String target) {
        int i, j;
        int[][] d = new int[source.length() + 1][target.length() + 1];
        for (i = 1; i < source.length() + 1; i++) {/*动态规划填表*/
            for (j = 1; j < target.length() + 1; j++) {
                if (source.charAt(i - 1) == target.charAt(j - 1)) {
                    d[i][j] = d[i - 1][j - 1];/*source的第i个和target的第j个相同时*/
                } else {/*不同的时候则取三种操作最小的一个*/
                    d[i][j] = min(d[i][j - 1] + 1, d[i - 1][j] + 1, d[i - 1][j - 1] + 1);
                }
            }
        }
        return d[source.length()][target.length()];
    }

    private int min(int i, int j, int k) {
        int min = i < j ? i : j;
        min = min < k ? min : k;
        return min;
    }

    public static void main(String[] args) {
        StringSimilar ss = new StringSimilar();
        System.out.println(ss.fun("SNOWy", "SUNNy"));//3
        System.out.println(ss.fun("abc", "b"));//1
        System.out.println(ss.fun("abdd", "aebdd"));//1
        System.out.println(ss.fun("travelling", "traveling"));//1
    }
}