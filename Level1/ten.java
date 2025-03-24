import java.util.*;
public class ten{
    static String toLowerCase(String str){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                res.append((char)(ch+32));

            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
    static boolean compareStrings(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        String tolower=toLowerCase(s1);
        String buildinconversion=s1.toLowerCase();
        boolean b1=compareStrings(tolower, buildinconversion);
        System.out.println("Lowercase using charAt Method: "+tolower);
        System.out.println("Lowercase using built in method: "+buildinconversion);
        System.out.println("Are both results are same?"+b1);



    }
}