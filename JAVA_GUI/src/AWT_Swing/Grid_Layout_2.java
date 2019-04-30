package AWT_Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Grid_Layout_2 extends JFrame {

	String[] str = { "이름", "학번", "학과", "과목" };

	Grid_Layout_2() {
		this.setTitle("GridLayout2");
		this.setSize(300, 300);

		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 2, 5,5));

		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0)
				c.add(new JLabel(str[i/2]));
			else
				c.add(new JTextField(""));

		}

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid_Layout_2();
	}

}
