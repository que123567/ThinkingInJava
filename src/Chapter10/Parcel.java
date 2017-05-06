package Chapter10;

/**
 * Created by smaug on 2017/5/5.
 */
class Contents
{
}

public class Parcel
{
    public Contents contents() {
        return new Contents()
        {
            private int i = 1;

            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Contents c = p.contents();
    }

}
