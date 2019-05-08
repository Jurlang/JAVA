package sign_up_in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					GUI_son frame = new GUI_son();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_son() {
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
		
		setVisible(true);
	}
}
