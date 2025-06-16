package heiio;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchName {

	public static void main(String[] args) {
		String names[] = {"loka","suchi","bharath","priya","kiran"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a the name to search:");
		String searchName=sc.nextLine().toLowerCase();
		Arrays.sort(names);
		int index=Arrays.binarySearch(names, searchName);
		if(index>=0) {
			System.out.println(searchName+"found at index "+index+".");
		}
		else {
			System.out.println(searchName+"not found in the list");
		}
		sc.close();

	}

}