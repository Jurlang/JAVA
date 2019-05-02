package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MouseTest02 extends JFrame{
	JLabel la;
	Container c;
	MouseTest02(){
		setTitle("이벤트 처리");
		setSize(316,340);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel("No Mouse Event");
		c.add(la);
		MyMouseListener l = new MyMouseListener();
		c.addMouseListener(l);
		c.addMouseMotionListener(l);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseTest02();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseDregged("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseMoved("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.pink);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.magenta);

		}
		
	}
	
	
}
