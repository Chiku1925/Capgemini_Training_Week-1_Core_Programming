import java.util.*;

public class eight {
    static void generateException(String[] names, int index) {
        System.out.println("Generating exception...");
        System.out.println("Accessing index: " + index);
        System.out.println("Name at index: " + names[index]); 
    }
    static void handleException(String[] names, int index) {
        try {
            System.out.println("Handling exception...");
            System.out.println("Accessing index: " + index);
            System.out.println("Name at index: " + names[index]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};
        System.out.print("Enter an index to access (0 to " + (names.length - 1) + "): ");
        int index = input.nextInt();
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e);
        }

        handleException(names, index);

    }
}
