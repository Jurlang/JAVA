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
	private String[] names = { "���", "��", "ü��" };
	private JLabel sumLabel;

	CheckBoxEventMethod() {
		this.setTitle("üũ�ڽ� �̺�Ʈ �޼ҵ�");
		this.setSize(250, 200);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000"));

		MyItemListener listener = new MyItemListener(); // ������ ��ȯ
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // üũ�ڽ� ������ ���ÿ� ���ڿ� �Է�
			fruits[i].setBorderPainted(true); // üũ�ڽ� �׵θ� ����
			c.add(fruits[i]); // �����̳ʿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); // üũ�ڽ����� ������ ���
		}
		sumLabel = new JLabel("���� 0 �� �Դϴ�.");
		c.add(sumLabel);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String ar[]) {
		new CheckBoxEventMethod();
	}

	class MyItemListener implements ItemListener { // üũ�ڽ� ������
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) { // üũ�ڽ��� üũ �̺�Ʈ
			if (e.getStateChange() == ItemEvent.SELECTED) { // üũ�� �ȴٸ�
				if (e.getItem() == fruits[0]) // ������(���ڿ��� ����)�� ��µ� �װ��� fruits[0]�̸�
					sum += 100;
				else if (e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			} else { // üũ�� Ǯ����
				if (e.getItem() == fruits[0])
					sum -= 100;
				else if (e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("���� " + sum + " �� �Դϴ�.");
		}

	}

}
