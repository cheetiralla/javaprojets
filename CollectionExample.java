package javaprojets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionExample {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("LinkedList: " + linkedList);

        // 3. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // duplicate, will not be added
        System.out.println("HashSet: " + hashSet);

        // 4. HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");
        hashMap.put(3, "Bob");
        System.out.println("HashMap: " + hashMap);
    }
}

