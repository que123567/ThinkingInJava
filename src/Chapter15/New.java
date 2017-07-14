package Chapter15;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by smaug on 2017/7/14.
 */
public class New
{
    public static <K, V> AbstractMap<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> lList() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        List<String> ls = New.lList();
        ls.add("1");
    }
}
