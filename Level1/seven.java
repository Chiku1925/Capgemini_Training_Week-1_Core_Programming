
import java.util.*;
public class seven{
    public  int findSmallestAndLargest(int number1, int number2, int number3){
        
        if(number1>2&&number1>number3){
            System.out.println("Number1 is Largest");
        }
        else if(number2>number1&&number2>number3){
            System.out.println("Number2 is Largest");

        }
        else{
            System.out.println("Number3 is Largest");
        }
        if(number1<number2&&number1<number3){
            System.out.println("Number1 is Smallest");
        }
        else if(number2<number1&&number2<number3){
            System.out.println("Number2 is Smallest");
        }
        else{
            System.out.println("Number3 is Smallest");
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        seven obj=new seven();
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        obj.findSmallestAndLargest(n1,n2,n3);


    }
}