import java.util.*;

public class Calculator {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
	System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        String division = (number2 != 0) ? String.valueOf(number1 / number2) : "Undefined (division by zero)";
        System.out.println("The addition, subtraction, multiplication, and division value of two numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division + ".");
        
    }
}