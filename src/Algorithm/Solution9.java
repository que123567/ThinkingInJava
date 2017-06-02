package Algorithm;

/**
 * Created by smaug on 2017/5/30.
 */
public class Solution9
{
    public static void main(String[] args) {
        MoveOdd(new int[]{});

    }

    public static void MoveOdd(int[] nums) { //移动奇数使其在所有偶数前面
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] % 2 != 0)
                i++;
            while (nums[j] % 2 == 0)
                j--;
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }
    }


}
