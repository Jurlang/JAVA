import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SeoSickMenu extends JFrame{
	String [] mbStr = {"크기", "색상"};
	JMenu [] m = new JMenu[2];
	String [] sizeItem = {"크기확대","크기축소"};
	JMenuItem[] smItem = new JMenuItem[2];
	String [] colorItem = {"빨강", "파랑", "초록"};
	JMenuItem[] cmItem = new JMenuItem[3];
	JLabel strLa = new JLabel("글자");
	
	SeoSickMenu(){
		this.setTitle("서식메뉴만들기");
		JMenuBar mb = new JMenuBar();
		JMenu seosick = new JMenu("서식");
		SeoSickActionListener l = new SeoSickActionListener();
		mb.add(seosick);
		
		JMenuItem setfont = new JMenuItem("폰트");
		seosick.add(setfont);
		setfont.addActionListener(l);
		
		for(int i=0;i<m.length;i++) {
			m[i] = new JMenu(mbStr[i]);
			seosick.add(m[i]);
		}
		
		for(int i=0;i<smItem.length;i++) {
			smItem[i] = new JMenuItem(sizeItem[i]);
			m[0].add(smItem[i]);
			smItem[i].addActionListener(l);
		}
		
		for(int i=0;i<cmItem.length;i++) {
			cmItem[i] = new JMenuItem(colorItem[i]);
			m[1].add(cmItem[i]);
			cmItem[i].addActionListener(l);
		}
		
		setJMenuBar(mb);
		
		Container c = getContentPane();
		c.add(strLa, SwingConstants.CENTER);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new SeoSickMenu();
	}
	
	class SeoSickActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Font x;
			int y;
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "폰트":
				strLa.setFont(new Font("굴림", Font.PLAIN, 14));
				break;
			case "크기확대":
				x = strLa.getFont();
				y = x.getSize();
				strLa.setFont(new Font("굴림", Font.PLAIN, y + 5));
				break;
			case "크기축소":
				x = strLa.getFont();
				y = x.getSize();
				strLa.setFont(new Font("굴림", Font.PLAIN, y - 5));
				break;
			case "빨강":
				strLa.setForeground(Color.red);
				break;
			case "파랑":
				strLa.setForeground(Color.blue);
				break;
			case "초록":
				strLa.setForeground(Color.green);
				break;
			}
		}
		
	}

}
