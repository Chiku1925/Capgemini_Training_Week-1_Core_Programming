import java.util.*;
public class first{
    public static boolean compareStrings(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
              return false;  
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1= input.nextLine();
        String s2=input.nextLine();
        boolean comparedString=compareStrings(s1, s2);
        boolean equalcomparison=s1.equals(s2);
        if(comparedString==equalcomparison){
            System.out.println("Both methods results are same.");
        }
        else{
            System.out.println("Both methods results are not same");
        }


    }
}
