package threads;


import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
	Robot retard = new Robot(400, 700);
	Robot Fritz = new Robot(400, 850);
	Robot something = new Robot(400, 550);
	Robot Nibba = new Robot(350, 775);
	Robot insensitive = new Robot(350,825 );

		new Thread(()-> {
		retard.penDown();
		for (int i = 0; i < 360; i++) {
			retard.setSpeed(10);
			retard.move(1);
			retard.turn(1);
		}
	}).start();
}
}
