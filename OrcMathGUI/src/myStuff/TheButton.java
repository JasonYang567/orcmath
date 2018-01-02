package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class TheButton extends Button implements CustomLabel{

	String s1;
	String s2;
	Color c;
	
	public TheButton(int x, int y) {
		super(x,y,100,100,"Save",new Action(){

			@Override
			public void act() {
				
			}
			
		});
	}

	@Override
	public void updateString1(String string) {
		
	}

	@Override
	public void updateString2(String string) {	
		
	}

	@Override
	public void setIconColor(Color color) {
		
	}

	public void update(Graphics2D g) {
		
	}

	public void drawButton(Graphics2D g, boolean hover) {
	
	}
}
