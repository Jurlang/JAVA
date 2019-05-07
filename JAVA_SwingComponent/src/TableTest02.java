import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class TableTest02 extends JFrame {
	JTextField[] tf = new JTextField[4];
	JTable table;
	int row = -1;
	
	TableTest02() {
		this.setTitle("���̺� �׽�Ʈ 2");
		this.setSize(500, 300);

		String[] colName = { "�̸�", "����", "����", "����" };
		DefaultTableModel dtm = new DefaultTableModel(colName, 0); // dtm�� colName �������� �����.
		table = new JTable(dtm); // dtm �� �̹� �𵨿� ���� ������ ����ִ�.

		JPanel p = new JPanel();
		for (int i = 0; i < tf.length; i++) {
			p.add(new JLabel(colName[i]));
			tf[i] = new JTextField(3);
			p.add(tf[i]);
		}

		JButton btnAdd = new JButton("�߰�");
		btnAdd.addActionListener(new MyListener());
		JButton btnRem = new JButton("����");
		btnRem.addActionListener(new MyListener());

		p.add(btnAdd);
		p.add(btnRem);

		add(p, BorderLayout.SOUTH);
		add(new JScrollPane(table));

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.contentEquals("�߰�")) {
				Object[] obj = new Object[tf.length];
				for(int i=0; i<tf.length; i++) {
					obj[i] = tf[i].getText();
				}
				DefaultTableModel dtm = (DefaultTableModel)table.getModel();
				dtm.addRow(obj);
			} else if (cmd.contentEquals("����")) {
				row = table.getSelectedRow();
				if(row == -1) return ;
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.removeRow(row);
			}
		}
	}

	public static void main(String[] args) {
		new TableTest02();
	}

}
