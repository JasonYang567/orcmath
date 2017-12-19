package myStuff;

import guiTeacher.GUIApplication;

public class CatalogMakerGui extends GUIApplication{

	private static final long serialVersionUID = -2452328323352199392L;
	
	public CatalogMakerGui(int width, int height) {
		super(width,height);
		setVisible(true);
	}

	public static void main(String[] args){
		CatalogMakerGui sample = new CatalogMakerGui(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

	@Override
	public void initScreen() {
		CatalogScreen s = new CatalogScreen(getWidth(), getHeight());
		setScreen(s);		
	}

}
