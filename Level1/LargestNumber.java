import java.util.*;
public class LargestNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("Number1 is largest");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Number2 is largest");
		}
		else{
			System.out.println("Number3 is largest");
		}
	}	
}