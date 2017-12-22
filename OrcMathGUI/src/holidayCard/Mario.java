package holidayCard;

import guiTeacher.components.AnimatedComponent;

public class Mario extends AnimatedComponent{

	public Mario(int x, int y, int width, int height) {
		super(x, y, width, height);
		addSequence("resources/MarioSprite.png",150,25,860,28,35,7);
		Thread go = new Thread(this);
		go.start();
		update();
	}

}
