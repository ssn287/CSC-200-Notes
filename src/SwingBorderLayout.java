/**
 * SwingBorderLayout class is used to create a GUI with 4 text fields in Border Layout.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/21/2015
 * Purpose: Week 14 Class Exercise 1 (Java GUI Swing Layout)
 */

import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class SwingBorderLayout extends JFrame {
	//initializing instance variables
	private JTextField [] textField = new JTextField[4];
	/**
	 * constructor for creating the GUI
	 */
	public SwingBorderLayout() {
		textField[0] = new JTextField(5);
		textField[1] = new JTextField(5);
		textField[2] = new JTextField(5);
		textField[3] = new JTextField(5);
		setLayout(new BorderLayout());
		add(textField[0], BorderLayout.PAGE_START);
		add(textField[1], BorderLayout.LINE_END);
		add(textField[2], BorderLayout.PAGE_END);
		add(textField[3], BorderLayout.LINE_START);
		setVisible(true);
		setSize(new Dimension(250, 250));
	}
}