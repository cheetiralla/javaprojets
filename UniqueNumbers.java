package heiio;

import java.util.TreeSet;

public class UniqueNumbers {
    public static void main(String[] args) {

        // Create a TreeSet to store unique numbers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers (duplicates will be ignored)
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10); // duplicate, won't be added
        numbers.add(7);

        // Display the unique numbers in ascending order
        System.out.println("Unique numbers in sorted order:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

//Tree set task 1store and display unique numbers  in java

//add and find values
//store student names alphabetically

