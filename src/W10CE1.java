/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 3/24/2015
 * Purpose: Enum & Switch Case
 */

import javax.swing.JOptionPane;

public class W10CE1 {
	public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String [] args) {
		Month [] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July,
				           Month.August, Month.September, Month.October, Month.November, Month.December};
		Month select = (Month)JOptionPane.showInputDialog(null, "What month is it?", "Month",
			           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		while(select != null) {
			switch(select){
			case December: case January: case February:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case March: case April: case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case June: case July: case August:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;
			case September: case October: case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			}
			select = (Month)JOptionPane.showInputDialog(null, "What month is it?", "Month",
				     JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		}
	}
}