package bubble;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap; 
	
	public BubbleFrame() {
		setSize(1000, 640);
		setLayout(null); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new BubbleFrame();
	}
	

}
