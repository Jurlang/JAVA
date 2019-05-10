package PPT.EX_05;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;

	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width = (int) (((double) (this.getWidth())) / maxBarSize * barSize);
		if (width == 0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}

	synchronized void fill() {
		if (barSize == maxBarSize)
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}

		barSize++;
		repaint(); // 다시 그림 그리기
		notify(); //
	}

	synchronized void consume() {
		if (barSize == 0)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		
		barSize--;
		repaint();
		notify();

	}
}

class ConsumerThread extends Thread {
	MyLabel bar;

	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}

	public void run() {
		while (true) {
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}

@SuppressWarnings("serial")
public class ThreadTest extends JFrame {

	MyLabel bar;

	ThreadTest() {
		this.setTitle("쓰레드 예제 5");
		this.setSize(350, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		bar = new MyLabel(100);
		bar.setBackground(Color.yellow);
		bar.setOpaque(true);
		bar.setBounds(20, 50, 300, 20);

		Container c = getContentPane();
		c.setLayout(null);
		c.add(bar);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});

		ConsumerThread th = new ConsumerThread(bar);
		th.start();

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ThreadTest();
	}

}
