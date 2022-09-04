package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: 
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int start = JOptionPane.showOptionDialog(null, "Surfer Cat! 2022 edition", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"Play", "Credits"}, null);
		if (start==1) {
			JOptionPane.showMessageDialog(null, "2022 RYALEX Studios");
			JOptionPane.showMessageDialog(null, "Code writing\nAsher Law");
			JOptionPane.showMessageDialog(null, "Assistance\nKeith Groves\nSamuel Sharp");
			JOptionPane.showMessageDialog(null, "Guidelines\nLEAGUE of Amazing Programmers");
			JOptionPane.showMessageDialog(null, "Software\nEclipse IDE");
			JOptionPane.showMessageDialog(null, "Hardware\nApple Macintosh (desktop)");
			JOptionPane.showMessageDialog(null, "Code managing\nGithub");
			JOptionPane.showMessageDialog(null, "Office enviroment\nHacienda Del Mar");
			JOptionPane.showMessageDialog(null, "Stimulation\nSprouts® cinnamon almonds");
			int choice = JOptionPane.showOptionDialog(null, "Surfer Cat! 2022 edition", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Play", "Exit"}, null);
				if (choice==1) {
					System.exit(0);
				}
		}
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i=0; i<20; i++) {
			int task = JOptionPane.showOptionDialog(null, "Do something with your cat, man.", "What do you wanna do with your cat?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Feed", "Drink", "Chill", "Cough", "Play with" }, null);
			System.out.println(happinessLevel);
			//System.out.println(task);
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (task==0) {
				feed();
			}else if (task==1) {
				drink();
			}else if (task==2) {
				chill();
			}else if (task==3) {
				cough();
			}else if (task==4) {
				playWith();
			}else if (task==-1) {
				JOptionPane.showMessageDialog(null, "Hey, are you turning off the game? Wait, no-");
				System.exit(0);
			}
			
	}
			JOptionPane.showMessageDialog(null, "Your cat is happy enough.");
	}
	
	
/*
4: Feed
3: Drink
2: Cuddle
1: Groom
0: Play with
-1: Close window
	*/
	// 5. Create methods to handle each of your user selections.
	static void feed() {
		JOptionPane.showMessageDialog(null, "You open a can of tuna. Your cat stands up and grabs a fork. \"Dude, did you think I was gonna eat so \n unsophisticated? Uncool, man.\" He then quickly devours it.");
		happinessLevel+=1;
		} 
	static void drink() {
		JOptionPane.showMessageDialog(null, "You fill your cat's water bowl. He says, \"Thanks for the water, dude,\" and happily laps it up.");
		happinessLevel+=1;
	}
	static void chill() {
		JOptionPane.showMessageDialog(null, "Your cat walks up to you. \"Hey dude. How's it hangin'?\" \nYou pet your apparently anthropomorphic cat.");
		happinessLevel+=1;
	}
	static void cough() {
		JOptionPane.showMessageDialog(null, "You pat your cat's back and a hairball shoots out of his mouth. \n \"Thanks for gettin' that out, dude. Totally cool, bro.\"");
		happinessLevel+=1;
	}
	
	static void playWith() {
		JOptionPane.showMessageDialog(null, "You take out your cat's favorite feather toy and wave it around. \n \"Nah, man. I'm gonna play some DragonDungeon.io instead, dude.\"");
		happinessLevel+=1;
	}
	
				
			
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}