import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LabelMethod extends JFrame{
	LabelMethod(){
		this.setTitle("Label�� �̹��� �ֱ�");
		this.setSize(500,1000);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel l1 = new JLabel("���ڸ��ִ´�.",SwingConstants.CENTER);
		ImageIcon img = new ImageIcon("images/test.PNG");
		JLabel l2 = new JLabel(img);
		JLabel l3 = new JLabel("������ �Բ�", img, SwingConstants.LEFT);
		
		c.add(l1, BorderLayout.NORTH);
		c.add(l2);
		c.add(l3, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String ar[]) {
		new LabelMethod();
	}
}
