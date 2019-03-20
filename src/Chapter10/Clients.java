package Chapter10;

/**
 * Created by smaug on 2017/5/8.
 */
public class Clients {
    private static int[] int2Array(int a) {
        String b = a + "";
        int[] result = new int[b.length()];

        for (int i = 0; i < b.length(); i++) {
            result[i] = b.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 12345;
        int[] b = int2Array(a);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
    }
}
