package heiio;
import java.util.Scanner;
public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = findSquareRoot(n);
        System.out.println("Square root (integer part) of " + n + " is: " + result);
        
        scanner.close();
    }
    public static int findSquareRoot(int n) {
        if (n < 0) return -1; 
        if (n == 0 || n == 1) return n;

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}