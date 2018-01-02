package myStuff;

import java.awt.Color;

import guiTeacher.components.Button;

public class TheButton extends Button implements CustomLabel{

	public static Button b;
	
	public TheButton() {
		super(curveX, curveX, curveX, curveX, text, action);
	}
}
