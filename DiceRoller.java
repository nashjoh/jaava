package JAVA;
import java.util.Random;
public class DiceRoller {
	Random random;
	int number;
	/*Global variables: These are declared
	 *  outside of a method, usually at the class level. 
	 *  They are visible and accessible to all methods
	 *   within the class. For example, variables like 
	 *   random and number inside the DiceRoller class
	 *    are global to that class because they are declared
	 *     at the class level
	 */
	DiceRoller(){//DiceRoller: This is the name of the class from which you are creating an object.
		//The class itself is defined in the second part of the code.
		random = new Random();
		roll();
		}
	
void roll() {
	number = random.nextInt(6)+1;
	System.out.println(number);
}	

}
