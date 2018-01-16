package testPractice;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class screen extends FullFunctionScreen{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Button win;
	private Button lose;
	private TextArea text;
	
	public screen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		win = new Button(500,250,100,100,"Win",Color.green,new Action() {
			@Override
			public void act() {
				// TODO Auto-generated method stub
				text.setText("You win!");
				lose.setEnabled(false);
			}
		});
		lose = new Button(200,250,100,100,"Lose",Color.red,new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				text.setText("You lose!");
				win.setEnabled(false);
			}
			
		});
		text = new TextArea(350,100,300,100,"");
		viewObjects.add(win);
		viewObjects.add(lose);
		viewObjects.add(text);
	}

}
