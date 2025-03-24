import java.util.Scanner;

public class seven {
    static void generateException(String text) {
        System.out.println("Generating exception...");
        int number = Integer.parseInt(text); 
        System.out.println("Converted Number: " + number);
    }
    static void handleException(String text) {
        try {
            System.out.println("Handling exception...");
            int number = Integer.parseInt(text); 
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String s1 = input.nextLine();
        try {
            generateException(s1);
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main: " + e);
        }
        handleException(s1);
    }
}
