import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }
}
