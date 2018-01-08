package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.*;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Simon extends FullFunctionScreen{

	/**
	 * 
	 */
	private static final long serialVersionUID = -600262464851178815L;
	
	private ArrayList<Color> player;
	private ArrayList<Color> move;
	private Color[] colors= {Color.red,Color.blue,Color.green, Color.yellow};;
	private TextArea numRounds;
	private TextArea turn;
	private Button red;
	private Button blue;
	private Button green;
	private Button yellow;
	private Button start;
	private int round;
	private int sequencelength;

	public Simon(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	} 

	
	
	public void setUpTextArea() {
		numRounds = new TextArea(400,100,300,300,"Round: " + round + "\n Sequence Length: " + sequencelength);
		turn = new TextArea(500,1500,100,100,"Simon's Turn");
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {						
		sequencelength = 3;
		round = 0;
		player = new ArrayList<Color>();
		red = new Button(100,100,100,100,"Red",Color.red,new Action() {
			@Override
			public void act() {
				player.add(Color.red);
			}
		}); 
		blue = new Button(200,100,100,100,"Blue",Color.blue,new Action() {
			@Override
			public void act() {
				player.add(Color.blue);
			}
		});
		green = new Button(100,200,100,100,"Green",Color.green, new Action() {
			@Override
			public void act() {
				player.add(Color.green);
			}
		});
		yellow = new Button(200,200,100,100,"Yellow",Color.yellow, new Action() {
			@Override
			public void act() {
				player.add(Color.yellow);
			}
		});
		start =  new Button(400,300,100,100,"Start",new Action() {
			@Override
			public void act() {
				SimonsTurn();
			}
		});
		setUpTextArea();
		viewObjects.add(red);
		viewObjects.add(blue);
		viewObjects.add(green);
		viewObjects.add(yellow);
		viewObjects.add(start);
		viewObjects.add(numRounds);
		viewObjects.add(turn);
	}
	
	protected void SimonsTurn() {
		Thread s = new Thread(new Runnable() {
			public void run() {
				sequence();
				for(int i = 0; i < move.size();i++) {
					if(move.get(i) == Color.red) {
						red.setBackground(Color.white);
						update();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						red.setBackground(Color.red);
						update();
					}
					if(move.get(i) == Color.blue) {
						red.setBackground(Color.white);
						update();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						red.setBackground(Color.blue);
						update();
					}
					if(move.get(i) == Color.green) {
						red.setBackground(Color.white);
						update();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						red.setBackground(Color.green);
						update();
					}
					if(move.get(i) == Color.yellow) {
						red.setBackground(Color.white);
						update();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						red.setBackground(Color.yellow);
						update();
					}
				}
			}
		});
			
		// TODO Auto-generated method stub
		
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
			else {
				move.add(colors[num]);
			}
		}
		return move;
	}
	

	
}
