package cityPackageCYOA;
import java.util.*;
public class Script {
	
	// name variable
	private static String name = "";
	
	// prints out text one letter at a time for dramatic effect
	public static void printOut(String text) throws InterruptedException{
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.substring(i, i + 1));
			Thread.sleep(10);
		}
		System.out.println();
	}
	
	// starting scenario
	public static String scenario(Scanner scan) throws InterruptedException{
		String choice;
		
		// get the users name
		String getName = "What is your name?: ";
		if(name.equals("")) {
			printOut(getName);
			name = scan.nextLine();
		}
		String prompt = "Hello " + name + ", you find yourself in an abandoned city and want to leave. What do you do? \n\nDo you go to the police station to try and find help(police)? \nRun down the road to get to the edge of the city(run)? \nGet in a car and get it running(car)? \nOr do you stay where you are like a coward(coward)? \nTo choose, type the word in the ().";

		
		// start prompt using name
		printOut(prompt);
		System.out.println();
		choice = scan.next();
		

		
		return choice;
	}
	
	// outcome one (move on)
	public static String outcomePolice(Scanner scan) throws InterruptedException{
		String choice;
		String result = "On your way to the station you happen across a homeless man begging you for money. \nYou tell him you don’t have any despite the crisp $10 bill in your wallet. He forces you into making small talk with him and you suffer the worst fate of all. \nYou sit for hours listening to his tragic life while all you can think of is the tragic time that the milk in your fridge expired.";
		String time = "----------THE PASSAGE OF MUCH TIME----------";
		String prompt = "Finally, after years of listening to the homeless man go on about his life, he dies and you are set free. \nIn your old age you forgot what you were doing and need to make another decision on how to leave the city. \n\nDo you wonder the city and look for a way out(wonder)? \nEat the food out of your backpack(eat)? \nWake up(wake)? \nOr do you stay where you are like a coward(coward)????";
		
		// start the next prompt
		printOut(result);
		printOut(time);
		printOut(prompt);
		choice =  scan.next();
		
		return choice;
	}
	
	// outcome two (death)
	public static String outcomeRun() throws InterruptedException{
		return "As you run down the road you become distracted by the birds flying overhead when suddenly a SUV runs you over from the right. :( big sad.\n---YOU DIED---";
	}
	
	// outcome three (death)
	public static String outcomeCar() throws InterruptedException{
		return "You break open the window of a 2001 Subaru Forester and begin work on hot wiring the car. The engine purrs to life but in your excitement you fail to realize you are in a Subaru. \nThe car suddenly explodes and your time on Earth is over. Don’t be this guy, don’t drive a Subaru.\n---YOU DIED---";
	}
	
	// outcome four (death)
	public static String outcomeCowardOne() throws InterruptedException{
		return "You chose wrong. Cowards never win. You are struck by lightning (don’t be a coward).\n---YOU DIED---";
	}
	
	// outcome five (death)
	public static String outcomeWonder () throws InterruptedException{
		return "Wondering the city you round corner after corner looking for any sign of life. \nAs you turn onto 4th street you notice a group of people at the end of the road. You yell for joy as you run towards them. \nOddly they are also running towards you. Once you reach each other they say in unison, \n“Hello " + name + ", We are the cult of the 4th street and God has blessed us with a fresh sacrifice. We will feast tonight. Thank thee.”\n---YOU DIED---";
	}
	
	// outcome six (death)
	public static String outcomeEat() throws InterruptedException{
		return "You reach into your backpack and retrieve your favorite snack. A Twinkie. \nYou gobble it down like you have never eaten before. Suddenly you feel very sick and fall over. \nYou sucumb to the fast acting release of death(It has been so long listening to the homeless man that even the Twinkie went bad).\n---YOU DIED---";
	}
	
	// outcome seven (live)
	public static String outcomeWake() throws InterruptedException{
		return "Congratulations, you successfully wake up and survive. You knew this was the right path because every good story ends with the main character realizing that it was just a dream.\n---YOU SURVIVED---";
	}
	
	// outcome eight (death)
	public static String outcomeCowardTwo() throws InterruptedException{
		return "Why would you do that. You have come so far. Some people never learn that the cowards way is never right. You are struck by lightning (don’t be a coward).\n---YOU DIED---";
	}
}
