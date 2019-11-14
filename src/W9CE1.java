/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 3/19/2015
 * Purpose: Switch Case
 */

import java.util.Scanner;

public class W9CE1 {
	public static void main(String [] args) {
		String role;
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.println("Enter your role from the following choices:\n   Administrator\n   Faculty\n   Staff\n   Student\n   Guest");
		role = keyboard.next();
		switch(role) {
		case "Administrator":
			System.out.println("Welcome <" + role + ">");
			break;
		case "Faculty":
			System.out.println("Welcome <" + role + ">");
			break;
		case "Staff":
			System.out.println("Welcome <" + role + ">");
			break;
		case "Student":
			System.out.println("Welcome <" + role + ">");
			break;
		case "Guest":
			System.out.println("Welcome <" + role + ">");
			break;
		}
	}
}