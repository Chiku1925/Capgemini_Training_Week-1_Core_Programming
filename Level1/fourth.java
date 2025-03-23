import java.util.*;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values=new double[10];
        double sum=0.0;
        for (int i = 0; i < 10; i++) {
            values[i]=input.nextDouble();
            if(values[i]<=0){
                break;
            }
            
        }
        for (int i = 0; i <values.length; i++) {
            sum=sum+values[i];

            
        }
        System.out.println("Sum: " + sum);
    }
}

