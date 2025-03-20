import java.util.*;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Check if input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Compute factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Display result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
}
