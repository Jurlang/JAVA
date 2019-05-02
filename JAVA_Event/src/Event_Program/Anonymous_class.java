package Event_Program;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * �͸� Ŭ������ �̺�Ʈ ó�� �����
 */

@SuppressWarnings("serial")
public class Anonymous_class extends JFrame{
	Anonymous_class(){
		setTitle("Action �̺�Ʈ ������ ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
				if (b.getText().contentEquals("Action")) { // ��ư�� ���ڿ��� "Action"���� ��
					b.setText("�׼�");
					b.setBackground(Color.white);
				}
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		}); // Action �̺�Ʈ ������ �ޱ�

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Anonymous_class();
	}

}
