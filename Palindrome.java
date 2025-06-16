package heiio;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int originalNumber=sc.nextInt();
		int number=originalNumber;
		int reversed=0;
		while(number!=0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		if(originalNumber==reversed) {
			System.out.println(originalNumber+" is a palindrome.");
		}else {
			System.out.println(originalNumber+" is  not a palindrome");			
		}
		sc.close();
		
	}

}
