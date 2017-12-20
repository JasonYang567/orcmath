package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.FileWriter;
import java.io.IOException;

import guiTeacher.components.Component;

public class MarioPowerUp extends Component{

	private String name;
	private int price;
	
	public MarioPowerUp(String name, int price) {
		super(100,100,10,10);	//x coordinate, y coordinate, width, height
		this.price = price;
		this.name = name;
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
	}

	public String toString(){
		return name + " " + price;
	}
	
}