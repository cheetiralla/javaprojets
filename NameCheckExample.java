package javaprojets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class NameCheckExample {

    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");

        if (arrayList.contains("Apple")) {
            System.out.println("ArrayList contains 'Apple'");
        }

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");

        if (linkedList.contains("Cat")) {
            System.out.println("LinkedList contains 'Cat'");
        }

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");

        if (hashSet.contains("Green")) {
            System.out.println("HashSet contains 'Green'");
        }

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");

        // Check if a value exists
        if (hashMap.containsValue("John")) {
            System.out.println("HashMap contains value 'John'");
        }

        // Check if a key exists
        if (hashMap.containsKey(2)) {
            System.out.println("HashMap contains key 2");
        }
    }
}
