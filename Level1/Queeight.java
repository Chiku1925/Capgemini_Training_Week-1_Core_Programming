import java.util.Scanner;
public class Queeight {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        double mile=1.6*km;
        System.out.println("The total miles is " + mile +" mile  for the given " + km +" km");
}
}
       