import java.util.*;

public class ten {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] bmiData = new double[10][3]; 
        String[] bmiStatus = new String[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = input.nextDouble();

            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }

        System.out.println("\nPerson Data and BMI Results:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
        }

        input.close();
    }
}
