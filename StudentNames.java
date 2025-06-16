package heiio;
import java.util.TreeSet;

public class StudentNames {
    public static void main(String[] args) {
        // Create a TreeSet to store student names alphabetically
        TreeSet<String> studentNames = new TreeSet<>();

        // Add student names
        studentNames.add("Alice");
        studentNames.add("Charlie");
        studentNames.add("Bob");
        studentNames.add("David");
        studentNames.add("Alice");  // duplicate, won't be added

        // Display student names in alphabetical order
        System.out.println("Student names in alphabetical order:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
