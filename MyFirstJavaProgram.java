package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot r2 = new Robot();
		r2.penDown();
		r2.sparkle();
		r2.setSpeed(10);
		for (int i = 0; i < 100; i++) {
			r2.setPenColor(Color.RED);
			r2.move(300);
			r2.turn(90);
			r2.setPenColor(Color.BLUE);
			r2.move(300);
			r2.turn(11);

		}

	}
}
