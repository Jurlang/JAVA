package PPT.EX_02;

import java.awt.Color;

import javax.swing.JLabel;

public class ThreadTest02_2 extends Thread{
	JLabel la1; 
	boolean check;
	
	public ThreadTest02_2(JLabel la1) {
		this.la1 = la1; 

		this.check = false;
	}
	public void run() {
		while(true) {
			try {
				sleep(1000);
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
