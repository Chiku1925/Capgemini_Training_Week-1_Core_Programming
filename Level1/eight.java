import java.util.*;
public class eight{
    public int findRemainderAndQuotient(int number1, int number2){
        int rem=number1%number2;
        int quo=number1/number2;
        System.out.println("The Remainder ="+rem);
        System.out.println("The Quoteint ="+ quo);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        eight obj=new eight();
        int n1=input.nextInt();
        int n2=input.nextInt();
        obj.findRemainderAndQuotient(n1, n2);

    }
}