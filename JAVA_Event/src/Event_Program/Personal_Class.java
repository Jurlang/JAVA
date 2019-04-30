package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * ���� Ŭ������ �̺�Ʈ ó�� �����
 */

@SuppressWarnings("serial")
public class Personal_Class extends JFrame {
	public Personal_Class() {
		setTitle("Action �̺�Ʈ ������ ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action �̺�Ʈ ������ �ޱ�
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Personal_Class();
	}
}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if (b.getText().contentEquals("Action")) { // ��ư�� ���ڿ��� "Action"���� ��
			b.setText("�׼�");
			b.setBackground(Color.white);
		}

		else
			b.setText("Action");
	}

}
