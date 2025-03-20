import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A - Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: B - Very Good");
        } else if (percentage >= 70) {
            System.out.println("Grade: C - Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: D - Fair");
        } else {
            System.out.println("Grade: F - Fail");
        }
    }
}
