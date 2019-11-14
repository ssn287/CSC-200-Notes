/**
 * Calculator class is used to find the sum, average, product, and factorials of a group of data.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/14/2015
 * Purpose: Week 13 Class Exercise 1 (Static Method, Overload Method, Array)
 */

public class Calculator {
	/**
	 * method for finding the sum of the array using double type
	 * @param the array
	 * @return the sum of the array
	 */
	public static double sum(double [] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	/**
	 * method for finding the sum of the array using int type
	 * @param the array
	 * @return the sum of the array
	 */
	public static int sum(int [] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	/**
	 * method for finding the average of the array using double type
	 * @param the array
	 * @return the average of the array
	 */
	public static double average(double [] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	/**
	 * method for finding the average of the array using int type
	 * @param the array
	 * @return the average of the array
	 */
	public static int average(int [] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	/**
	 * method for finding the product of the array using double type
	 * @param the array
	 * @return the product of the array
	 */
	public static double product(double [] num) {
		double product = 1;
		for(int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}
	/**
	 * method for finding the product of the array using int type
	 * @param the array
	 * @return the product of the array
	 */
	public static int product(int [] num) {
		int product = 1;
		for(int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}
	/* I was unsure of what exactly you wanted here, tried returning a new array with the factorials of the parameter array
	   but when I tested the method with System.out.println it would print the location of the array instead of the factorials array values,
	   so I changed it to void and printed each factorial individually.
	   This was my first attempt at the method:
	   			public static int [] factorial(int [] num) {
					int product = 1;
					int [] factorials = new int[num.length];
					for(int i = 0; i < num.length; i++) {
						for(int j = num[i]; j > 0; j--) {
							product *= j;
						}
						factorials[i] = product;
						product = 1;
					}
					return factorials;
				}
	   If you would like me to alter my factorial method let me know what you want me to change and I'll resubmit the class exercise.
	*/
	/**
	 * method for finding and printing the factorial for each integer of the array
	 * @param the array
	 */
	public static void factorial(int [] num) {
		long product = 1; //changed data type from int to long because I tested 15! and the output was incorrect
		for(int i = 0; i < num.length; i++) {
			for(int j = num[i]; j > 0; j--) {
				product *= j;
			}
			System.out.println(num[i] + "! = " + product);
			product = 1;
		}
	}
}