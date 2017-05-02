package EffectiveJava.part41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by smaug on 2017/5/2.
 */
public class SetList
{
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);//数值
            list.remove(i); //索引
        }
        System.out.println(set+":"+list);
    }
}
