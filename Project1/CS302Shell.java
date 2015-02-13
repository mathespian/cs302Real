///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            CS302Shell
// Files:            CS302Shell.java
// Semester:         CS302 Spring 2015
//
// Author:           Grant Doty
// Email:            gdoty@wisc.edu
// CS Login:         doty
// Lecturer's Name:  Hobbes LeGault
// Lab Section:      334
//
///////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

/**
 * Provides basic math functionality to the user.
 *
 * <p>Bugs: None known
 *
 * @author Grant Doty
 */

public class CS302Shell {

	/**
	 * Program execution begins here, provides basic math functionality to user.
	 * 
	 * @param args UNUSED
	 */

	public static void main(String[] args) 
	{

		// Scanner connected to keyboard for reading user input
		Scanner scnr = new Scanner(System.in);

		// DISPLAY WELCOME MESSAGE AND HELP
		System.out.println("Welcome to CS302Shell! Enter help for a list of" + 
				"commands or exit to end.");

		// Variables
		String command; // first word typed by the user, i.e. add, decimal, etc.
		String decimalInput; // the input string after the decimal command
		double num1, num2; //used for commands other than help, exit, and decimal
		int int1, int2; // used for casting num1, num2 in rem and quo
		String answerString = "";
		double answerDouble; // 3 types of answers store text to display to user
		int answerInt;
		boolean running = true; // a sentinel boolean to control main loop

		// MAIN COMMAND-LINE LOOP (ends when user inputs 'exit')
		while(running)
		{

			// DISPLAY COMMAND PROMPT
			System.out.print("> ");

			// READ (SCAN) user input
			command = scnr.next();

			// DECIMAL command
			if (command.equalsIgnoreCase("decimal")) 
			{
				answerString = ""; // clear answerString
				decimalInput = scnr.nextLine(); //saves full line after 'decimal'
				decimalInput = decimalInput.trim(); // trims first spaces
				if (!(decimalInput.length() >= 1)) // if checks for null input
				{
					answerString = "Must include a character after decimal";
				}
				else
				{	//loop chops user input into chars and saves to answerString
					while (decimalInput.length() > 0)
					{
						answerString = answerString + ((int) decimalInput.charAt(0) + " ");
						decimalInput = decimalInput.substring(1);
					}
				}
				System.out.println(answerString);
			}
			// ADD command
			else if (command.equalsIgnoreCase("add")) 
			{
				if (scnr.hasNextDouble()) //checks 1st input for double
				{
					num1 = scnr.nextDouble();
					if(scnr.hasNextDouble()) //checks 2nd input for double
					{

						num2 = scnr.nextDouble();
						answerDouble = num1 + num2; //add
						System.out.println(answerDouble); //display to user
					}
					else
					{// prints 2nd error message
						answerString = scnr.next(); 
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{// prints 1st error message
					answerString = scnr.next(); 
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// SUB command, see ADD for comments
			else if (command.equalsIgnoreCase("sub")) 
			{
				if (scnr.hasNextDouble())
				{
					num1 = scnr.nextDouble();
					if(scnr.hasNextDouble())
					{

						num2 = scnr.nextDouble();
						answerDouble = num1 - num2; // subtract
						System.out.println(answerDouble);
					}
					else
					{
						answerString = scnr.next();
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{
					answerString = scnr.next();
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// MUL command see ADD for comments
			else if (command.equalsIgnoreCase("mul")) 
			{
				if (scnr.hasNextDouble())
				{
					num1 = scnr.nextDouble();
					if(scnr.hasNextDouble())
					{

						num2 = scnr.nextDouble();
						answerDouble = num1 * num2; // multiply
						System.out.println(answerDouble);
					}
					else
					{
						answerString = scnr.next();
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{
					answerString = scnr.next();
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// DIV command, see ADD for comments
			else if (command.equalsIgnoreCase("div")) 
			{
				if (scnr.hasNextDouble())
				{
					num1 = scnr.nextDouble();
					if(scnr.hasNextDouble())
					{

						num2 = scnr.nextDouble();
						answerDouble = num1 / num2; // divide
						System.out.println(answerDouble);
					}
					else
					{
						answerString = scnr.next();
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{
					answerString = scnr.next();
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// QUO command
			else if (command.equalsIgnoreCase("quo")) 
			{
				if (scnr.hasNextDouble()) //checks 1st input for double
				{//
					num1 = scnr.nextDouble();
					if (scnr.hasNextDouble()) //checks 2nd input for double
					{
						num2 = scnr.nextDouble();
						int1 = (int) num1; // cast num1, num2 to ints
						int2 = (int) num2;
						answerInt= int1 / int2; // divide
						System.out.println(answerInt); // display to user
					}
					else
					{// prints 2nd error message
						answerString = scnr.next();
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{// prints 1st error message
					answerString = scnr.next();
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// REM command, see QUO for comments
			else if (command.equalsIgnoreCase("rem")) 
			{
				if (scnr.hasNextDouble())
				{
					num1 = scnr.nextDouble();
					if(scnr.hasNextDouble())
					{

						num2 = scnr.nextDouble();
						int1 = (int) num1;
						int2 = (int) num2;
						answerInt = int1 % int2; // modulo
						System.out.println(answerInt);
					}
					else
					{
						answerString = scnr.next();
						System.out.println(answerString + " must be a number");
						scnr.nextLine();
					}
				}
				else
				{
					answerString = scnr.next();
					System.out.println(answerString + " must be a number");
					scnr.nextLine();
				}
			}
			// HELP command, prints helpful list of commands
			else if (command.equalsIgnoreCase("help")) 
			{
				answerString = "add i j   - return the sum of two integers         i+j"
					+ "\rsub i j   - return the difference between two integers  i-j"
					+ "\rmul i j   - return the product of two integers     i*j"
					+ "\rdiv i j   - return the division of  i/j (floating point result)"
					+ "\rquo i j   - return the quotient of  i/j (integer division)"
					+ "\rrem i j   - return the remainder of i/j (modulus)"
					+ "\rdecimal a - return decimal value of (a), a is printable character"
					+ "\rhelp      - display this command listing"
					+ "\rexit      - exit application";
				System.out.println(answerString);
			}
			// EXIT command
			else if (command.equalsIgnoreCase("exit")) 
			{
				answerString = "Good-Bye";
				System.out.println(answerString);
				running = false; // ends loop
			}
			// UNRECOGNIZED command
			else 
			{// if user inputs unexpected command print with "Command not found"
				answerString = command + ": Command not found";
				System.out.println(answerString);
				scnr.nextLine();
			}
		}  

		// Close the scanner to avoid resource leak
		scnr.close();

	} // end of main method

} // end of CS302Shell class