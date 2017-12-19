package myStuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;;

public class CatalogScreen extends FullFunctionScreen{

	private TextField mainfield;
	
	private static final long serialVersionUID = 258186143576427947L;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		mainfield = new TextField(40,40,200,30, "enter text here");
		viewObjects.add(mainfield);
		viewObjects.add(add());
	}
	
	private Button add() {
		Button add = new Button(40,60,300,30,"the button", new Action() {
			
			@Override
			public void act() {
				mainfield.setText("You clicked the button.");
			}
		});
		return add;
	}
}
