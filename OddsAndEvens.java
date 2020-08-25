import java.util.*;
public class OddsAndEvens {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Let's play a game called \"Odds And Evens\" ");
	System.out.print("What is your name? ");
	String name = input.nextLine();
	System.out.print("Hi " + name + " , which do you choose? (O)dds or (E)vens? ");
	String choose = input.nextLine();
	if(choose.equals("O") || choose.equals("o") || choose.equals("Odd")|| choose.equals("odd")) {
		System.out.println(name+" has picked odds! The computer will be evens.");
	}
	else {
		System.out.println(name+" has picked evens! The computer will be odds.");
	}
	System.out.println("--------------------------------");
	
	
	System.out.print("How many “fingers” do you put out? ");
	int userFinger = input.nextInt();
	Random rand = new Random();
	int computer = rand.nextInt(6);
	System.out.println("The computer plays "+computer+ " \"fingers\".");
	System.out.println("--------------------------------");

	
	int sum = userFinger+computer;
	System.out.println(userFinger+"+"+computer+" = "+sum);
	if(sum%2==0) {
		System.out.println(sum+" is ... even!");}
	else {
		System.out.println(sum+" is ... odd!");}
	System.out.println("--------------------------------");

	
	if((sum%2==0 && choose.equals("E")) || (sum%2!=0 && choose.equals("O")) ) {
			System.out.println("This means "+name+" wins!  :)"); }
	
	else {
		System.out.println("This means computer wins!  :)"); }
	
	System.out.println("--------------------------------");	
	}
	
}

