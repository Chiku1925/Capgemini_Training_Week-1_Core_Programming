import java.util.*;
public class TriangularRun{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter side1:");
	double side1=input.nextDouble();
	System.out.print("Enter side2:");
	double side2=input.nextDouble();
	System.out.print("Enter side3:");
	double side3=input.nextDouble();
	double number_of_round=(side1+side2+side3)/5000;
	int rounds=(int)Math.ceil(number_of_round);
	
	System.out.println("The total number of rounds the athlete will run is " + rounds +"  to complete 5 km");
	}
}

	