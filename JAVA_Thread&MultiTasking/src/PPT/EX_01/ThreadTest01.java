package PPT.EX_01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ThreadTest01 extends JFrame {
	JLabel la, lb, lc;

	ThreadTest01() {
		setTitle("½º·¹µå01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pc = new JPanel();
		JPanel ps = new JPanel();
		la = new JLabel("0");
		lb = new JLabel("0");
		lc = new JLabel("0");
		la.setFont(new Font("±¼¸²", Font.BOLD, 40));
		lb.setFont(new Font("±¼¸²", Font.BOLD, 40));
		lc.setFont(new Font("±¼¸²", Font.BOLD, 40));
		pc.add(la);
		pc.add(lb);
		pc.add(lc);

		JButton btn1 = new JButton("Thread");
		JButton btn2 = new JButton("Runable");
		ps.add(btn1);
		ps.add(btn2);

		add(pc);
		add(ps, BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);
		btn1.addActionListener(new MyListener());
		btn2.addActionListener(new MyListener());
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			if (cmd.equals("Thread")) {
				ThreadTest01_1 th1 = new ThreadTest01_1(la);
				ThreadTest01_2 th2 = new ThreadTest01_2(lb);
				Thread th3 = new Thread(new Runnable01_1(lc));
				th1.start();
				th2.start();	
				th3.start();
			} else {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest01();
	}

}
