package EffectiveJava.part39;

import java.util.Date;

/**
 * Created by smaug on 2017/4/29.
 */
public class Client
{
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        p.end().getTime();
        
    }

}
