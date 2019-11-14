/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 2/24/2015
 * Purpose: Week 7 Class Exercise 1 (Flowchart & Pseudocode)
 */
import java.util.Scanner;

public class W7CE1 {
	public static void main(String [] args) {
		//declaring variables
		Scanner keyboard;
		String user, pass, userIn, passIn;
		//defining variables
		user = "ssn287";
		pass = "booyah";
		keyboard = new Scanner(System.in);
		//prompting user for variables
		System.out.println("Enter Username:");
		userIn = keyboard.next();
		System.out.println("Enter Password:");
		passIn = keyboard.next();
		//testing variables and displaying message
		if(user.equals(userIn) && pass.equals(passIn)) {
			System.out.println("Welcome " + userIn + "!");
		}
		else {
			System.out.println("Wrong Username or Password!");
		}
		//closing Scanner class
		keyboard.close();
	}
}