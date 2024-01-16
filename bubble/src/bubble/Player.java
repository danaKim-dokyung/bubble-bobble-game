package bubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	// 버블이 위치
	private int x;
	private int y;

	
	//버블이 상태
	private boolean isLeft; 
	private boolean isRight; 
	private boolean isUp; 
	private boolean isDown; 

	
	private ImageIcon playerR, playerL;

	public Player() {
		initObject();
		initSetting();
	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");

	}

	private void initSetting() {

		x = 55;
		y = 535;

		isLeft = false; 
		isRight = false; 
		isUp = false; 
		isDown = false; 

		
		
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);

	}

	@Override
	public void left() {
		setIcon(playerL); 
		x = x-10; 
		setLocation(x,y);
	}

	@Override
	public void right() {
		setIcon(playerR); 
		x = x+10; 
		setLocation(x,y);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

	}

}
