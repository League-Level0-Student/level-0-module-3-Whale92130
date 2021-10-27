
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)

		int p =0;
		//3. Set the pen width to 10
		for (p = 0; p < 1000; p++) {
		//4. Ask the user what color pen they would like the robot to draw with
		String q = JOptionPane.showInputDialog(null, "What color do you want the shape to be?(red,orange,yellow,green,blue,purple,black)");
		//5. Use an if/else statement to set the pen color that the user requested
		if (q.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if (q.equals("orange")) {
			rob.setPenColor(255,165,0);
		}
		else if (q.equals("yellow")) {
			rob.setPenColor(255,255,0);
		}
		else if (q.equals("green")) {
			rob.setPenColor(0,128,0);
		}
		else if (q.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		else if (q.equals("purple")) {
			rob.setPenColor(128,0,128);
		}
		else if (q.equals("black")) {
			rob.setPenColor(0,0,0);
		}
		else {
			rob.setRandomPenColor();
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(60);
		for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
		}
		}
		 



	}
}
