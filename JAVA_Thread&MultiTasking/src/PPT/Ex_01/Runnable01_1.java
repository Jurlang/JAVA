package PPT.Ex_01;

import javax.swing.JLabel;

public class Runnable01_1 implements Runnable{
	JLabel lc;
	public Runnable01_1(JLabel lc) {
		this.lc = lc;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			lc.setText(n+"");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n++;
		}
	}

}
