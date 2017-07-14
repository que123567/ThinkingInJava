package BeautyOfCode;
/**
 * Chapter-3.1 P215
 * Created by smaug on 2017/6/14.

 */
public class StringRotate
{
    public static void main(String[] args) {
        System.out.println(Test("ABCD","CDAA"));
    }

    public static Boolean Test(String a, String b) {
        a += a;
        if (a.contains(b))
            return true;
        else
            return false;
    }
}
