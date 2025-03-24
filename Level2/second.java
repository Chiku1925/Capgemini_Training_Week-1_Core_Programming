import java.util.*;

public class second {
    
    static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0). Exiting...");
            return;
        }
        
        int sumRec = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both results match: " + (sumRec == sumFormula));
        
        
    }
}
