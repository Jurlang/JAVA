import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Common_Method extends JFrame{
	Common_Method(){
		this.setTitle("공통 메소드");
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta / Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC|Font.BOLD, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				Common_Method frm = (Common_Method)b.getTopLevelAncestor();
				frm.setTitle(b.getX()+", " + b.getY());
				b2.setEnabled(true);
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Common_Method();
	}

}
