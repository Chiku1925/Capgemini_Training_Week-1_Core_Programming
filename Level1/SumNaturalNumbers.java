import java.util.*;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        
        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;
            
            // Compute sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations match. The sum is correct!");
            } else {
                System.out.println("There is an error in computation.");
            }
        }
    }
}
