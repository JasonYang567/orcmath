package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class TheButton extends Button implements CustomLabel{

	private String s1;
	private String s2;
	private Color c;
	
	public TheButton(int x, int y,Color color,String name) {
		super(x,y,100,100,name,color,null);
		setIconColor(color);
	}

	@Override
	public void updateString1(String string) {
		s1 = string;
	}

	@Override
	public void updateString2(String string) {	
		s2 = string;
	}

	@Override
	public void setIconColor(Color color) {
		c = color;
	}

	public void update(Graphics2D g) {
		g.setColor(c);
		
	}

	public void drawButton(Graphics2D g, boolean hover) {
	
	}
}
