import java.util.*;
public class NaturalNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=input.nextInt();
		if(num>0){
			int sum=(num*(num+1))/2;
			System.out.println("The sum of " + num +" natural number is " + sum);
		}
		
		else{
			System.out.println("The number " + num +" is not a natural number");

		}
		
	}	
}			