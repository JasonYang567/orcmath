package myStuff;

import guiTeacher.GUIApplication;

public class SimonGUI extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5095780071235764551L;

	public SimonGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args){
		SimonGUI simon = new SimonGUI(800, 550);
		Thread runner = new Thread(simon);
		runner.start();
	}
 
	
	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		Simon screen = new Simon(getWidth(), getHeight());
		setScreen(screen);
	}

}
