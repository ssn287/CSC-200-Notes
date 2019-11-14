/**
 * CalculatorDriver class is used to test the methods of the Calculator class.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/14/2015
 * Purpose: Week 13 Class Exercise 1 (Static Method, Overload Method, Array)
 */

public class CalculatorDriver {
	//main method
	public static void main(String [] args) {
		//instantiating the int and double arrays
		int [] intNum = {1, 3, 6, 10, 15};
		double [] doubleNum = {1.1, 3.3, 6.6, 11.0, 16.5};
		//testing each method from the Calculator class
		System.out.println("Sum of Integer Array: " + Calculator.sum(intNum));
		System.out.println("Sum of Double Array: " + Calculator.sum(doubleNum));
		System.out.println("Average of Integer Array: " + Calculator.average(intNum));
		System.out.println("Average of Double Array: " + Calculator.average(doubleNum));
		System.out.println("Product of Integer Array: " + Calculator.product(intNum));
		System.out.println("Product of Double Array: " + Calculator.product(doubleNum));
		System.out.println("Factorials of Integer Array:");
		Calculator.factorial(intNum);
	}
}