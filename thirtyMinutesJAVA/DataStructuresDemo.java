package thirtyMinutesJAVA;

import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        // Array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("HashSet: " + hashSet);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("TreeSet: " + treeSet);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        System.out.println("HashMap: " + hashMap);

        // TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        System.out.println("TreeMap: " + treeMap);
    }
}