import java.util.*;
public class four{
    public int NumberCheck(int number){
        if(number==0){
            System.out.println("0");

        }
        else if(number>0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        four obj=new four();
        obj.NumberCheck(number);


    }
}