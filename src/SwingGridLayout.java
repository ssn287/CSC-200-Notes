/**
 * SwingGridLayout class is used to create a GUI with 4 text fields in Grid Layout with 2 rows and 2 columns.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/21/2015
 * Purpose: Week 14 Class Exercise 1 (Java GUI Swing Layout)
 */

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class SwingGridLayout extends JFrame {
	//initializing instance variables
	private JTextField [] textField = new JTextField[4];
	/**
	 * constructor for creating the GUI
	 */
	public SwingGridLayout() {
		textField[0] = new JTextField(5);
		textField[1] = new JTextField(5);
		textField[2] = new JTextField(5);
		textField[3] = new JTextField(5);
		setLayout(new GridLayout(2, 2));
		add(textField[0]);
		add(textField[1]);
		add(textField[2]);
		add(textField[3]);
		setVisible(true);
		setSize(new Dimension(250, 250));
	}
}