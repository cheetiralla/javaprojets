package heiio;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeTask {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentMarks = new TreeMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search marks: ");
        String name = scanner.nextLine();

        if (studentMarks.containsKey(name)) {
            System.out.println(name + "'s marks: " + studentMarks.get(name));
        } else {
            System.out.println(name + " not found in records.");
        }
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Alice", "9876543210");
        phoneBook.put("Bob", "9123456780");
        phoneBook.put("Charlie", "9012345678");
        System.out.println("\nPhone Book:");
        for (String key : phoneBook.keySet()) {
            System.out.println(key + ": " + phoneBook.get(key));
        }

        scanner.close();
    }
}
