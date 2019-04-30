package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Grid_Layout extends JFrame{
	Grid_Layout(){
		setTitle("GridLayout");
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,3,5,5));	// 생성자 매개변수 ( 3x3 만들고, 위아래 간격 5,5 )
		for(int i=0;i<9;i++) {
			JButton b = new JButton("Button " + (i+1));
			c.add(b);
		}
		c.setBackground(Color.BLACK);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid_Layout();
	}
	
}
