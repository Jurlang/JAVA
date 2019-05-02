package Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Num_01_02 extends JFrame{
	JLabel la;
	Container c;
	Num_01_02(){
		this.setTitle("마우스 올리기 내리기");
		this.setSize(300,300);
		
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.green);
		la = new JLabel("Love");
		la.setBounds(150,110,60,50);
		c.add(la);
		la.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Num_01_02();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.yellow);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.green);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.green);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("사랑해");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("Love");
		}
		
	}
}
