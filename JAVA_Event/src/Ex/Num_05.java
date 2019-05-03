package Ex;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Num_05 extends JFrame{
	JLabel la;
	Num_05(){
		this.setTitle("+,-키로 폰트 크기 조절");
		this.setSize(300,300);
		
		Container c = getContentPane();
		la = new JLabel("Love");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		c.setFocusable(true);
		c.requestFocus();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Num_05();
	}
	class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// 107 + 109 -
			Font f = la.getFont();
			int size = f.getSize();
			int keyCode = e.getKeyCode();
			if(keyCode == 107)
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			else if(keyCode == 109)
				if(size>5)
					la.setFont(new Font("Arial", Font.PLAIN, size-5));				
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
		
	}

}
