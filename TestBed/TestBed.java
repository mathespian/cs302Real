/** Hello, Grant! This is TestBed, a program for playing around and trying out
 *  new concepts from class. Have fun! 
 */

// I'll start by importing Scanner in case I want to obtain user input later
import java.util.Scanner;
import java.util.Random;

// For now, this application echoes back user input in a question.
// I think that the whole chunk below is one "class" and...
public class TestBed {
	// That the chunk below THIS is one "method"
	
	/**
	 * 
	 * @param args UNUSED
	 */
	public static void main(String[] args) {
		// Variables	
		Scanner keyboard = new Scanner(System.in);
		Random dieRoll = new Random();
		int outcome;
		int rolls = 0;
		int threes = 0;
		
		while(rolls < 1000)
		{
			outcome = dieRoll.nextInt(6);
			++outcome;
			if (outcome == 3)
			{
				++threes;
			}
			++rolls;
		}
		System.out.println(threes);
		System.out.println(rolls);

		//Close keyboard Scanner to stop resource leak, whatever that means.
		keyboard.close();
	}
}
