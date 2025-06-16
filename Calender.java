package javaprojets;
import java.util.Scanner;
import java.util.*;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "Monday":
			System.out.println("Lets learn java");
			break;
		case "Tuesday":
			System.out.println("Lets learn python");
			break;
		case "Wednesday":
			System.out.println("Lets learn Angular js");
			break;
		case "Thursday":
			System.out.println("Lets learn Rubby");
			break;
		case "Friday":
			System.out.println("Lets learn c ");
			break;
		case "saturday":
			System.out.println("Lets learn c++ ");
			break;
		case "sunday":
			System.out.println("Lets learn java with Dsa");
			break;
		default:
            System.out.println("Invalid day entered.");
		}
		sc.close();
	}

}
