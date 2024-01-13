package bubble;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap; 
	
	public BubbleFrame() {
		initObject();
		initSetting(); 
		setVisible(true);
		
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		backgroundMap.setSize(100,100);
		backgroundMap.setLocation(300,300);
		add(backgroundMap); 
	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		
		new BubbleFrame();
	}
	

}
