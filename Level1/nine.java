import java.util.*;
public class nine{
    public  int findRemainderAndQuotient(int N, int M){
    int EachChild=N/M;
    int rem=N%M;
    System.out.println("Each Children gets "+ EachChild+" Chocolates");
    System.out.println("Remaining Chocolates="+rem);
    return 0;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nine obj= new nine();
        int number_of_chocolates=input.nextInt();
        int number_of_childrens=input.nextInt();
        obj.findRemainderAndQuotient(number_of_chocolates,number_of_childrens);
        
    }
}