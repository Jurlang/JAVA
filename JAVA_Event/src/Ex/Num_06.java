package Ex;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Num_06 extends JFrame{
	JLabel la;
	Num_06(){
		this.setTitle("클릭 연습용 응용프로그램");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		la = new JLabel("C");
		la.setBounds(100,100,10,10);
		
		c.add(la);
		
		la.addMouseListener(new MyMouseListener());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] ar) {
		new Num_06();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
		}

		@Override
		public void mouseMoved(MouseEvent e) {
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			int x =(int)(Math.random()*200);
			int y =(int)(Math.random()*250);
			System.out.println(x + " " + y);
			la.setLocation(x,y);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		

	}
}
