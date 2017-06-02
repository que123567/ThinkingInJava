package Algorithm;

/**
 * Created by smaug on 2017/5/28.
 */
public class Solution1
{
    public static void main(String[] args) {
        if (Find(1, new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})) {
            System.out.println("true");
        }
    }

    public static boolean Find(int target, int[][] array) {//从左下角遍历
        int i = array.length-1;
        int j = 0;
        while (i >= 0 && j < array[0].length) {
            if (array[i][j] == target)
                return true;
            else if (array[i][j] < target)
                j++;
            else i--;
        }
        return false;
    }
}
