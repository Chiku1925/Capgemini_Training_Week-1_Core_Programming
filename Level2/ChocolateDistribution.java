import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for chocolates and children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Checking for valid input (no division by zero)
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calculate chocolates per child and remaining chocolates
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            
            // Display results
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                               " and the number of remaining chocolates are " + remainingChocolates + ".");
        }
        
        
    }
}
