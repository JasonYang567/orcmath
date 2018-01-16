package testPractice;

import guiTeacher.GUIApplication;

public class GUI extends GUIApplication{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		GUI g = new GUI(800,500);
		Thread t = new Thread(g);
		t.start();
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		screen s = new screen(getWidth(),getHeight());
		setScreen(s);
	}

}
