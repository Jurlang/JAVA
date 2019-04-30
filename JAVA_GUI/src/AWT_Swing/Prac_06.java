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
//			l.setLocation(x, y);	// Lable의 위치 지정
//			l.setSize(10,10);		// Lable의 크기 지정
			l.setBounds(x,y,10,10); // Lable의 위치 크기 지정.
			l.setOpaque(true);	// Label의 기본 배경은 투명으로 설정 , 색을 지정해줘도 안보인다.
								// Opaque는 투명인 배경을 색이 보이게 만들어주는 메소드.
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
