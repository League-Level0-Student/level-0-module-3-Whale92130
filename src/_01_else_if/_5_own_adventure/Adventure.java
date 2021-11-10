package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String left1 = "hi";
		String right1 = "hi";
		String act1 = "hi";

		JOptionPane.showMessageDialog(null, "Welcome to the land of TacoCat. You are in a fantacy land in the middle of the forest. Key = [ ] means type to do that action");
		String Start = JOptionPane.showInputDialog(null, "Would you like to go [left] or [right]?");
		if (Start.equals("left")) {
			left1 = JOptionPane.showInputDialog(null, "You start walking along and you see a dragon asleep in a cave. Would you like to [attack] or [keep walking]?");
		}
		else {
			right1 = JOptionPane.showInputDialog(null, "You start walking along and you see a cave. Would you like to [go in] or [keep walking]?");
		}
		
		if (left1.equals("attack")) {
			int dragonHP = 100;
			Random ran = new Random();
			int number = 0;
			number = ran.nextInt(200);
			dragonHP = dragonHP - number;
			if (dragonHP < 0) {
				dragonHP = 0;
			}
			act1 = JOptionPane.showInputDialog(null, "You did " + number + " damage to the dragon. Would you like to [run] or [attack] again");
			if (act1.equals("run")) {
				JOptionPane.showMessageDialog(null, "You run away and trip on a rock. You fall flat on your face and die.");
			}
			else {
				JOptionPane.showInputDialog(null, "You kill the dragon and now rule the world. What would you like to do?");
				JOptionPane.showMessageDialog(null, "Good decision.");
			}
		}
			if (left1.equals("keep walking")) {
				JOptionPane.showMessageDialog(null, "You fall in a pit of lava. If you can guess my number in 3 tries I will let you rule the world and escape the lava.");
				int random = new Random().nextInt(99+1);
					for (int count = 0; count < 3; count++) {
				String Q = JOptionPane.showInputDialog(null, "Guess a number?");
					int Qint = Integer.parseInt(Q);
					
					if (Qint == random) {
						System.out.println("You Win!");
						JOptionPane.showInputDialog(null, "You kill the dragon and now rule the world. What would you like to do?");
						JOptionPane.showMessageDialog(null, "Good decision.");
					}
					else if (Qint > random) {
						System.out.println("Too high!");
					}
					else if (Qint < random) {
						System.out.println("Too low!");
					}
					}
				System.out.println("You Lose!");
				System.out.println("The number was " + random);
				JOptionPane.showMessageDialog(null, "You die in the lava.");
				System.exit(0);
			}
			
			if (right1.equals("keep walking")) {
				JOptionPane.showMessageDialog(null, "You fall in a pit of lava. If you can guess my number in 3 tries I will let you rule the world amd escape the lava.");
				int random = new Random().nextInt(99+1);
					for (int count = 0; count < 3; count++) {
				String Q = JOptionPane.showInputDialog(null, "Guess a number?");
					int Qint = Integer.parseInt(Q);
					
					if (Qint == random) {
						System.out.println("You Win!");
						JOptionPane.showInputDialog(null, "You now rule the world of TacoCat. What would you like to do?");
						JOptionPane.showMessageDialog(null, "Good decision.");
					}
					else if (Qint > random) {
						System.out.println("Too high!");
					}
					else if (Qint < random) {
						System.out.println("Too low!");
					}
					}
				System.out.println("You Lose!");
				System.out.println("The number was " + random);
				JOptionPane.showMessageDialog(null, "You die in the lava.");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "You walk in and find the staff of TacoCat");
				JOptionPane.showInputDialog(null, "You now rule the world of TacoCat. What would you like to do?");
				JOptionPane.showMessageDialog(null, "Good decision.");
			}
		}
	}


