import java.util.*;
public class SwapNumber{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("The swapped numbers are " + a +" and " + b);
}
}