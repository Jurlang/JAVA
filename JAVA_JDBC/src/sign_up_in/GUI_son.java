package sign_up_in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GUI_son extends JFrame {

	private JPanel contentPane;
	private JTextField son_tfId;
	private JTextField son_tfPw;
	private JTextField son_tfName;
	private JTextField son_tfAge;
	private JTextField son_tfTel;
	private JButton son_btnOk;
	private JButton son_btnNo;
	private JButton son_btnCan;
	private GUI_main mainFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//GUI_son frame = new GUI_son(new GUI_main());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_son(GUI_main mainFrame) {
		
		this.mainFrame = mainFrame;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel son_laPanel = new JPanel();
		son_laPanel.setBounds(12, 10, 163, 289);
		contentPane.add(son_laPanel);
		son_laPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel son_laId = new JLabel("\uC544 \uC774  \uB514 :");
		son_laPanel.add(son_laId);
		son_laId.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel son_laPw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		son_laPanel.add(son_laPw);
		son_laPw.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel son_laName = new JLabel("\uC774      \uB984 :");
		son_laPanel.add(son_laName);
		son_laName.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel son_laAge = new JLabel("\uB098      \uC774 :");
		son_laPanel.add(son_laAge);
		son_laAge.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel son_laTel = new JLabel("\uC804\uD654\uBC88\uD638 :");
		son_laPanel.add(son_laTel);
		son_laTel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel son_tfPanel = new JPanel();
		son_tfPanel.setBounds(174, 10, 320, 289);
		contentPane.add(son_tfPanel);
		son_tfPanel.setLayout(new GridLayout(5, 2, 10, 15));

		son_tfId = new JTextField();
		son_tfPanel.add(son_tfId);
		son_tfId.setColumns(10);

		son_tfPw = new JTextField();
		son_tfPanel.add(son_tfPw);
		son_tfPw.setColumns(10);

		son_tfName = new JTextField();
		son_tfPanel.add(son_tfName);
		son_tfName.setColumns(10);

		son_tfAge = new JTextField();
		son_tfPanel.add(son_tfAge);
		son_tfAge.setColumns(10);

		son_tfTel = new JTextField();
		son_tfPanel.add(son_tfTel);
		son_tfTel.setColumns(10);

		JPanel son_btnPanel = new JPanel();
		son_btnPanel.setBounds(12, 309, 482, 47);
		contentPane.add(son_btnPanel);
		son_btnPanel.setLayout(new GridLayout(0, 3, 15, 15));

		son_btnOk = new JButton("\uAC00\uC785");
		son_btnPanel.add(son_btnOk);

		son_btnNo = new JButton("\uCDE8\uC18C");
		son_btnPanel.add(son_btnNo);

		son_btnCan = new JButton("\uB2EB\uAE30");
		son_btnPanel.add(son_btnCan);
		
		SonListener l = new SonListener(this);
		son_btnOk.addActionListener(l);
		son_btnNo.addActionListener(l);
		son_btnCan.addActionListener(l);
		
		setVisible(true);
	}

	class SonListener implements ActionListener {
		GUI_son frame;
		
		SonListener(GUI_son frame){
			this.frame = frame;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.contentEquals("가입")) {
				String id = son_tfId.getText();
				String pw = son_tfPw.getText();
				String name = son_tfName.getText();
				int age = Integer.parseInt(son_tfAge.getText());
				String tel = son_tfTel.getText();
				Member m = new Member(id,pw,name,age, tel);
				DBConn conn = DBConn.getInstance();
				conn.insert(m);
				init();
			} else if (cmd.contentEquals("취소")) {
				init();
			} else if (cmd.contentEquals("닫기")) {
				frame.dispose();
				mainFrame.setVisible(true);
			}

		}
		private void init() {
			son_tfId.setText("");
			son_tfPw.setText("");
			son_tfName.setText("");
			son_tfAge.setText("");
			son_tfTel.setText("");
		}
	}
}
