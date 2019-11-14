/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 2/19/2015
 * Purpose: Git Tutorial
 */

import java.util.Scanner;

public class W6CE1 {
	public static void main(String [] args) {
		Scanner keyboard;
		double width, height, perimeter, area, rPerimeter, rArea;
		keyboard = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle:");
		width = keyboard.nextDouble();
		System.out.println("Enter the height of the rectangle:");
		height = keyboard.nextDouble();
		perimeter = (2 * width) + (2 * height);
		area = width * height;
		rPerimeter = ((int)((perimeter + 0.005) * 100.0)) / 100.0;
		rArea = ((int)((area + 0.005) * 100.0)) / 100.0;
		System.out.println("The perimeter of the rectangle is: " + rPerimeter +
			           ".\nThe area of the rectangle is: " + rArea +
				   ".\n(Perimeter & area are rounded to 2 decimal places)");
		keyboard.close();
	}
}