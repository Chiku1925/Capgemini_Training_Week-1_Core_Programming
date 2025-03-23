import java.util.*;

public class seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        if(number<=0){
            System.out.println("Error");
            System.exit(0);
        }
        int []odd=new int[number/2+1];
        int []even=new int[number/2+1];
        int evenindex=0;
        int oddindex=0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[evenindex]=i;
                evenindex++;
            }
            else{
                odd[oddindex]=i;
                oddindex++;
            }
        }
        System.out.println("odd numbers");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]+ " ");

            
        }
         System.out.println("even numbers");
        for (int i = 0; i <even.length; i++) {
            System.out.println(even[i]+ " ");

            
        }

    }
}