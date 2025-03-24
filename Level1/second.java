import java.util.*;
public class second{
    public int HandShake(int number){
        int max_number=(number*(number-1))/2;
        return max_number;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        second obj=new second();
        int max_number=obj.HandShake(number);
        System.out.println("Maximum Number of Handshakes="+max_number);

    }
}