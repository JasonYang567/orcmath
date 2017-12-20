package myStuff;

import java.util.List;

import guiPlayer.CatalogMaker;
import guiPlayer.MarioPowerUp;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;;

public class CatalogScreen extends FullFunctionScreen{

	private TextField namefield;
	private TextField pricefield;
	private CatalogMaker catalog;
	private Button add;
	private TextArea textarea;
	
	private static final long serialVersionUID = 258186143576427947L;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new CatalogMaker();
		namefield = new TextField(40,40,200,30, "enter name here");
		namefield.setInputType(0);
		pricefield = new TextField(250,40,200,30, "enter price here");
		pricefield.setInputType(1);
		textarea = new TextArea(40,100,200,30, "");
		viewObjects.add(namefield);
		viewObjects.add(pricefield);
		viewObjects.add(textarea);
		viewObjects.add(add());
	}
	
	private Button add() {
		add = new Button(450,40,300,30,"Enter", new Action() {
			@Override
			public void act() {
				addButtonClicked();
			}
		});
		return add;
	}

	protected void addButtonClicked() {
		MarioPowerUp m = new MarioPowerUp(namefield.getText(),pricefield.getText());	
		catalog.addNewItem("Mushroom", 50);
		String s = textarea.getText() + m + "\n";
		namefield.setText(m.getName());	
		pricefield.setText(m.getPrice());
		textarea.setText(s);
	}
}
