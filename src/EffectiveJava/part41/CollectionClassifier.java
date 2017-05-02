package EffectiveJava.part41;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by smaug on 2017/5/2.
 * 运行结果都是Collection
 */
public class CollectionClassifier
{
    public static String classify(Set<?> E) {
        return "set";
    }

    public static String classify(List lst) {
        return "list";
    }

    public static String classify(Collection<?> c) {
        return "Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {new HashSet<String>(), new ArrayList<String>(), new HashSet<String>()};
        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }
    }

}
