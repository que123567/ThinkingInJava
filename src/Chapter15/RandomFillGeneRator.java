package Chapter15;

import java.util.Random;

/**
 * Created by smaug on 2017/7/14.
 */
public class RandomFillGeneRator implements Generator
{

    Random random = new Random(47);

    @Override
    public Object next() {
        return random.nextInt() % 1000;
    }
}
