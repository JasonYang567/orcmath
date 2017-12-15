package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Bowser extends AnimatedComponent{

	public Bowser() {
		super(100,100,91,72);
		addSequence("resources/bowser sprite sheet.png", 500, 12, 145, 103, 86, 2);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
//		g.setColor(Color.black);
//		g.fillRect(0, 0, getWidth(), getHeight());
		super.update(g);
	}

}
