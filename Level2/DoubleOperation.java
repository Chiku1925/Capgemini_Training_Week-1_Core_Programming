import java.util.*;
public class DoubleOperation{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	double a=input.nextDouble();
	double b=input.nextDouble();
	double c=input.nextDouble();
	
	double d=a+b*c;
	double e=a*b+c;
	double f=c+a/b;
	double g=a%b+c;
	System.out.println("The results of Int Operations are " + d +", "+ e +", "+f+" and "+g);
}
}