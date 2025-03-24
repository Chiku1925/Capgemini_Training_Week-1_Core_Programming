import java.util.*;
public class third{
    public static char[] char_arr(String str){
        char[] c=new char[str.length()];
        for(int i=0;i<str.length();i++){
            c[i]=str.charAt(i);

        }
        return c;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char[]obj1=char_arr(str);
        char[]obj2=str.toCharArray();
        boolean com=Arrays.equals(obj1,obj2);
        System.out.println("Character Array without using tocharArray: "+ Arrays.toString(obj1));
        System.out.println("Character Array with using tocharArray: "+ Arrays.toString(obj2));
        System.out.println("Comparison: "+com);


    }

}