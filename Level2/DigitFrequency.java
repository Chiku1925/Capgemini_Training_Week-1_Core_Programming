import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.next();
        
        int[] frequency = new int[10];
        
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                frequency[digit - '0']++;
            }
        }
        
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " | " + frequency[i]);
            }
        }
    }
}