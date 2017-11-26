package threads;


import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
	Robot john = new Robot(400, 700, "vic");
	Robot bill = new Robot(500, 800, "batman");
	Robot till = new Robot(600, 700);
	Robot nill = new Robot(700, 800, "vic");
	Robot kill = new Robot(900, 700);
	john.setSpeed(100);
	bill.setSpeed(100);
	till.setSpeed(100);
	nill.setSpeed(100);
	kill.setSpeed(100);
	
john.penDown();
	bill.penDown();
	till.penDown();
	nill.penDown();
	kill.penDown();
JOptionPane.showConfirmDialog(null, "ERROR: windows xp is not responding");
	Thread a = new Thread(()->{
		for (int i = 0; i < 360; i++) {
			john.turn(1);
			john.move(2);
		}
		
	});Thread b = new Thread(()->{
for (int i = 0; i < 360; i++) {
	bill.turn(1);
	bill.move(2);
		}
	});Thread c = new Thread(()->{
for (int i = 0; i < 360; i++) {
	till.turn(1);
	till.move(2);
		}
	});Thread d = new Thread(()->{
for (int i = 0; i < 360; i++) {
	nill.turn(1);
	nill.move(2);
		}
	});Thread e = new Thread(()->{
for (int i = 0; i < 807; i++) {
	kill.turn(20);
	kill.move(40);
	kill.turn(160);
	kill.move(40);
	kill.turn(20);
		}
kill.hide();
	});
	
	a.start();
	b.start();
	c.start();
	d.start();
	e.start();
	
}
}
