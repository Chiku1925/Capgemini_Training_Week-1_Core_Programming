import java.util.*;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();

        // Calculating the area
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516; // 1 square inch = 6.4516 square cm
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;

        // Displaying the results
        System.out.println("The area of the triangle is " + areaInSqInches + " square inches and " + areaInSqCm + " square centimeters.");
        System.out.println("Your height in cm is " + heightInCm + ", in feet is " + heightInFeet + ", and in inches is " + height + ".");

       
    }
}
