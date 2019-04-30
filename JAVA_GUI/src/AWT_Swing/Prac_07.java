package AWT_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Prac_07 extends JFrame{
	Prac_07(){
		this.setTitle("계산기프레임");
		this.setSize(300,300);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,4,5,5));
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
	
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);
		
		JLabel p1_l = new JLabel("수식입력");
		JTextField p1_tf= new JTextField(20);
		p1.setBackground(Color.gray);
		p1.add(p1_l);
		p1.add(p1_tf);
		
		JButton bt[] = new JButton[16];
		String str[] = {"CE", "계산", "+","-","X","/"};
		for(int i=0;i<10;i++) {
			bt[i] = new JButton(""+i);
			p2.add(bt[i]);
		}
		for(int i=10;i<str.length+10;i++) {
			bt[i] = new JButton(str[i-10]);
			if(i > 11)
				bt[i].setBackground(Color.cyan);
			p2.add(bt[i]);
			
		}
		
		
		JLabel p3_l = new JLabel("계산결과");
		JTextField p3_tf = new JTextField(20);
		p3.setBackground(Color.yellow);
		p3.add(p3_l);
		p3.add(p3_tf);

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac_07();
	}

}
