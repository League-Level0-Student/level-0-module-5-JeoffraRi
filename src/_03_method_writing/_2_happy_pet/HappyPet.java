package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: 
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
			JOptionPane.showMessageDialog(null, "Welcome to Keith's Klaws, the best cat store in San Diego!");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i=0; i<20; i++) {
			int task = JOptionPane.showOptionDialog(null, "Do something with your cat, man.", "What do you wanna do with your cat?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Feed", "Drink", "Cuddle", "Groom", "Play with" }, null);
			System.out.println(task);
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			}
			JOptionPane.showMessageDialog(null, "Your cat is happy enough. Don't try to make him any happier,\n or he will get mad and punch you in the stomach!");
	}

	// 5. Create methods to handle each of your user selections.
	static void feed() {
		JOptionPane.showMessageDialog(null, "You open a can of tuna. Your cat's eyes immediately \nsnap to the can, and he quickly devours it.");
		happinessLevel+=1;
		} 
	static void drink() {
		JOptionPane.showMessageDialog(null, "You fill your cat's water bowl. \nHe mews and happily laps it up.");
		happinessLevel+=1;
	}
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your cat walks up to you, rubbing his \nface affectionately on you. He purrs.");
		happinessLevel+=1;
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "You brush your cat's fur. The brush looks like it has been coated with thick cotton.");
		happinessLevel+=1;
	}
	
	static void playWith() {
		JOptionPane.showMessageDialog(null, "You take out your cat's favorite feather toy and wave it around.");
		happinessLevel+=1;
	}
	
				
			
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}