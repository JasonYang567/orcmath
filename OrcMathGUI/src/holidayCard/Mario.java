package holidayCard;

import guiTeacher.components.AnimatedComponent;

public class Mario extends AnimatedComponent{

	public Mario(int x, int y, int width, int height) {
		super(x, y, width, height);
		addSequence(150,25,860,28,35,"resources/MarioSprite.png",7);
	}

}
