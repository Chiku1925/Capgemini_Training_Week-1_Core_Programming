import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = input.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                years[i] = input.nextDouble();
                if (salaries[i] > 0 && years[i] >= 0) break;
                i--;
            }
        }
    }
}