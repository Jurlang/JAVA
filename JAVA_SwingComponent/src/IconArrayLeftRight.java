import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class IconArrayLeftRight extends JFrame {

	ImageIcon[] img = new ImageIcon[7];
	String[] imgStr = { "��.png", "��üũ.png", "����üũ.png", "������.png", "����.png", "����ȭ��ǥ.png", "������ȭ��ǥ.png" };
	JLabel imgla;
	JButton left, right;

	int count = 0;

	IconArrayLeftRight() {
		
		this.setTitle("�̹��� �ѱ��");
		this.setSize(800, 800);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon("images/" + imgStr[i]);
		}

		imgla = new JLabel(img[count]);

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.setBackground(Color.DARK_GRAY);

		left = new JButton(img[5]);
		right = new JButton(img[6]);

		left.addActionListener(new BtnListener());
		right.addActionListener(new BtnListener());
	
		c.add(imgla, BorderLayout.CENTER);
		c.add(p, BorderLayout.SOUTH);
		
		p.add(left);
		p.add(right);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new IconArrayLeftRight();
	}
	
	class BtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b == left) {
				if (count > 0)
					imgla.setIcon(img[--count]);
			} else if (b == right) {
				if (count < img.length - 1)
					imgla.setIcon(img[++count]);
			}
		}
	}
}
