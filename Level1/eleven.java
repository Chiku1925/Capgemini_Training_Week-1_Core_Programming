import java.util.*;
public class eleven{
    public double calculateTrigonometricFunctions(double angle){
        double radian=(Math.PI/180)*angle;
        System.out.println("Sine="+Math.sin(radian));
        System.out.println("cosine="+Math.cos(radian));
        System.out.println("Tangent="+Math.tan(radian));
        return 0;

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        eleven obj=new eleven();
        double angle=input.nextDouble();
        obj.calculateTrigonometricFunctions(angle);

    }
}