package thirtyMinutesJAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Date;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class PredefinedClassesDemo {
    public static void main(String[] args) {
        // java.lang.String
        String str = "Hello, World!";
        System.out.println("String: " + str);

        // java.util.Date
        Date date = new Date();
        System.out.println("Date: " + date);

        // java.util.Random
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Random Integer: " + randomInt);

        // java.util.ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);

        // java.util.LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList: " + linkedList);

        // java.util.HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: " + hashSet);

        // java.util.TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        System.out.println("TreeSet: " + treeSet);

        // java.util.HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // java.util.TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        System.out.println("TreeMap: " + treeMap);

        // java.io.File and java.io.FileWriter
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // java.math.BigDecimal
        BigDecimal bigDecimal = new BigDecimal("12345.6789");
        System.out.println("BigDecimal: " + bigDecimal);

        // java.math.BigInteger
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        System.out.println("BigInteger: " + bigInteger);
    }
}