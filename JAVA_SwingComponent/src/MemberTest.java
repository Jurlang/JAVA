import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MemberTest extends JFrame {
	JTextField tfName, tfTel;
	JRadioButton rbM, rbF;
	JCheckBox[] cb = new JCheckBox[4];
	String[] cbStr = { "등신", "병신", "장신", "조신" };
	JTextArea ta;

	MemberTest() {
		setTitle("회원등록");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		tfName = new JTextField(10);
		p1.add(new JLabel("이름 :     "));
		p1.add(tfName);

		tfTel = new JTextField(10);
		p2.add(new JLabel("연락처 : "));
		p2.add(tfTel);

		rbM = new JRadioButton("남자");
		rbF = new JRadioButton("여자");
		ButtonGroup g = new ButtonGroup();
		g.add(rbM);
		g.add(rbF);
		p3.add(new JLabel("성별 : "));
		p3.add(rbM);
		p3.add(rbF);

		p4.add(new JLabel("취미 : "));
		for (int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(cbStr[i]);
			p4.add(cb[i]);
		}

		JButton btnAdd = new JButton("추가");
		JButton btnCan = new JButton("취소");
		p5.add(btnAdd);
		p5.add(btnCan);

		ta = new JTextArea(8, 25);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		c.add(new JScrollPane(ta));
		btnAdd.addActionListener(new MyActionListener());
		btnCan.addActionListener(new MyActionListener());
		setVisible(true);

	}

	public static void main(String[] args) {
		new MemberTest();
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if (str.contentEquals("추가")) {
				String acstr = "";
				acstr += tfName.getText() + " ";
				acstr += tfTel.getText() + " ";
				if (rbM.isSelected())
					acstr += rbM.getText() + " ";
				else if (rbF.isSelected())
					acstr += rbF.getText() + " ";
				for (int i = 0; i < cb.length; i++) {
					if (cb[i].isSelected())
						acstr += cb[i].getText() + " ";
				}
				ta.append(acstr.trim() + "\n");
				init();
			} else if (str.contentEquals("취소")) {
				init();
			}
		}

		private void init() {
			tfName.setText("");
			tfTel.setText("");
			rbM.setSelected(true);
			for (int i = 0; i < cb.length; i++) {
				cb[i].setSelected(false);
			}
		}
	}
}
