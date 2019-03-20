package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Apple {
    private long id;

    public Apple(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

class Orange {
}

public class AppleAndOrange {
    public static void main(String[] args) {
        /**
         * Apple
         */
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(new Apple(123));
//        arrayList.add(new Orange());
//
//        System.out.println(((Apple) arrayList.get(0)).getId());
//        System.out.println(((Apple) arrayList.get(1)).getId());

        /**
         *
         */

        /**
         *Arrays.asList测试
         */
        Integer[] ints = {1, 2, 3, 4, 5};
        List list = new ArrayList(Arrays.asList(ints));
//      List list = Arrays.asList(ints); 此时ints与list持有相同对象引用
        System.out.println(list.size());
        Collections.shuffle(list);
        System.out.println(Arrays.toString(ints));
        System.out.println(list);
    }
}
