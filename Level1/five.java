import java.util.*;
public class five{
    public boolean SpringSeason(int month,int date){
        boolean is_spring=(month==3&& date>=20&&date<=31)||
                            (month==4&& date>=1&&date<=30)||
                            (month==5&&date>=1&&date<=31)||
                            (month==6&&date>=1&&date<=20);
        if(is_spring){
            System.out.println("This is Spring Season");
        } 
        else{
            System.out.println("This is not a Spring Season");
        }                   
    return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month=input.nextInt();
        int date=input.nextInt();
        five obj=new five();
        obj.SpringSeason(month, date);

    }
}