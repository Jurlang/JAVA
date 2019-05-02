package Event_Program;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AdapterTest extends JFrame {
	JLabel la;Container c;
	AdapterTest(){
		setTitle("이벤트 처리");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		la = new JLabel("Hello");
		la.setBounds(10,10,50,20);

		c.add(la);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
		});
		setVisible(true);
	}
	
	public static void main(String ar[]) {
		new AdapterTest();
	}
}
