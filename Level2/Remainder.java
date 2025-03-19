import java.util.*;
public class Remainder{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
 	int num1=input.nextInt();
	int num2=input.nextInt();
	int remainder=num1%num2;
	int quotient=num1/num2;
	System.out.println("The Quotient is " + quotient +" and Remainder is " + remainder +" of two number " + num1 +" and " +num2);
	}
}