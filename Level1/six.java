import java.util.*;
public class six{
    public int SumOfNaturalNumber(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;

        }
        System.out.println("Sum of Natural Number is="+sum);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        six obj=new six();
        obj.SumOfNaturalNumber(num);



    }
}