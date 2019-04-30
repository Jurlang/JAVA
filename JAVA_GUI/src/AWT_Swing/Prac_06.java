package AWT_Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Prac_06 extends JFrame{
	Prac_06(){
		this.setTitle("Random Labels");
		this.setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<20;i++) {
			JLabel l = new JLabel();
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			l.setBackground(Color.BLUE);
//			l.setLocation(x, y);	// Lable�� ��ġ ����
//			l.setSize(10,10);		// Lable�� ũ�� ����
			l.setBounds(x,y,10,10); // Lable�� ��ġ ũ�� ����.
			l.setOpaque(true);	// Label�� �⺻ ����� �������� ���� , ���� �������൵ �Ⱥ��δ�.
								// Opaque�� ������ ����� ���� ���̰� ������ִ� �޼ҵ�.
			c.add(l);
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prac_06();
	}

}
