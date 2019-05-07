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
		this.setTitle("테이블 테스트");
		this.setSize(300, 300);

		// Container c = getContentPane();
		// c.setLayout(new FlowLayout());

		String[] colName = { "이름", "나이", "성별", "직업" };
		Object[][] data = { { "김철수", 20, "남", "회사원" }, { "이순희", 21, "여", "학생" }, { "박지영", 26, "여", "회사원" },
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

		JButton allBtn = new JButton("all");
		allBtn.addActionListener(new MyListener());
		JPanel p = new JPanel();

		p.add(tfName);
		p.add(tfRow);
		p.add(getBtn);
		p.add(setBtn);
		p.add(allBtn);

//		sp.setPreferredSize(new Dimension(200,100)); //크기정해준다. Dimension(가로,세로)
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

			if (str.contentEquals("set")) {
				String name = tfName.getText();
				int row = Integer.parseInt(tfRow.getText());
				model.setValueAt(name, row, 0);
				tfName.setText("");
				tfRow.setText("");
			} else if (str.contentEquals("get")) {
				int row = Integer.parseInt(tfRow.getText());
				String name = (String) model.getValueAt(row, 0);
				tfName.setText(name);
			} else if (str.contentEquals("all")) {
				int rowNum = model.getRowCount();
				int colNum = model.getColumnCount();
				for (int col = 0; col < colNum; col++) {
					System.out.print(model.getColumnName(col) + "\t");
				}
				System.out.println();
				for (int i = 0; i < rowNum; i++) {
					for (int j = 0; j < colNum; j++) {
						System.out.print(model.getValueAt(i, j) + "\t");
					}
					System.out.println();
				}
			}
		}

	}

	public static void main(String[] args) {
		new TableTest();
	}

}
