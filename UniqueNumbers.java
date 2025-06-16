package heiio;

import java.util.TreeSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10);
        numbers.add(7);
        System.out.println("Unique numbers in sorted order:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

