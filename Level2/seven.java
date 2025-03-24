import java.util.*;

public class seven {
    
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        seven checker = new seven();
        
        int[] studentAges = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
            
            boolean canVote = checker.canStudentVote(studentAges[i]);
            
            if (studentAges[i] < 0) {
                System.out.println("Invalid age. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student is eligible to vote.");
            } else {
                System.out.println("Student is not eligible to vote.");
            }
        }
        
    }
}
