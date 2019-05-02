package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class KeyTest extends JFrame implements KeyListener{
	private JLabel[] keyMessage;
	
	KeyTest(){
		this.setTitle("key 이벤트 처리");
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(this);
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");
		
		for(int i=0;i<keyMessage.length;i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.yellow);
			
		}
		
		c.setFocusable(true);
		c.requestFocus();
		
		this.setVisible(true);
	}
	
	public static void main(String ar[]) {
		new KeyTest();
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		int keyCode = e.getKeyCode();
//		int keyChar = e.getKeyChar();
//		//String keyStr = e.getKeyText(keyCode);
//		keyMessage[0].setText(keyCode + "");
//		keyMessage[1].setText(keyChar + "");
//		//keyMessage[2].setText(keyStr+"");
	}

	@SuppressWarnings("static-access")
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		int keyChar = e.getKeyChar();
		String keyStr = e.getKeyText(keyCode);
		keyMessage[0].setText(keyCode + "");
		keyMessage[1].setText(keyChar + "");
		keyMessage[2].setText(keyStr+"");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		int keyCode = e.getKeyCode();
//		int keyChar = e.getKeyChar();
//		String keyStr = e.getKeyText(keyCode);
//		keyMessage[0].setText(keyCode + "");
//		keyMessage[1].setText(keyChar + "");
//		keyMessage[2].setText(keyStr+"");
	}
}
