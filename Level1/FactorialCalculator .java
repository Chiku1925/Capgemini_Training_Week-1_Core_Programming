import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Check if input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Compute factorial using while loop
            long factorial = 1;
            int i = n;
            while (i > 0) {
                factorial *= i;
                i--;
            }
            
            // Display result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
}
