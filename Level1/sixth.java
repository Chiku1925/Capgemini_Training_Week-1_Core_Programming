import java.util.*;

public class sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] height=new double[11];
        double mean;
        double sum=0.0;
        for (int i = 0; i < 11; i++) {
            height[i]=input.nextDouble();
            sum=sum+height[i];
        }
        mean=sum/11;
        System.out.println("Mean Height="+ mean);


    }
}