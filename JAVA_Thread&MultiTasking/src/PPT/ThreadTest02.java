package PPT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThreadTest02 extends JFrame{
	JLabel la, lb, lc;

	ThreadTest02() {
		setTitle("½º·¹µå02");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pc = new JPanel();
		JPanel ps = new JPanel();
		la = new JLabel("±ôºý");
		lb = new JLabel("¾È±ôºý");
		lc = new JLabel("¿©±âµµ ±ôºý");
		la.setFont(new Font("±¼¸²", Font.BOLD, 40));
		la.setBackground(Color.yellow);
		la.setOpaque(true);
		lb.setFont(new Font("±¼¸²", Font.BOLD, 40));
		lc.setFont(new Font("±¼¸²", Font.BOLD, 40));
		lc.setBackground(Color.yellow);
		lc.setOpaque(true);
		pc.add(la);
		pc.add(lb);
		pc.add(lc);

		JButton btn1 = new JButton("Thread");
		ps.add(btn1);
		
		add(pc);
		add(ps, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
		
		btn1.addActionListener(new MyListener());
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			if (cmd.equals("Thread")) {
				ThreadTest02_1 th1 = new ThreadTest02_1(la);
				ThreadTest02_2 th2 = new ThreadTest02_2(lc);
				th1.start();
				th2.start();
			} else {

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest02();
	}
}
