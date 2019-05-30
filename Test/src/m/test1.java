package m;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

//안바꿨지롱 >_<
@SuppressWarnings("serial")
public class test1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600); // x좌표, y좌표, 너비, 높이
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel lp = new JPanel();
		lp.setBounds(0, 0, 434, 561);
		lp.setBackground(Color.WHITE);
		contentPane.add(lp);
		lp.setLayout(null);

		JButton btnRegi = new JButton("\uD68C\uC6D0\uAC00\uC785", new ImageIcon("images/메인버튼.jpg"));
		btnRegi.setVerticalTextPosition(SwingConstants.CENTER);
		btnRegi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegi.setBounds(126, 361, 171, 61);
		lp.add(btnRegi);

		JButton btnLogin = new JButton("\uB85C\uADF8\uC778", new ImageIcon("images/메인버튼.jpg"));
		btnLogin.setVerticalTextPosition(SwingConstants.CENTER);
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setBounds(126, 272, 171, 61);
		lp.add(btnLogin);

		JButton btnQuit = new JButton("나가기", new ImageIcon("images/메인버튼.jpg"));
		btnQuit.setVerticalTextPosition(SwingConstants.CENTER);
		btnQuit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQuit.setBounds(126, 450, 171, 61);
		lp.add(btnQuit);

		setVisible(true);

		MainListener l = new MainListener(this);
		btnRegi.addActionListener(l);
		btnLogin.addActionListener(l);
		btnQuit.addActionListener(l);

	}

	class MainListener implements ActionListener {

		test1 frame = null;

		MainListener(test1 frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String cmd = arg0.getActionCommand();

			switch (cmd) {
			case "회원가입":
				frame.setVisible(false);
				//new Register_Frame(this.frame);
				break;

			case "로그인":
				frame.setVisible(false);
				//new Login_Frame(this.frame);
				break;

			case "Quit":
				frame.dispose();
			}
		}

	}

}
