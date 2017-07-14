package EffectiveJava;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smaug on 2017/7/13.
 */
class Snow
{
}

class Powder extends Snow
{
}

class Light extends Powder
{
}

class Heavy extends Powder
{
}

class Crusty extends Snow
{
}

class Slush extends Snow
{
}

public class Test6
{
    public static void main(String[] args) {
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        System.out.println(snow2.size());
    }
}

