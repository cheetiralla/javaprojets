package heiio;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int originalNumber=sc.nextInt();
		int reversed=0;
		for(int number=originalNumber;number!=0;number/=10) {
			int digit=number%10;
			reversed=reversed*10+digit;
		}
		System.out.println("reversed number:"+reversed);
		sc.close();
	}

}
