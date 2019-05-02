package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class KeyTest02 extends JFrame implements KeyListener{
	private JLabel la;
	KeyTest02(){
		this.setTitle("키보드 이동");
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(this);
		c.setLayout(null);
		la = new JLabel();
		la.setBounds(10,10,10,10);
		c.add(la);
		la.setOpaque(true);
		la.setBackground(Color.pink);
		
		c.setFocusable(true);
		c.requestFocus();
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new KeyTest02();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		int x,y;
		if(keyCode == 37) {
			x= la.getX();
			y = la.getY();
			la.setLocation(x-10, y);
		}
		else if(keyCode == 38) {
			x= la.getX();
			y = la.getY();
			la.setLocation(x, y-10);
		}else if(keyCode == 39) {
			x= la.getX();
			y = la.getY();
			la.setLocation(x+10, y);
		}
		else if(keyCode == 40) {
			x= la.getX();
			y = la.getY();
			la.setLocation(x, y+10);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
