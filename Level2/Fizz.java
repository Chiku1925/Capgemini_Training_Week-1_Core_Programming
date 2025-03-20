import java.util.*;
public class Fizz{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num=input.nextInt();
	if(num<0){
		System.out.println("Enter Positive value");
	}
	else{ int i=num;
		while(i>=1){
			if(i%3==0){
				System.out.println("Fizz");}
			else if(i%5==0){
				System.out.println("Buzz");}
			else if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");}
			else{
				System.out.println(i);}
			i--;
		}
	}
	}
}
				
		
	