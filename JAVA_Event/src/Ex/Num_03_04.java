package Ex;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Num_03_04 extends JFrame{
	JLabel la;
	boolean check = true;
	Num_03_04(){
		this.setTitle("Left 키로 문자열 교체");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(null);
		la = new JLabel("Love Java");
		la.setBounds(100,100,90,60);
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		c.setFocusable(true);
		c.requestFocus();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Num_03_04();
	}
	class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getKeyCode() + " check : " + check);
			String str = la.getText();
			
			if(e.getKeyCode() == 37) {

				//				3번
//				String s = str.substring(0,1);
//				str = str.substring(1) + s;
//				System.out.println(s + " str : " + str);
//				la.setText(str);

				//				4번				
				StringBuffer s = new StringBuffer(str);
				s.reverse();
				str = new String(s);
				la.setText(str);
				check = false;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}
}
