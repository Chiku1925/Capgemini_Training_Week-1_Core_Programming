import java.util.*;
public class Sum{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	double total=0.0;
	double num;	
	System.out.println("Enter the number:");
	while(true){
	num=input.nextDouble();
	if(num<=0){
		break;}
	total+=num;
	}
	System.out.println("The sum of number is:"+ total);
	}
}