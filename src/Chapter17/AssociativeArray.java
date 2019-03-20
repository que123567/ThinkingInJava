package Chapter17;

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V val) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, val};
    }

    public V get(K key) {
        for (int i = 0; i < index; i++) {
            if (pairs[i][0].equals(key))
                return (V) pairs[i][1];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < index; i++) {
            str.append(pairs[i][0].toString() + ":" + pairs[i][1].toString() + "  ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<>(4);
        map.put("sky", "blue");
        map.put("sky", "blue");
        map.put("sky", "blue");
        map.put("river", "blue");
        System.out.println(map);
        System.out.println(map.get("sky"));
        System.out.println(map.get("river"));
        System.out.println(map.get("rive"));
    }
}
