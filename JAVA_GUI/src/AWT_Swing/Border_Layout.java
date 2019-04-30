package AWT_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Border_Layout extends JFrame {

	Border_Layout() {
		this.setTitle("MyFrame"); // 제목 설정
		this.setSize(300, 400); // 크기설정

		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new BorderLayout(50, 15)); // BorderLayout ( 상하좌우 센터 ) 설정 , 생성자 매개변수 ( 양옆, 위아래 ) 띄우기
		c.setBackground(Color.BLACK); // 배경화면 설정

		c.add(new JButton("A"), BorderLayout.CENTER);
		c.add(new JButton("B"), BorderLayout.NORTH);
		c.add(new JButton("C"), BorderLayout.SOUTH);
		c.add(new JButton("D"), BorderLayout.EAST);
		c.add(new JButton("E"), BorderLayout.WEST);

		this.setVisible(true); // 보이냐 마느냐 설정
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 누를때 프로세스 종료
	}

	public static void main(String[] args) {
		new Border_Layout();
	}
}