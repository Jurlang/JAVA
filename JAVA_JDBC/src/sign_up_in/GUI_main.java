package sign_up_in;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GUI_main extends JFrame {

	private JPanel contentPane;
	private JTextArea main_taShow;
	private JButton main_btnSon;
	private JButton main_btnSin;
	private JButton main_btnShow;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUI_main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		Mainlistener l = new Mainlistener(this);
		
		JPanel main_btnPanel = new JPanel();
		contentPane.add(main_btnPanel);
		main_btnPanel.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panel = new JPanel();
		main_btnPanel.add(panel);
		panel.setLayout(null);

		main_btnSon = new JButton("\uD68C\uC6D0\uAC00\uC785");
		main_btnSon.setBounds(12, 10, 189, 64);
		main_btnSon.addActionListener(l);
		panel.add(main_btnSon);

		JPanel panel_1 = new JPanel();
		main_btnPanel.add(panel_1);
		panel_1.setLayout(null);

		main_btnSin = new JButton("\uB85C\uADF8\uC778");
		main_btnSin.setBounds(12, 10, 189, 64);
		main_btnSin.addActionListener(l);
		panel_1.add(main_btnSin);

		JPanel panel_2 = new JPanel();
		main_btnPanel.add(panel_2);
		panel_2.setLayout(null);

		main_btnShow = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		main_btnShow.setBounds(12, 10, 189, 64);
		panel_2.add(main_btnShow);

		JPanel main_taPanel = new JPanel();
		contentPane.add(main_taPanel);
		main_taPanel.setLayout(null);

		main_taShow = new JTextArea();
		main_taShow.setBounds(12, 10, 189, 233);

		JScrollPane scrollPane = new JScrollPane(main_taShow);
		scrollPane.setBounds(12, 10, 189, 233);
		main_taPanel.add(scrollPane);

		setVisible(true);

	}

	class Mainlistener implements ActionListener {
		GUI_main frame;

		Mainlistener(GUI_main frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "회원가입":
				frame.setVisible(false);
				new GUI_son();
				break;
			case "로그인":
				frame.setVisible(false);
				new GUI_sin();
				break;
			case "전체보기":
			}
		}
	}

}
