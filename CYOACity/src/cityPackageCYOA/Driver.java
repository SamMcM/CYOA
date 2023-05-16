package cityPackageCYOA;
import java.util.*;
public class Driver {

	public static void main(String[] args) throws InterruptedException{
		// make variables
		Scanner scan = new Scanner(System.in);
		String x = "y";
		
		// loop until user says otherwise
		while(x.equals("y")) {
			String choiceOne;
			String choiceTwo = "";
			choiceOne = Script.scenario(scan);
			
			// first scenario if-statement
			if(choiceOne.equals("police")) {
				choiceTwo = Script.outcomePolice(scan);
			} else if(choiceOne.equals("run")) {
				Script.printOut(Script.outcomeRun());
			} else if(choiceOne.equals("car")) {
				Script.printOut(Script.outcomeCar());
			} else if(choiceOne.equals("coward")) {
				Script.printOut(Script.outcomeCowardOne());
			}
			
			// second scenario if-statement
			if(choiceTwo.equals("wonder")) {
				Script.printOut(Script.outcomeWonder());
			} else if(choiceTwo.equals("eat")) {
				Script.printOut(Script.outcomeEat());
			} else if(choiceTwo.equals("wake")) {
				Script.printOut(Script.outcomeWake());
			} else if(choiceTwo.equals("coward")) {
				Script.printOut(Script.outcomeCowardTwo());
			} else {
				Script.printOut("You can't even follow simple instructions. As a consequence, you fall over and die\n---YOU DIED---");
			}
			
			// restart loop?
			Script.printOut("Do you want to play again?(y or n)");
			System.out.println("--------------------------------------------------------------------------");
			x = scan.next();
		}
		
		Script.printOut("---THANKS FOR PLAYING---");
	}

}
