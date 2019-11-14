/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: email.vccs.edu
 * Date: 4/9/2015
 * Purpose: Week 12 Class Exercise 2 (This & Static & Equals)
 */

import javax.swing.JOptionPane;

public class CarDriver2 {
	public static void main(String [] args) {
		String car1Color, car2Color, car3Color, car4Color,
		       strCar1HorsePower, strCar2HorsePower, strCar3HorsePower,
		       strCar1EngineSize, strCar2EngineSize, strCar3EngineSize;
		double car1HorsePower, car2HorsePower, car3HorsePower, car4HorsePower,
		       car1EngineSize, car2EngineSize, car3EngineSize, car4EngineSize;
		car1Color = JOptionPane.showInputDialog(null, "Car 1 Color:");
		strCar1HorsePower = JOptionPane.showInputDialog(null, "Car 1 Horse Power:");
		strCar1EngineSize = JOptionPane.showInputDialog(null, "Car 1 Engine Size:");
		car2Color = JOptionPane.showInputDialog(null, "Car 2 Color:");
		strCar2HorsePower = JOptionPane.showInputDialog(null, "Car 2 Horse Power:");
		strCar2EngineSize = JOptionPane.showInputDialog(null, "Car 2 Engine Size:");
		car3Color = JOptionPane.showInputDialog(null, "Car 3 Color:");
		strCar3HorsePower = JOptionPane.showInputDialog(null, "Car 3 Horse Power:");
		strCar3EngineSize = JOptionPane.showInputDialog(null, "Car 3 Engine Size:");
		car1HorsePower = Double.parseDouble(strCar1HorsePower);
		car1EngineSize = Double.parseDouble(strCar1EngineSize);
		car2HorsePower = Double.parseDouble(strCar2HorsePower);
		car2EngineSize = Double.parseDouble(strCar2EngineSize);
		car3HorsePower = Double.parseDouble(strCar3HorsePower);
		car3EngineSize = Double.parseDouble(strCar3EngineSize);
		car4Color = car1Color;
		car4HorsePower = car1HorsePower;
		car4EngineSize = car1EngineSize;
		Car car1 = new Car(car1Color, car1HorsePower, car1EngineSize);
		Car car2 = new Car(car2Color, car2HorsePower, car2EngineSize);
		Car car3 = new Car(car3Color, car3HorsePower, car3EngineSize);
		Car car4 = new Car(car4Color, car4HorsePower, car4EngineSize);
		JOptionPane.showMessageDialog(null, "Car 1 Specifications: " + car1 +
									  "\nCar 2 Specifications: " + car2 +
									  "\nCar 3 Specifications: " + car3 +
									  "\nCar 4 Specifications: " + car4 +
									  "\nCar 1 = Car 2?        " + car1.equals(car2) +
									  "\nCar 1 = Car 3?        " + car1.equals(car3) +
									  "\nCar 1 = Car 4?        " + car1.equals(car4) +
									  "\nNumber of Cars:       " + Car.getCount());
	}
}