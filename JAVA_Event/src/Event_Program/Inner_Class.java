package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 내부 클래스로 이벤트 처리 만들기
 */

@SuppressWarnings("serial")
public class Inner_Class extends JFrame{
	public Inner_Class() {
		setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 달기
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
			if (b.getText().contentEquals("Action")) { // 버튼의 문자열이 "Action"인지 비교
				b.setText("액션");
				b.setBackground(Color.white);
			}
			else
				b.setText("Action");
			Inner_Class.this.setTitle(b.getText());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Inner_Class();
	}

}