import java.util.Scanner;
public class Queten{
    public static void main(String[] args) {
    double heightcm;
    Scanner input= new Scanner(System.in);
    heightcm=input.nextDouble();
    double heightinch= heightcm/2.54;
    double heightfoot= heightinch/12;
    System.out.println("Your Height in cm is " + heightcm +" while in feet is " + heightfoot +" and inches is " + heightinch);
}
}
    