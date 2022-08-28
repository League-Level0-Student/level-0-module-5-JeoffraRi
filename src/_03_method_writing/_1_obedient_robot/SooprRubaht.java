package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SooprRubaht {
	static Robot rob = new Robot();	
	public static void main(String[] args) {
		rob.setPenWidth(10);
		String whatShape = JOptionPane.showInputDialog(null, "Select your shape. \n (Circle, triangle, square, all)");
		String whatColor = JOptionPane.showInputDialog(null, "Select your color. \n (Red, yellow, blue)");
		if (whatColor.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		}else if (whatColor.equalsIgnoreCase("yellow")) {
			rob.setPenColor(255,255,0);
		}else if (whatColor.equalsIgnoreCase("blue")) {
			rob.setPenColor(0,0,255);
		}
		if (whatShape.equalsIgnoreCase("circle")) {
			drawCircle();
		}else if (whatShape.equalsIgnoreCase("square")) {
			drawSquare();
		}else if (whatShape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}else if (whatShape.equalsIgnoreCase("all")) {
			drawCircle();
			drawSquare();
			drawTriangle();
		}
		
		
		
		
	}
	static void drawTriangle() {
		rob.setSpeed(2100000000);
		rob.penDown();
		rob.show();
		for (int i=0; i<3; i++) {
			rob.move(100);
			rob.turn(120);	
		}
		rob.penUp();
		rob.move(100);
		rob.hide();
		}
	static void drawSquare() {
		rob.penDown();
		rob.setSpeed(2100000000);
		for (int i=0; i<4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(100);
		rob.hide();
	}
	static void drawCircle() {
		rob.penDown();
		rob.show();
		rob.setSpeed(2100000000);
		for (int i=0; i<360; i++) {
			rob.move(1);
			rob.turn(1);
		}
		rob.penUp();
		rob.move(58);
		rob.hide();
	}
	
}
//bit.ly/dGame
//dragondungeon.io
//