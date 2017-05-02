package EffectiveJava.part16;

import java.util.Arrays;

/**
 * InstrumentedSet 继承自HashSet 复写了add和addAll方法，在记录addCount时：
 * 由于addAll调用的还是add方法（已被复写），所以addCount被重复计数，导致最后结果双倍输出。
 *
 * 解决方法：使用组合和转发的方式.
 * Created by smaug on 2017/4/29.
 */
public class Client
{
    public static void main(String[] args) {

        InstrumentedSet<String> s = new InstrumentedSet<>();
        s.addAll(Arrays.asList("Test", "b", "c","d"));
        System.out.println(s.getAddCount());
    }
}
