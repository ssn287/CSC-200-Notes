/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 2/26/2015
 * Purpose: Week 7 Class Exercise 2 (Unix Command, Iteration, and Gitbash)
 */

import java.util.Scanner;

public class W7CE2 {
	public static void main(String [] args) {
		Scanner keyboard;
		String user, pass, userIn, passIn;
		int i;
		keyboard = new Scanner(System.in);
		user = "ssn287";
		pass = "booyah";
		userIn = "";
		passIn = "";
		System.out.println("While loop started ->");
		while(!userIn.equals(user) || !passIn.equals(pass)) {
			System.out.println("Enter your username:");
			userIn = keyboard.next();
			System.out.println("Enter your password:");
			passIn = keyboard.next();
		}
		System.out.println("Welcome " + userIn + "!");
		System.out.println("<- While loop terminated");
		System.out.println("For loop started ->");
		for(i = 0; i < 3; i++) {
			System.out.println("Enter your username:");
			userIn = keyboard.next();
			System.out.println("Enter your password:");
			passIn = keyboard.next();
			if(userIn.equals(user) && passIn.equals(pass)) {
				System.out.println("Welcome " + userIn + "!");
				i += 3;
			}
			else if(i == 2) {
				System.out.println("Please contact your administrator to unlock your account!");
			}
		}
		System.out.println("<- For loop terminated");
		keyboard.close();
	}
}