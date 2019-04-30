package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Flow_Layout extends JFrame {

	Flow_Layout() {

		this.setTitle("MyFrame"); // 제목 설정
		this.setSize(300, 400); // 크기설정

		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 100, 20)); // FlowLayout ( 순차적 레이아웃 배치 ) 설정
		c.setBackground(Color.BLACK); // 배경화면 설정

		JButton bt[] = new JButton[10];

		for (int i = 0; i < 10; i++) {
			bt[i] = new JButton("Button " + i);
			c.add(bt[i]);
		}

		this.setVisible(true); // 보이냐 마느냐 설정
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 누를때 프로세스 종료
	}

	public static void main(String[] args) {
		new Flow_Layout();

	}

}
