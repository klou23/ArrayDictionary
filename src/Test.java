public class Test {

    /**
     * Tests ArrayDictionary. Should print:
     *
     * Is empty: true
     * Size: 0
     * Size: 4
     * Contains 1: true
     * Contains 1: false
     * Size: 3
     * Is empty: false
     * get 2: B
     * Keys: [2, 3, 4]
     * Values: [B, C, D]
     */
    public static void main(String[] args) {
        ArrayDictionary<Integer, String> dict = new ArrayDictionary<>();
        System.out.printf("Is empty: %b\n", dict.isEmpty());
        System.out.printf("Size: %d\n", dict.size());
        dict.put(1, "A");
        dict.put(2, "B");
        dict.put(3, "C");
        dict.put(4, "D");
        System.out.printf("Size: %d\n", dict.size());
        System.out.printf("Contains 1: %b\n", dict.contains(1));
        dict.remove(1);
        System.out.printf("Contains 1: %b\n", dict.contains(1));
        System.out.printf("Size: %d\n", dict.size());
        System.out.printf("Is empty: %b\n", dict.isEmpty());
        System.out.printf("get 2: %s\n", dict.get(2));
        System.out.println("Keys: " + dict.keys());
        System.out.println("Values: " + dict.values());
    }

}
