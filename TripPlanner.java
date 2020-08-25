import java.util.*;
public class TripPlanner {

	public static void main(String[] args) {
	
	 greeting();
	 timeandbudget();
	 timedifference();
	 countryarea();
	}
	
	public static void greeting() {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome To Vacation Planner!");
	System.out.print("What is your name ? ");
	String name = input.nextLine();
	System.out.print("Nice to meet you "+ name + ", where are you travelling to ? ");
	String place = input.nextLine();
	System.out.println("Great ! " + place + " sounds like a great trip.");
	System.out.println("***********");
	}
	
	public static void timeandbudget() {
		
	Scanner input = new Scanner(System.in);
	System.out.print("How many days are you going to spend travelling ? ");
	int days = input.nextInt();
	System.out.print("How much money, in USD, are you planning to spend in this trip ? ");
	double money = input.nextDouble();
	System.out.print("What is the three letter currency symbol for your travel destination ? ");
	String currency = input.next();
	System.out.print("How many " +currency+ " are there in 1 USD ? " );
	double currencyInUsd = input.nextDouble();
	int hours = days*24;
	int minutes = hours*60;
	int seconds = minutes*60;
	System.out.println("If you are travelling for "+days + " days, that is same as "+hours+ " hours or "+minutes+" minutes or " +seconds+ " seconds.");
	double perDaySpend = (money/days);
	System.out.print("If you're going to spend $" +money+ " USD that means per day you can spend up to $"+perDaySpend+" USD.");
	double perDayMoney = money*currencyInUsd;
	double perDayMoneySpend = perDayMoney/days;
	System.out.println("Your total budget in "+currency+" is "+perDayMoney+" "+currency+" , which per day is "+perDayMoneySpend+" "+currency+".");
	System.out.println("***********");
	
	}
	
	public static void timedifference() {
		
	Scanner input = new Scanner(System.in);
	System.out.print("What is the time difference, in hours, between your home and destination? ");
	int td = input.nextInt();
    int timeAtMidnight = (td + 24) % 24;
    int timeAtNoon = td + 12;
    System.out.println("That means when it is midnight at your home it will be "+timeAtMidnight+":00 at your travel destination and when it is noon at home it will be "+timeAtNoon+":00.");
    System.out.println("***********");	
	}
	
	public static void countryarea( ) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("What is the square area of your destination country in sq. km ? ");
	double area = input.nextDouble();
	double areaInMiles = area / 2.59;
	System.out.println("In sq. miles that is "+areaInMiles+".");
	System.out.println("***********");	
	}

}
