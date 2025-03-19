import java.util.Scanner;
public class Quenine{
    public static void main(String[] args) {
        int fee, discountPercent;
        Scanner input=new Scanner(System.in);
        fee=input.nextInt();
        discountPercent=input.nextInt();
        
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
