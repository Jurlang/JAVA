package sign_up_in;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class GUI_sin extends JFrame {

	private JPanel contentPane;
	private JTextField sin_tfPw;
	private JTextField sin_tfId;
	private JButton sin_btnOk;
	private JButton sin_btnCan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					GUI_sin frame = new GUI_sin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_sin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel sin_laPanel = new JPanel();
		sin_laPanel.setBounds(19, 44, 124, 76);
		contentPane.add(sin_laPanel);
		sin_laPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel sin_laId = new JLabel("\uC544 \uC774  \uB514 :");
		sin_laId.setHorizontalAlignment(SwingConstants.CENTER);
		sin_laPanel.add(sin_laId);
		
		JLabel sin_laPw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		sin_laPw.setHorizontalAlignment(SwingConstants.CENTER);
		sin_laPanel.add(sin_laPw);
		
		JPanel sin_tfPanel = new JPanel();
		sin_tfPanel.setBounds(155, 44, 269, 76);
		contentPane.add(sin_tfPanel);
		sin_tfPanel.setLayout(new GridLayout(2, 1, 0, 15));
		
		sin_tfId = new JTextField();
		sin_tfPanel.add(sin_tfId);
		sin_tfId.setColumns(10);
		
		sin_tfPw = new JTextField();
		sin_tfPanel.add(sin_tfPw);
		sin_tfPw.setColumns(10);
		
		JPanel sin_btnPanel = new JPanel();
		sin_btnPanel.setBounds(19, 140, 405, 42);
		contentPane.add(sin_btnPanel);
		sin_btnPanel.setLayout(new GridLayout(1, 2, 15, 0));
		
		sin_btnOk = new JButton("\uB85C\uADF8\uC778");
		sin_btnPanel.add(sin_btnOk);
		
		sin_btnCan = new JButton("\uB2EB\uAE30");
		sin_btnPanel.add(sin_btnCan);
		
		setVisible(true);

	}

}
