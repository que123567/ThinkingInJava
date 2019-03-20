package Chapter14;

import java.util.HashMap;
import java.util.Map;

public class PerCreator {
    static class perCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quality = get(type);
            if (quality == null) {
                put(type, 1);
            } else {
                put(type, quality + 1);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 10);
        hashMap.put("b", 10);
        hashMap.put("c", 22);
        perCounter counter = new perCounter();
    }
}
