

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	private double vX, vY;
	
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		
		vX = 0;
		vY= 0;
		
	}

	// METHODS
	public void walk(int dir) {
		

		x+= dir*10;
		// WALK!
	}

	public void jump() {
		// JUMP!
	}
	
	//stuff that happens with you not needing to hit a key ( passive acts)
	public void act(ArrayList<Shape> obstacles) {
		
		
		vY += .5;
		
		super.y += vY;
		
		System.out.println("no");
		// FINISH ME!
	}


}
