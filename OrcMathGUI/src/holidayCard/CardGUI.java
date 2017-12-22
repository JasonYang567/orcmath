package holidayCard;

import guiTeacher.GUIApplication;

public class CardGUI extends GUIApplication{

	private static final long serialVersionUID = -2452328323352199392L;
	
	public CardGUI(int width, int height) {
		super(width,height);
		setVisible(true);
	}

	public static void main(String[] args){
		CardGUI sample = new CardGUI(1200, 1050);
		Thread go = new Thread(sample);
		go.start();
	}

	@Override
	public void initScreen() {
		CardScreen s = new CardScreen(getWidth(), getHeight());
		setScreen(s);		
	}

}
