package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Testscoreiboi {
public static void main(String[] args) {
	
	
	String score = JOptionPane.showInputDialog("what did you get on your test? (number not letter)");
	double scoreint = Double.parseDouble(score);
	if (scoreint > 90) {
		JOptionPane.showMessageDialog(null, "Good job! You must have studied hard! That is an A!");
	}
	
	else if (scoreint > 80) {
		JOptionPane.showMessageDialog(null, "Good job. That's a B!");
	}
	else if (scoreint > 70) {
		JOptionPane.showMessageDialog(null, "That is okay.. But it is a C.");
	}
	else if (scoreint > 60) {
		JOptionPane.showMessageDialog(null, "Uhhhh... That is a D.");
	}
	else if (scoreint <60) {
		JOptionPane.showMessageDialog(null, "Oh no! That is an F!");
	}
	else if (scoreint == 100) {
		JOptionPane.showMessageDialog(null, "Congratulations! You aced it! A+!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
