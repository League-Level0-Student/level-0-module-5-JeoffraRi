package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntletKeithDude {
public static void main(String[] args) {
	System.out.println("Challenge 1");
	for (int a=0; a<101; a++) {
		System.out.println(a);
	}	
	System.out.println("Challenge 2");
	for (int b=100; b>0; b--) {
		System.out.println(b);
	}
	System.out.println("Challenge 3");
	for (int c=2; c<200; c++) {
		if (c%2==0) {
			System.out.println(c);
		}
	}
	System.out.println("Challenge 4");
	for (int d=1; d<99; d++) {
		if (d%2==1) {
			System.out.println(d);
		}
	}
	System.out.println("Challenge 5");
	for (int e=1; e<500; e++) {
		if (e%2==0) {
			System.out.println(""+e+" is even");
		}else if (e%2==1) {
			System.out.println(""+e+" is odd");
		}
	}
	System.out.println("Challenge 6");
	for (int f=7; f<777; f++) {
		if (f%7==0) {
			System.out.println(f);	
		}
	}
	System.out.println("Challenge 7");
	for (int g=2011; g<2022; g++) {
		System.out.println("In "+g+", I was "+(g-2011)+" years old.");
	}
	System.out.println("Challenge 8");
	for (int hB=0; hB<3; hB++) {
		for (int hC=0; hC<3; hC++) {	
				System.out.println(hB+" "+hC);
		}
	}

}
}
