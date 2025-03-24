import java.util.*;
public class second{
    public static String subcharmethod(String str,int start,int end){
        String ans="";
        for(int i=start;i<end;i++){
            ans=ans+str.charAt(i);


        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int start=input.nextInt();
        int end=input.nextInt();
        String obj1=subcharmethod(str, start, end);
        String obj2=str.substring(start,end);
        boolean res=obj1.equals(obj2);
        System.out.println("Substring using charAt:"+obj1);
        System.out.println("Substring using substring:"+obj2);
        System.out.println("The result of both are same? "+res);

    }
}