import java.util.*;
public class VotingAge{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	int age=input.nextInt();
	if(age>18){
		System.out.println("The person's age is " + age +" can vote");
	}
	else{
		System.out.println("The person's age is " + age +" cannot vote");
	}
}
}