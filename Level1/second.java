import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > 0) System.out.println(numbers[i] % 2 == 0 ? "Even" : "Odd");
            else if (numbers[i] < 0) System.out.println("Negative");
            else System.out.println("Zero");
        }
        if (numbers[0] > numbers[4]) System.out.println("First element is greater than last");
        else if (numbers[0] < numbers[4]) System.out.println("First element is less than last");
        else System.out.println("First and last elements are equal");
    }
}