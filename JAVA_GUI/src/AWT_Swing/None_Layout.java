package AWT_Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class None_Layout extends JFrame{
	None_Layout(){
		this.setTitle("None Layout");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		JLabel la = new JLabel("Hello Press Buttons!");
		la.setLocation(130,50); // X좌표 130, Y좌표 50
		la.setSize(200, 20); // 가로 200 높이 20
		c.add(la);
		
		for(int i=1;i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15); // 버튼 위치 지정 X, Y
			b.setSize(50, 20); // 버튼 크기 가로, 세로
			c.add(b);
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new None_Layout();
	}

}
