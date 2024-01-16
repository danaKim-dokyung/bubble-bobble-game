package bubble;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import lombok.Getter;

public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap; 
	private Player player; 
	
	public BubbleFrame() {
		initObject();
		initSetting(); 
		setVisible(true);
		initListener(); 
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		
		setContentPane(backgroundMap);
		
		player = new Player() ; 
		add(player);

	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void initListener() {
		addKeyListener(new KeyAdapter() {
			
			//keyboard click
			@Override
			public void keyPressed(KeyEvent e) {
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if(!player.isLeft()) {						
						player.left();
					}
					break; 
				case KeyEvent.VK_RIGHT:
					if(!player.isRight()) {						
						player.right();
					}
					break; 
				case KeyEvent.VK_UP:
					player.up();

					break; 
				
				}
			
			}
			
			//keyboard release 
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
				break; 
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
				break; 
				}
				
			}

			
		});
	}
	
	public static void main(String[] args) {
		
		new BubbleFrame();
	}
	

}
