import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Check eligibility for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }
        
        scanner.close();
    }
}