package javaprojets;

import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a day of the week: ");
        String day = sc.nextLine().toLowerCase();

        switch(day) {
            case "monday":
                System.out.println("Let's learn Java");
                break;
            case "tuesday":
                System.out.println("Let's learn Python");
                break;
            case "wednesday":
                System.out.println("Let's learn AngularJS");
                break;
            case "thursday":
                System.out.println("Let's learn Ruby");
                break;
            case "friday":
                System.out.println("Let's learn C");
                break;
            case "saturday":
                System.out.println("Let's learn C++");
                break;
            case "sunday":
                System.out.println("Let's learn Java with DSA");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        sc.close();
    }
}
