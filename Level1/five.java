import java.util.*;
public class five{
    static void generateException(String str){
        System.out.println("Generating Exception");
        System.out.println(str.charAt(str.length()));
    }
    static void HandleException(String str){
        try {
            System.out.println("Handling Exception");
            System.out.println(str.charAt(str.length()));
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught:"+e);
        }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
           try {
            generateException(s1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e);
        }
        HandleException(s1);

    }
}