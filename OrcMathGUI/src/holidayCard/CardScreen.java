package holidayCard;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CardScreen extends FullFunctionScreen{

	private Button next; 
	
	private static final long serialVersionUID = 1L;
	
	public CardScreen(int width, int height) {
		super(width,height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Graphic	image = new Graphic(0, 0, "resources/santa is a lie.jpg");				
		Mario mario = new Mario();	
		next = new Button(0,0,1200,1050,"", new Action() {
			public void act() {
				Graphic image2 = new Graphic(0,0,"resources/santa wrecking ball.jpg");
				viewObjects.add(image2);				
				viewObjects.add(mario);
				viewObjects.remove(image);
				viewObjects.remove(next);		
			}
		});
		viewObjects.add(next);
		viewObjects.add(image);		

	}

}
