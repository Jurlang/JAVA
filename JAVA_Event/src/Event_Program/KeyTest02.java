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
	int x, y;
	KeyTest02(){
		this.setTitle("≈∞∫∏µÂ ¿Ãµø");
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(this);
		c.setLayout(null);
		la = new JLabel();
		x = 10;
		y = 10;
		la.setBounds(x,y,10,10);
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
//		<<<<<<<<<<<<≥ª∞° ¬ß ƒ⁄µÂ>>>>>>>>>>>>>>>>
//		int keyCode = e.getKeyCode();
//		if(keyCode == 37) {
//			x= la.getX();
//			y = la.getY();
//			la.setLocation(x-10, y);
//		}
//		else if(keyCode == 38) {
//			x= la.getX();
//			y = la.getY();
//			la.setLocation(x, y-10);
//		}else if(keyCode == 39) {
//			x= la.getX();
//			y = la.getY();
//			la.setLocation(x+10, y);
//		}
//		else if(keyCode == 40) {
//			x= la.getX();
//			y = la.getY();
//			la.setLocation(x, y+10);
//		}
//		
//		<<<<<<<<<<<<Ω‹¿Ã ¬ß ƒ⁄µÂ>>>>>>>>>>>>>>>>
		int keyCode = e.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_UP:
			if(y-10<0)
				y=0;
			else
				y-=10;
			break;
		case KeyEvent.VK_DOWN:
			if(y+10 > 250)
				y=250;
			else
				y+=10;
			break;
		case KeyEvent.VK_LEFT:
			if(x-10<0)
				x = 0;
			else
				x-=10;
			break;
		case KeyEvent.VK_RIGHT:
			if(x+10>250)
				x = 250;
			else
				x += 10;
			break;
		}
		la.setLocation(x, y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
