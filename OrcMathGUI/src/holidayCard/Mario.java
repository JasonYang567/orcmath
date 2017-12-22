package holidayCard;

import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class Mario extends AnimatedComponent{

	public Mario(int x, int y, int width, int height) {
		super(x, y, width, height);
		addSequence("resources/MarioSprite.png",150,24,861,20,35,7);
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
