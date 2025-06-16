package javaprojets;

import java.util.Scanner;

public class Rain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it raining? (yes/no): ");
        String input = scanner.nextLine();

        boolean isRaining = input.equals("yes");

        if (isRaining) {
            System.out.println("Take an umbrella");
        } else {
            System.out.println("No need of umbrella");
        }

        scanner.close();
    }
}
