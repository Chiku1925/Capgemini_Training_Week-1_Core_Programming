import java.util.*;
public class FizzBuzz{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num=input.nextInt();
	if(num<0){
		System.out.println("Enter Positive value");
	}
	else{
		for(int i=num;i>=1;i--){
			if(i%3==0){
				System.out.println("Fizz");}
			else if(i%5==0){
				System.out.println("Buzz");}
			else if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");}
			else{
				System.out.println(i);}
		}
	}
	}
}
				
		
	