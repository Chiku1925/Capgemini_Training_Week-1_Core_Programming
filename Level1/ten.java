
import java.util.*;
public class ten{
    public double calculateWindChill(double temperature, double windSpeed){
        double windchill=35.74+(0.6215*temperature)+ (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("The windchill="+windchill);
        return 0;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double temp=input.nextDouble();
        double ws=input.nextDouble();
        ten obj=new ten();
        obj.calculateWindChill(temp, ws);

    }
}