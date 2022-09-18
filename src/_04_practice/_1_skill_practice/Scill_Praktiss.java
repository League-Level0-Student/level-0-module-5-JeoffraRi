package _04_practice._1_skill_practice;

import java.util.Random;
import javax.swing.JOptionPane;

public class Scill_Praktiss {
	public static void main(String[] args) {

		Scill_Praktiss skills = new Scill_Praktiss();
			           skills.skill1();
			           skills.skill2();
			           skills.skill3();
			           skills.skill4();
			           skills.skill5();
			}

			void skill1() {
			// Use pop-ups for the following.
			// Ask the user how many dimes they have
				String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
			// Tell them how many cents they have (hint multiply by 10)
				JOptionPane.showMessageDialog(null, "Here is your amount of cents: "+Integer.parseInt(dimes)*10+"");
			// Ask the user how tall they are (inches)

			// If they are shorter than 36 inches, tell them to eat their Wheaties
				String inches = JOptionPane.showInputDialog(null, "How many inches tall are you?");
				if(Integer.parseInt(inches)<36) {
					JOptionPane.showMessageDialog(null, "You should be taller.");
					JOptionPane.showMessageDialog(null, "...");
					JOptionPane.showMessageDialog(null, "Goodbye.");
				}
			}

			void skill2() { // Write a loop to print every third number between 1 and 30 to the console
				JOptionPane.showMessageDialog(null, "Today, we're gonna look at every third number from 0 to 30! Yaaaaaay!");
				for(int i=0; i<33; i++) {
					if(i%3==0) {
						JOptionPane.showMessageDialog(null, ""+i+"");
					}
				}
			}

			void skill3() { // Get a random number that is less than 20 and print it to the console
				JOptionPane.showMessageDialog(null, "Today, we're gonna pick a random number from 0 to 20! Yaaaaaay!");
				Random genOne = new Random();
				int r1 = genOne.nextInt(21);
			// Get 	another random number that is less than 10 and print it to the console
				Random genTwo = new Random();
				int r2 = genTwo.nextInt(11);
				JOptionPane.showMessageDialog(null, "The difference between "+r1+" and "+r2+" is "+(r1-r2)+".");
			// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction

			}

			void skill4() { // In a pop-up, ask the user for the city they live in
				String whatCity = JOptionPane.showInputDialog(null, "What city do you live in, dude?");
			// If they answered "San Diego", tell them they live in America's Finest City
				if(whatCity.equalsIgnoreCase("San Diego")) {
					JOptionPane.showMessageDialog(null, "You live in the best city in America! You can walk a few blocks to the beach! You have access\n to a not so bike-friendly transit system called MTS! Wanna go to LA or Oceanside? \nTake the Pacific SUrfliner or NCTD Coaster at the train station!");
				}else {
					JOptionPane.showMessageDialog(null, "Dude...");
					JOptionPane.showMessageDialog(null, "...Move to San Diego.");
				}
			// Otherwise, tell them to move to San Diego
				
			// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
				String cars = JOptionPane.showInputDialog(null, "How many cars does your family have?");
			// If there is 1 car, use a pop-up to display the make/model of the car
				if (Integer.parseInt(cars)==1) {
					String make = JOptionPane.showInputDialog(null, "What is the make of your car?");
					String model = JOptionPane.showInputDialog(null, "What is the model of your car?");
					JOptionPane.showMessageDialog(null, "You have a "+make+" "+model+".");
				}else if(Integer.parseInt(cars)>1) {
					JOptionPane.showMessageDialog(null, "Your "+Integer.parseInt(cars)+" have "+Integer.parseInt(cars)*4+" wheels between them.");
				}
			// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
				
			}

			void skill5() { // In a pop-up, ask the user for the name of their school
				String school = JOptionPane.showInputDialog(null, "What's the name of your school?");
				JOptionPane.showMessageDialog(null, ""+school+" is an amazing school. Unless it isn't. Then it sucks.");
			// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

			
			
	}
}
