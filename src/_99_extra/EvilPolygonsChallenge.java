package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Pick a color!", "Never gonna give you up, never gonna let you down, or run around, and hurt you! Never gonna tell a lie, never gonna say goodbye, or run around and desert you! ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Lime","Grass", "Forest"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		System.out.println(colorChoice);
		//forest = 2
		//grass = 1
		//lime = 0
		if(colorChoice==0) {
			rob.setPenColor(166, 255, 0);
		}else if (colorChoice==1) {
			rob.setPenColor(0, 218, 60);
		}else if (colorChoice==2) {
			rob.setPenColor(0, 84, 22);
		}
		rob.setPenWidth(20);
		//4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog(null, "Hey, how many polygons do you want?");
		//5. Use the robot to draw the number of polygons the user requested.
		rob.setX(200);
		rob.setY(900);
		for (int g=0; g<Integer.parseInt(polygon); g++) {
		for (int i=0; i<5; i++) {
		rob.penDown();
		rob.move(25);
		rob.turn(72);
		}
		rob.penUp();
		rob.move(65);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

