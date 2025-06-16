package heiio;
import java.util.TreeSet;
public class LibraryBooks {
    public static void main(String[] args) {
        TreeSet<Integer> bookIds = new TreeSet<>();
        bookIds.add(4007);
        bookIds.add(5898);
        bookIds.add(6009);
        bookIds.add(6579);
        bookIds.add(8761);
        System.out.println("First Book ID: " + bookIds.first());
        System.out.println("Last Book ID: " + bookIds.last());
        System.out.println("Book ID just higher than 4999: " + bookIds.higher(5898));
        System.out.println("Book ID just lower than 5005: " + bookIds.lower(6579));
    }
}