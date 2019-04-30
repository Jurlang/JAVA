package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * <<<<<<<<<< 프레임 예제 1번 >>>>>>>>>>
 * 		프레임 하나를 만들어보자.
 * 		컨테이너를 생성하고 버튼 3개를 만들어보자.
 * 		실행하면 배치가 제대로 설정되어있지 않기때문에
 * 		마지막에 선언된 ignore 버튼만 크게 보인다.
 * 		FlowLayout 선언으로 순차적 배치 설정
 * 		배경 색상 지정하기
 * 		Container 지정해줄때와 안해줄때의 차이
 * 			->	요소 입력 외에 이미지 및 배경 지정 등 여러가지 일에 제한적.
 */

@SuppressWarnings("serial")
public class All_EX extends JFrame {

	All_EX() {
		// super("Hello"); // 제목 설정
		this.setTitle("MyFrame"); // 제목 설정
		this.setSize(300, 400); // 크기설정

		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout()); // FlowLayout ( 순차적 레이아웃 배치 ) 설정
//		c.setLayout(new BorderLayout());			
//		c.setLayout(new GridLayout());
//		c.setLayout(new CardLayout());

		c.setBackground(Color.BLACK); // 배경화면 설정

//		this.setLayout(new FlowLayout());
//		this.setBackground(Color.red);

		JButton ok_btn = new JButton("확인"); // 버튼 생성
		JButton ca_btn = new JButton("취소"); // "
		JButton ig_btn = new JButton("무시"); // "
		JButton ok_btn1 = new JButton("확인1"); // 버튼 생성
		JButton ca_btn1 = new JButton("취소1"); // "
		JButton ig_btn1 = new JButton("무시1"); // "

//		add(ok_btn);									// 컨테이너에 요소 삽입 ( 요소 삽입만 할 때 )
//		add(ca_btn);									// 		"
//		add(ig_btn);									// 		"

		c.add(ok_btn); // 컨테이너에 요소 삽입 ( 배경 및 다른 부가적인 요소 설정할 때 )
		c.add(ca_btn); // "
		c.add(ig_btn); // "
		c.add(ok_btn1); // 컨테이너에 요소 삽입 ( 배경 및 다른 부가적인 요소 설정할 때 )
		c.add(ca_btn1); // "
		c.add(ig_btn1); // "

//		c.add(ok_btn, BorderLayout.SOUTH);				// Border Layout 에서 위치 지정해주기
//		c.add(ca_btn, BorderLayout.NORTH);				// 		"
//		c.add(ig_btn, BorderLayout.WEST);				// 		"
//		c.add(ok_btn1, BorderLayout.EAST);				// 		"

//		JPanel p1 = new JPanel();						// 레이아웃 위치 지정
//		JPanel p2 = new JPanel();						// Container 안에 Panel 지정
//		JPanel p3 = new JPanel();						// Border로 위치 잡아주기

//		p1.add(ok_btn);									// 		"
//		p1.add(ca_btn);									// 		"
//		
//		p2.add(ig_btn);									// 		"
//		p2.add(ok_btn1);								// 		"
//		
//		p3.add(ca_btn1);								// 		"
//		p3.add(ig_btn1);								// 		"
//		
//		c.add(p3);										// 		"
//		c.add(p2,BorderLayout.SOUTH);					// 		"
//		c.add(p1, BorderLayout.NORTH);					// 		"

		this.setVisible(true); // 보이냐 마느냐 설정
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 누를때 프로세스 종료

	}

	public static void main(String[] args) {
		new All_EX();
	}
}
