import java.util.*;
public class SmallestOfThree{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int number1=input.nextInt();
	int number2=input.nextInt();
	int number3=input.nextInt();
	if(number1<=number2 && number1<=number3){
		System.out.println("Yes");}
	else{
		System.out.println("No");}
	}
}
	