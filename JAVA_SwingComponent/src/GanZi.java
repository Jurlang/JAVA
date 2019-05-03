import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GanZi extends JFrame {
	JPanel p_input, p_result;
	JLabel idLa, telLa, reLa, pwLa;
	JTextField idTf, pwTf, telTf;
	JCheckBox[] cb = new JCheckBox[3];
	String[] cbStr = { "���ͳ�", "����", "SNS" };
	JTextArea ta;
	JButton join, cancel;

	GanZi() {
		this.setTitle("Hello");
		this.setSize(600, 600);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));

		p_input = new JPanel();
		p_input.setLayout(new GridLayout(7, 2));
		p_result = new JPanel();
		p_result.setLayout(new BorderLayout());

		idLa = new JLabel("���̵�    ");
		idTf = new JTextField(10);
		pwLa = new JLabel("��й�ȣ ");
		pwTf = new JTextField(10);
		telLa = new JLabel("����ó    ");
		telTf = new JTextField(10);
		reLa = new JLabel("��õ       ");
		JLabel nLa1 = new JLabel();
		JLabel nLa2 = new JLabel();
		for (int i = 0; i < cb.length; i++)
			cb[i] = new JCheckBox(cbStr[i]);
		ta = new JTextArea(28, 28);
		JLabel x = new JLabel("���");
		join = new JButton("����");
		cancel = new JButton("���");

		c.add(p_input);
		c.add(p_result);

		p_input.add(idLa);
		p_input.add(idTf);
		p_input.add(pwLa);
		p_input.add(pwTf);
		p_input.add(telLa);
		p_input.add(telTf);
		p_input.add(reLa);
		p_input.add(cb[0]);
		p_input.add(nLa1);
		p_input.add(cb[1]);
		p_input.add(nLa2);
		p_input.add(cb[2]);
		p_input.add(join);
		p_input.add(cancel);

		p_result.add(x, BorderLayout.NORTH);
		p_result.add(new JScrollPane(ta));

		join.addActionListener(new MyActionListener());
		cancel.addActionListener(new MyActionListener());

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] ar) {
		new GanZi();
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if (str.contentEquals("����")) {
				String astr = "";
				astr += idTf.getText() + " ";
				astr += pwTf.getText() + " ";
				astr += telTf.getText() + " ";
				for (int i = 0; i < cb.length; i++) {
					if (cb[i].isSelected())
						astr += cb[i].getText() + " ";
				}
				ta.append(astr.trim() + "\n");
				init();
			} else if (str.contentEquals("���")) {
				init();
			}
		}

		private void init() {
			idTf.setText("");
			pwTf.setText("");
			telTf.setText("");
			for (int i = 0; i < cb.length; i++) {
				cb[i].setSelected(false);
			}
		}
	}
}