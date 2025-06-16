package heiio;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add values
        numbers.add(15);
        numbers.add(3);
        numbers.add(8);
        numbers.add(15); // duplicate, won't be added

        // Find if a value exists
        int valueToFind = 8;
        if (numbers.contains(valueToFind)) {
            System.out.println(valueToFind + " is found in the set.");
        } else {
            System.out.println(valueToFind + " is NOT found in the set.");
        }

        // Find a value that does not exist
        int missingValue = 10;
        if (numbers.contains(missingValue)) {
            System.out.println(missingValue + " is found in the set.");
        } else {
            System.out.println(missingValue + " is NOT found in the set.");
        }
    }
}
