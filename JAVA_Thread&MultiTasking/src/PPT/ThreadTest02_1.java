package PPT;

import java.awt.Color;

import javax.swing.JLabel;

public class ThreadTest02_1 extends Thread{
	JLabel la1; 
	boolean check;
	public ThreadTest02_1(JLabel la1) {
		this.la1 = la1; 
		this.check = false;
	}
	public void run() {
		for(int i=0;true;i++) {
			try {
				sleep(500);
				if(check == true) {
					System.out.println("check is true");
					la1.setBackground(Color.green);
					check = false;
				}
				else {
					System.out.println("check is false");
					la1.setBackground(Color.yellow);
					check = true;
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
