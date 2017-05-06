package Chapter9;

import java.util.Arrays;

/**
 * Created by smaug on 2017/5/3.
 */
class Processors//书中本为Processor，但是书中有重名接口为Processor 故将此处改为Processors 避免重复
{
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processors
{
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processors
{
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processors
{
    Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


public class Apply
{
    private static String s = "we are the world.";

    public static void procee(Processor p, Object s) {
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
//    procee(new Upcase(),s);
//    procee(new Downcase(),s);
//    procee(new Splitter(),s);
    }

}
