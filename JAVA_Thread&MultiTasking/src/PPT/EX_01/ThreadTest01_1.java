package PPT.EX_01;

import javax.swing.JLabel;

public class ThreadTest01_1 extends Thread{
	JLabel la;
	public ThreadTest01_1(JLabel la) {
		this.la = la;
	}
	public void run() {
		for(int i=0;true;i++) {
			la.setText(i + " ");
			try {
				sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
