/**
 * @author ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/7/2015
 * Purpose: Instance Variable vs. Local Variable
 */

public class CarDriver {
	public static void main(String [] args) {
		Car car1 = new Car("red", 420.0, 80.0);
		System.out.println("Car 1 Original Color: " + car1.getColor());
		car1.setColor("blue");
		System.out.println("Car 1 Specifications: " + car1);
		Car car2 = new Car("green", 750.0, 200.0);
		System.out.println("Car 2 Original Horse Power: " + car2.getHorsePower());
		car2.setHorsePower(800.0);
		System.out.println("Car 2 Specifications: " + car2);
		Car car3 = new Car();
		System.out.println("Car 3 Original Engine Size: " + car3.getEngineSize());
		car3.setEngineSize(50.0);
		System.out.println("Car 3 Specifications: " + car3);
	}
}