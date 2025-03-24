import java.util.*;
public class third{
    public int TrianglePark(int side1, int side2, int side3){
        int perimeter=side1+side2+side3;
        int number_rounds=(int)Math.ceil(5000/perimeter);
        return number_rounds;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1=input.nextInt();
        int s2=input.nextInt();
        int s3=input.nextInt();
        third obj=new third();
        int number_rounds=obj.TrianglePark(s1,s2,s3);
        System.out.println("Number of rounds="+number_rounds);
        
        

    }
}
