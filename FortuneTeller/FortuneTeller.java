///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            (program's title)
// Files:            (list of source files)
// Semester:         Fall 2014
//
// Author:           (your name and email address)
// CS Login:         (your login name)
// Lecturer's Name:  (name of your lecturer)
// Lab Section:      (your lab section number)
//
//                   PAIR PROGRAMMERS COMPLETE THIS SECTION
// Pair Partner:     (name of your pair programming partner and their email address)
// CS Login:         (partner's login name)
// Lecturer's Name:  (name of your partner's lecturer)
// Lab Section:      (your partner's lab section number)
//
//                   STUDENTS WHO GET HELP FROM ANYONE OTHER THAN THEIR PARTNER
// Credits:          (list anyone who helped you write your program)
//////////////////////////// 80 columns wide //////////////////////////////////
/** Application that displays a fortune to the user. */

public class FortuneTeller {
	
	/** Program execution begins here.
	 * @param args UNUSED
	 */
	public static void main(String[] args) {
		FortuneGenerator fortuneGen = new FortuneGenerator();
		String myFortune = fortuneGen.getFortune();
		Fortune.displayFortune(myFortune);
	}

}
