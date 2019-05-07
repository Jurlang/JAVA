import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class TableTest extends JFrame {
	JTextField tfName, tfRow;
	JTable table;

	TableTest() {
		this.setTitle("���̺� �׽�Ʈ");
		this.setSize(300, 300);

		// Container c = getContentPane();
		// c.setLayout(new FlowLayout());

		String[] colName = { "�̸�", "����", "����", "����" };
		Object[][] data = { { "��ö��", 20, "��", "ȸ���" }, { "�̼���", 21, "��", "�л�" }, { "������", 26, "��", "ȸ���" },
				{ "a", 1, "a", "a" }, { "b", 2, "b", "b" }, { "c", 3, "c", "c" }, { "d", 4, "d", "d" },
				{ "e", 5, "e", "e" }, { "f", 6, "f", "f" } };

		table = new JTable(data, colName);
		JScrollPane sp = new JScrollPane(table);

		tfName = new JTextField(5);
		tfRow = new JTextField(5);

		JButton getBtn = new JButton("get");
		getBtn.addActionListener(new MyListener());

		JButton setBtn = new JButton("set");
		setBtn.addActionListener(new MyListener());

		JPanel p = new JPanel();

		p.add(tfName);
		p.add(tfRow);
		p.add(getBtn);
		p.add(setBtn);

//		sp.setPreferredSize(new Dimension(200,100)); //ũ�������ش�. Dimension(����,����)
		add(sp);
		add(p, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();

			TableModel model = table.getModel();
			int row = Integer.parseInt(tfRow.getText());

			if (str.contentEquals("set")) {
				String name = tfName.getText();
				model.setValueAt(name, row, 0);
				tfName.setText("");
				tfRow.setText("");
			} else if (str.contentEquals("get")) {
				String name = (String) model.getValueAt(row, 0);
				tfName.setText(name);
			}
		}

	}

	public static void main(String[] args) {
		new TableTest();
	}

}
