/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/6/2015
 * Purpose: Methods
 */
import java.util.Scanner;

public class W11CE2 {
	public static void main(String [] args) {
		double x, y, z;
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		x = keyboard.nextDouble();
		System.out.println("Enter a value for y:");
		y = keyboard.nextDouble();
		System.out.println("Enter a value for z:");
		z = keyboard.nextDouble();
		System.out.println("h(x) = " + h(x));
		System.out.println("f(x,y) = " + f(x,y));
		System.out.println("g(x,y,z) = " + g(x,y,z));
		keyboard.close();
	}
	public static double h(double x) {
		return pow(x, 10);
	}
	public static double f(double x, double y) {
		return x + y;
	}
	public static double g(double x, double y, double z) {
		return sqrt(x) + abs(y) + pow(z, y);
	}
	public static double pow(double x, double y) {
		double num = 1;
		double ans = x;
		while(num < y) {
			ans *= x;
			num++;
		}
		return ans;
	}
	public static double sqrt(double x) {
		return pow(x, 0.5);
	}
	public static double abs(double x) {
		double ans = x;
		if(x < 0) {
			ans += x * 2;
		}
		return ans;
	}
}