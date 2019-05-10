package PPT.EX_03;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ThreadTest_03 extends JFrame {
	JLabel la;
	ThreadStart_Stop th;
	
	ThreadTest_03(){
		this.setTitle("쓰레드 3");
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		JPanel laPanel = new JPanel();
		laPanel.setLocation(this.getWidth()/3, this.getHeight()/3);
		laPanel.setSize(100,100);
		JPanel btnPanel = new JPanel(); 
		btnPanel.setLocation(this.getWidth()-250, this.getHeight()-100);
		btnPanel.setSize(200,100);
		
		la = new JLabel("0");
		la.setFont(new Font("굴림", Font.PLAIN, 40));
		
		laPanel.add(la);
		
		JButton btnSta = new JButton("시작");
		JButton btnEnd = new JButton("끝");
		
		btnSta.addActionListener(new ThreadTest_03_Listener());
		btnEnd.addActionListener(new ThreadTest_03_Listener());
		
		btnPanel.add(btnSta);
		btnPanel.add(btnEnd);
		
		c.add(laPanel);
		c.add(btnPanel);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreadTest_03();
	}
	
	class ThreadTest_03_Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.contentEquals("시작")) {
				th = new ThreadStart_Stop();
				th.start();
			}else if(cmd.contentEquals("끝")) {
				th.finish();
				//th.interrupt();
			}
		}
		
	}
	
	class ThreadStart_Stop extends Thread{
		boolean flag = false;
		public void finish() {
			flag = true;
		}
		public void run() {
			int n = 0;
			while(true) {
				n++;
				la.setText(n+"");
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.getStackTrace();
				}
				if(flag) return;
			}
		}
	}
}
