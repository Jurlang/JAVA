package Event_Program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Char_Num_Input_Display extends JFrame {
	//JTextField charTf, numTf;
		
	Char_Num_Input_Display() {
		this.setTitle("제목");
		this.setSize(300, 300);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel pn = new JPanel();
		c.add(pn, BorderLayout.NORTH);
		JPanel pc = new JPanel();
		c.add(pc, BorderLayout.CENTER);
		JPanel ps = new JPanel();
		c.add(ps, BorderLayout.SOUTH);

		pc.setLayout(null);

		JButton openBtn = new JButton("열기");
		JButton closeBtn = new JButton("닫기");
		JButton exitBtn = new JButton("종료");

		pn.add(openBtn);
		pn.add(closeBtn);
		pn.add(exitBtn);

		JTextField charTf = new JTextField(5);
		JTextField numTf = new JTextField(5);
		JButton okBtn = new JButton("OK");

		ps.add(charTf);
		ps.add(numTf);
		ps.add(okBtn);

		pn.setBackground(Color.pink);
		pc.setBackground(Color.white);
		ps.setBackground(Color.pink);
		
		okBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = charTf.getText();
				int num = Integer.parseInt(numTf.getText());
				for(int i=0;i<num;i++) {
					int x = (int)(Math.random()*200);
					int y = (int)(Math.random()*200);
					JLabel la = new JLabel(str);
					la.setBounds(x, y, 10,10);
					pc.add(la);
				}
				pc.revalidate();
				pc.repaint();
			}
		});
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Char_Num_Input_Display();
		
	}

}
