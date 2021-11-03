package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Q = JOptionPane.showInputDialog(null, "Are you happy?");
		String Q1 = "hi";
		if (Q.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		}
		else {
		Q1 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		}
		if (Q1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change Something!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		}
				
				
	}

}
