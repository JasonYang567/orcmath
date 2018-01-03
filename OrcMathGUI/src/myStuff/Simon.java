package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class Simon extends ClickableScreen{

	public Simon(int width, int height) {
		super(width, height);
		sequencelength = 3;
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Color> move;
	private Color[] colors= {Color.red,Color.blue,Color.green, Color.yellow};;
	private TextArea numRounds;
	private TextArea turn;
	private TheButton red;
	private TheButton blue;
	private TheButton green;
	private TheButton yellow;
	private int round;
	private int sequencelength;
	private boolean pTurn;
	


	public void setUpButtons() {
		red = new TheButton(100,100,Color.red,"Red");
		blue = new TheButton(200,100,Color.blue,"Blue");
		green = new TheButton(100,200,Color.green,"Green");
		yellow = new TheButton(200,200,Color.yellow,"Yellow");
	}
	
	public void setUpTextArea() {
		numRounds = new TextArea(300,300,100,100,"Round: " + round + "\n Sequence Length: 3");
		turn = new TextArea(500,300,100,100,"Simon's Turn");
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		setUpButtons();
		setUpTextArea();
		viewObjects.add(red);
		viewObjects.add(blue);
		viewObjects.add(green);
		viewObjects.add(yellow);
		viewObjects.add(numRounds);
		viewObjects.add(turn);
	}
	
	public ArrayList<Color> sequence(){
		move = new ArrayList<Color>();
		while(move.size() < sequencelength) {
			int num = (int)(Math.random()*3);
			if(move.size() > 1) {
				for(Color c : move) {
					if(c.equals(colors[num])) {
						move.remove(c);
					}
				}
			}			
			move.add(colors[num]);
		}
		return move;
	}
	
}
