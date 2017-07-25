package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot r2 = new Robot("vic");

	void go() {
		r2.penDown();
		// 4. Make the robot move as fast as possible
		r2.setSpeed(10);
		// 5. Set the pen width to 5
		r2.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			r2.setRandomPenColor();
			drawSquare();
			r2.turn(90);

		}
		// 7. Set the pen color to random

		// 1. Call the drawSquare() method

		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "Yo my dude! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
			r2.move(200);
			r2.turn(90);

		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
