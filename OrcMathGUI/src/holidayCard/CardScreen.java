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
	private List<Visible> objects; 
	
	private static final long serialVersionUID = 1L;
	
	public CardScreen(int width, int height) {
		super(width,height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		objects = viewObjects;	
		Graphic	image = new Graphic(0, 0, "resources/santa is a lie.jpg");
		next = new Button(0,0,1247,1148,"", new Action() {
			public void act() {
				Graphic image2 = new Graphic(0,0,"resources/santa wrecking ball.jpg");
				objects.add(image2);
				objects.remove(image);
				objects.remove(next);
			}
		});
		objects.add(next);
		objects.add(image);
	}

}
