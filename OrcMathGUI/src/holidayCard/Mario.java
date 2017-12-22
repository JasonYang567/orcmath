package holidayCard;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.MovingComponent;
import guiTeacher.interfaces.KeyedComponent;

public class Mario extends MovingComponent implements KeyedComponent{

	private AnimatedCompentMario left;
	private AnimatedCompentMario right;
	private AnimatedCompentMario up;
	private AnimatedCompentMario down;
	
	public Mario() {
		super(500,500,100,100);
		addSequence("resources/MarioSprite.png",150,16,855,30,40,7);
		addBackwardsSequence("resources/MarioSprite.png",150,16,855,30,40,7);
		Thread animation = new Thread(this);
		animation.start();
		setX(500);
		setY(500);
		update();
	}
	public void addBackwardsSequence(String originalImgageAddress, int time, int x, int y, int w, int h,
			int n) {
		BufferedImage originalImgage;
		try {
			originalImgage = ImageIO.read(new File(originalImgageAddress));
			for(int i = n-1; i >= 0; i--){
				addFrame(originalImgage.getSubimage(x+w*i, y, w, h),time);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(Graphics2D g) {
//		g.setColor(Color.black);
//		g.fillRect(0, 0, getWidth(), getHeight());
		super.update(g);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_KP_LEFT){
			left = new AnimatedCompentMario(500,500,50,50);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setFocus(boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public float getAlpha() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setAlpha(float f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void unhoverAction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hoverAction() {
		// TODO Auto-generated method stub
		
	}
}
