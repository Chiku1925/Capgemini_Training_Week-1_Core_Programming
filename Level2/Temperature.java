import java.util.*;
public class Temperature{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	double celcius=input.nextDouble();
	double farenheitResult=((celcius*9)/5)+32;
	System.out.println("The " + celcius+" celcius is " + farenheitResult +" fahrenheit");
	}
}