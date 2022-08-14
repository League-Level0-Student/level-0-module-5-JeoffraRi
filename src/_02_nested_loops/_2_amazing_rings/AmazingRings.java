package _02_nested_loops._2_amazing_rings;

import processing.core.PApplet; 
import processing.core.PImage;

/*
 * Goal: Create a pair of Amazing Rings!
 * 
 * 1. Open the demonstration for this recipe by opening the Recipe.html
 *    file in this folder.
 * 
 * In the setup() method:
  2. Set the size of your window to be a rectangle like in the recipe
     demonstration*/
 
 /*3. Call the noFill() command so all the ellipses will be transparent*/
  
 /*
 * In the draw() method:
  4. Use a for loop to make the first set of rings that will start in the*/
  
 /* 5. Make this set of rings move across the sketch to the right
 *    Hint: make two variables, one for x and another for the speed.
 *    Then increase x by the amount in speed.*/
 
 /* 6. When the rings reach the right side of the sketch, reverse the direction
     so they move
     Hint: speed = -speed*/
      
 /* 7. When the rings reach the left side of the sketch, reverse the direction
     again.*/
  
 /* CHALLENGE - to finish the Amazing Rings
 * 8. Add another for loop to draw the second set of rings that will start in
     the right half of the window*/
 
 /*9. Make this set of rings move in the opposite direction to the other rings
 *    These rings must also "bounce" nt xOne = 250;
*/
public class AmazingRings extends PApplet {
	int xSpeed = 1;
	int xOne = 250;
	int xTwo = 550;
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    PImage waldo;

    @Override
    public void settings() {
    size(800,500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	noFill();
    	background(255,255,255);
    	for(int i=0; i<100; i++) {
    		circle(xOne,250, i*7);
    		circle(xTwo,250, i*7);
    	}
    	xOne+=xSpeed;
    	xTwo-=xSpeed;
    	if(xOne==550) {
    	xSpeed=-xSpeed;	
    	}else if (xTwo==250) {
    	xSpeed+=xSpeed;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(AmazingRings.class.getName());
    }
}