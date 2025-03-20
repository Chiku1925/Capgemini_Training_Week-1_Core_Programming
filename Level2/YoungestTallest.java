import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = sc.nextInt();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        int tallestHeight = Math.max(height1, Math.max(height2, height3));

        if (youngestAge == age1) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == age2) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        if (tallestHeight == height1) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == height2) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
