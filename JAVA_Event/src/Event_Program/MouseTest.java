package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MouseTest extends JFrame
			implements MouseListener{
	JLabel la;Container c;
	MouseTest(){
		setTitle("이벤트 처리");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		la = new JLabel("클릭해봐");
		la.setSize(51,20);
		la.setLocation(10,10);
		c.add(la);
		c.addMouseListener(this);
		setVisible(true);
	}
	
	public static void main(String ar[]) {
		new MouseTest();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x,y);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.red);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.yellow);
	}
}
