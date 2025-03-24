import java.util.*;
class first{
    public  int SimpleInterest(int principle,int rate,int time){
        int SI=(principle*rate*time)/100;
        return SI;


    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int principle=input.nextInt();
        int rate=input.nextInt();
        int time=input.nextInt();
        first obj=new first();
        int SI=obj.SimpleInterest(principle,rate,time);
        System.out.println("Simple Interest is "+ SI);
    }

}
