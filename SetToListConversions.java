package javaprojets;

import java.util.HashSet;
import java.util.ArrayList;

public class SetToListConversions {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");

        System.out.println("Original HashSet: " + hashSet);

        // Convert to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("Converted ArrayList: " + arrayList);
    }
}
