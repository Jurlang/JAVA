import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CheckBoxMethod extends JFrame{
	
	CheckBoxMethod(){
	
		this.setTitle("체크박스 메소드");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon ncheck = new ImageIcon("images/블랙체크.png");
		ImageIcon ycheck = new ImageIcon("images/레드체크.png");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox chk = new JCheckBox("체크", ncheck);
		
		chk.setBorderPainted(true);
		chk.setSelectedIcon(ycheck);
		
		c.add(apple);
		c.add(pear);
		c.add(chk);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String ar[]) {
		new CheckBoxMethod();
	}
}
