package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class SooprRubaht {
	static Robot rob = new Robot();	
	public static void main(String[] args) {
		//drawRick();
		rob.penDown();
		rob.show();
		for (int i=0; i<6; i++) {
			rob.move(100);
			rob.turn(100);	
		}
		rob.hide();
		
	}
	
	static void drawRick() {
		rob.penDown();
		rob.setSpeed(2100000000);
		for (int i=0; i<4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		rob.hide();
	}

	
}
//bit.ly/dGame
//dragondungeon.io
//