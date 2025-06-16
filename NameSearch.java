package heiio;

import java.util.Arrays;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        // Sorted array of names
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
        
        // Ask the user to input a name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String inputName = scanner.nextLine();

        // Binary search for the name
        int index = Arrays.binarySearch(names, inputName);

        // Display result
        if (index >= 0) {
            System.out.println(inputName + " found at index " + index + ".");
        } else {
            System.out.println(inputName + " not found in the list.");
        }

        scanner.close();
    }
} 