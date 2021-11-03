package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Start = JOptionPane.showInputDialog(null, "Welcome to the land of Foot. Would you like to go left or right?");
		if (Start.equals("left")) {
			String left1 = JOptionPane.showInputDialog(null, "You start walking along and you see a dragon asleep in a cave. You you like to attack or keep walking?");
		}
	}

}
