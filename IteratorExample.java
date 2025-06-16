package javaprojets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("Iterating ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            String item = arrayListIterator.next();
            System.out.println(item);
        }

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");

        System.out.println("\nIterating LinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            String item = linkedListIterator.next();
            System.out.println(item);
        }

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");

        System.out.println("\nIterating HashSet:");
        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            String item = hashSetIterator.next();
            System.out.println(item);
        }
    }
}
