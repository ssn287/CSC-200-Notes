/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 3/3/2015
 * Purpose: Boolean and If-Else Class Exercise
 */

import javax.swing.JOptionPane;

public class W8CE1 {
	public static void main(String [] args) {
		String strNumPeople, strNumPlayers;
		int numPeople, numPlayers, groupSize, teamSize;
		strNumPeople = JOptionPane.showInputDialog(null, "Enter the number of people:");
		numPeople = Integer.parseInt(strNumPeople);
		strNumPlayers = JOptionPane.showInputDialog(null, "Enter the number of players:");
		numPlayers = Integer.parseInt(strNumPlayers);
		groupSize = numPeople;
		teamSize = numPlayers;
		if(numPeople > 10) {
			groupSize = numPeople / 2;
		}
		else if(3 <= numPeople && numPeople <= 10) {
			groupSize = numPeople / 3;
			numPeople += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
		if(11 < numPlayers && numPlayers < 55) {
			teamSize = numPlayers / 11;
		}
		else {
			teamSize = 1;
		}
		JOptionPane.showMessageDialog(null, "The number of people is: " + numPeople + "\nThe group size is: " + groupSize + "\nThe number of players is: " + numPlayers + "\nThe team size is: " + teamSize);
	}
}