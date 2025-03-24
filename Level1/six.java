import java.util.*;
public class six{
    static void generateException(String str){
        System.out.println("Generating Exception");
        String sub=str.substring(5,2);
        System.out.println("Substring:"+sub);

    }
    static void HandleException(String str){
        try {
        System.out.println("Handling Exception");
        String sub=str.substring(5,2);
        System.out.println("Substring:"+sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Illegal Argument Exception"+e);
        }
        catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s1=input.nextLine();
        try {
            generateException(s1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in main: " + e);
        }
        HandleException(s1);
        
    }
}