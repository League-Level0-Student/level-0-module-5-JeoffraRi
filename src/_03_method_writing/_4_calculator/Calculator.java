package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		System.out.println(task);

		/*3: add
		 * 2: subtract
		 * 1:multiply
		 0: divide*/
		// 3) Call the correct method depending on what option the user chooses
		if (task==3) {
			JOptionPane.showMessageDialog(null, add(number1,number2));
		}else if (task==2) {
			JOptionPane.showMessageDialog(null, sub(number1,number2));
		}else if (task==1) {
			JOptionPane.showMessageDialog(null, mult(number1,number2));
		}else if (task==0) {
			JOptionPane.showMessageDialog(null, div(number1,number2));
		}
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static int add(int input1,int input2) {
		return input1+input2;
	} 
	static int sub(int input1,int input2) {
		return input1-input2;
	}
	static int mult(int input1,int input2) {
		return input1*input2;
	}
	static int div(int input1,int input2) {
		return input1/input2;
	}
	 
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
