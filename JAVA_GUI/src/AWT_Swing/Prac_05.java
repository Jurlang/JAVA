package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Prac_05 extends JFrame{
	Prac_05(){
		
		Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan,
			Color.blue, Color.magenta, Color.gray, Color.pink, Color.lightGray, Color.white,
			Color.darkGray, Color.black, Color.yellow, Color.blue, Color.magenta};
		
		setTitle("4x4 Color Frame");
		setSize(400,400);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		for(int i=0;i<16;i++) {
			JLabel l = new JLabel(""+(i+1));
			l.setOpaque(true);
			l.setBackground(color[i]);
			c.add(l);
		}
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac_05();
	}

}
