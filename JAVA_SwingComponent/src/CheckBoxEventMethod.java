import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CheckBoxEventMethod extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "사과", "배", "체리" };
	private JLabel sumLabel;

	CheckBoxEventMethod() {
		this.setTitle("체크박스 이벤트 메소드");
		this.setSize(250, 200);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000"));

		MyItemListener listener = new MyItemListener(); // 리스너 소환
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // 체크박스 생성과 동시에 문자열 입력
			fruits[i].setBorderPainted(true); // 체크박스 테두리 설정
			c.add(fruits[i]); // 컨테이너에 체크박스 삽입
			fruits[i].addItemListener(listener); // 체크박스마다 리스너 등록
		}
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String ar[]) {
		new CheckBoxEventMethod();
	}

	class MyItemListener implements ItemListener { // 체크박스 리스너
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) { // 체크박스가 체크 이벤트
			if (e.getStateChange() == ItemEvent.SELECTED) { // 체크가 된다면
				if (e.getItem() == fruits[0]) // 아이템(문자열로 추정)을 얻는데 그것이 fruits[0]이면
					sum += 100;
				else if (e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			} else { // 체크가 풀리면
				if (e.getItem() == fruits[0])
					sum -= 100;
				else if (e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("현재 " + sum + " 원 입니다.");
		}

	}

}
