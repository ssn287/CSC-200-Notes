  
/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/9/2015
 * Purpose: Instance Variable vs. Local Variable
 */

public class Car {
	private String color;
	private double horsePower;
	private double engineSize;
	private static int count;
	public Car() {
		this.color = "";
		this.horsePower = 0.0;
		this.engineSize = 0.0;
		count++;
	}
	public Car(String color, double horsePower, double engineSize) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		count++;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public double getHorsePower() {
		return this.horsePower;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public double getEngineSize() {
		return this.engineSize;
	}
	public static int getCount() {
		return count;
	}
	public boolean equals(Car otherObject) {
		return (this.color == otherObject.color) && (this.horsePower == otherObject.horsePower) && (this.engineSize == otherObject.engineSize);
	}
	public String toString() {
		return "[Color: " + this.color + "][Horse Power: " + this.horsePower + "][Engine Size: " + this.engineSize + "]";
	}
}