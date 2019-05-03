import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JButtonMethod extends JFrame{
	JButtonMethod(){
		this.setTitle("버튼 메소드");
		this.setSize(300,300);
		
		Container c = getContentPane();
		
		ImageIcon right = new ImageIcon("images/오른쪽.png");
		ImageIcon left = new ImageIcon("images/왼쪽.png");
		ImageIcon star = new ImageIcon("images/별.png");
		
		JButton btn = new JButton("hi", right);
		btn.setPressedIcon(star);
		btn.setRolloverIcon(left);
		
		c.add(btn);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] argc) {
		new JButtonMethod();
	}

}
