package javaprojets;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Remove {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("Original ArrayList: " + arrayList);

        // Remove by index
        arrayList.remove(1); // Removes "Banana"
        System.out.println("After removing index 1: " + arrayList);

        // Remove by value
        arrayList.remove("Orange"); // Removes "Orange"
        System.out.println("After removing value 'Orange': " + arrayList);


        // 2. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("\nOriginal LinkedList: " + linkedList);

        // Remove by index
        linkedList.remove(0); // Removes "Dog"
        System.out.println("After removing index 0: " + linkedList);

        // Remove by value
        linkedList.remove("Cat"); // Removes "Cat"
        System.out.println("After removing value 'Cat': " + linkedList);


        // 3. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicate, ignored
        System.out.println("\nOriginal HashSet: " + hashSet);

        // Remove by value (index doesn't apply to sets)
        hashSet.remove("Green"); // Removes "Green"
        System.out.println("After removing value 'Green': " + hashSet);


        // 4. HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");
        hashMap.put(3, "Bob");
        System.out.println("\nOriginal HashMap: " + hashMap);

        // Remove by key
        hashMap.remove(2); // Removes key 2 ("Alice")
        System.out.println("After removing key 2: " + hashMap);

        // Remove by key-value pair (optional check)
        hashMap.remove(3, "Bob"); // Removes key 3 if value is "Bob"
        System.out.println("After removing key 3 with value 'Bob': " + hashMap);
    }
}
