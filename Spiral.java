package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot r2 = new Robot();
		r2.penDown();
		r2.setSpeed(10);
		for (int i = 0; i < 75; i++) {
			r2.setRandomPenColor();
			r2.move(5 * i);
			r2.turn(360 / 15);
			r2.setPenWidth(i);
		}
	}
}
