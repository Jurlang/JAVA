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
		this.setTitle("테이블 테스트 2");
		this.setSize(500, 300);

		String[] colName = { "이름", "나이", "성별", "직업" };
		DefaultTableModel dtm = new DefaultTableModel(colName, 0); // dtm을 colName 구성으로 만든다.
		table = new JTable(dtm); // dtm 이 이미 모델에 대한 구성을 들고있다.

		JPanel p = new JPanel();
		for (int i = 0; i < tf.length; i++) {
			p.add(new JLabel(colName[i]));
			tf[i] = new JTextField(3);
			p.add(tf[i]);
		}

		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new MyListener());
		JButton btnRem = new JButton("삭제");
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
			if (cmd.contentEquals("추가")) {
				Object[] obj = new Object[tf.length];
				for(int i=0; i<tf.length; i++) {
					obj[i] = tf[i].getText();
				}
				DefaultTableModel dtm = (DefaultTableModel)table.getModel();
				dtm.addRow(obj);
			} else if (cmd.contentEquals("삭제")) {
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
