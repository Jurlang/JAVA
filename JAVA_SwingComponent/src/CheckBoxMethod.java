import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CheckBoxMethod extends JFrame{
	
	CheckBoxMethod(){
	
		this.setTitle("üũ�ڽ� �޼ҵ�");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon ncheck = new ImageIcon("images/��üũ.png");
		ImageIcon ycheck = new ImageIcon("images/����üũ.png");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox chk = new JCheckBox("üũ", ncheck);
		
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
