import java.util.*;
public class CelsiusTemp{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	double farenheit=input.nextDouble();
	double CelsiusResult=((farenheit-32)*5)/9;
	System.out.println("The " + farenheit+" farenheit is " + CelsiusResult +" celsius");
	}
}
