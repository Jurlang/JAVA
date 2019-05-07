import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MenuTest extends JFrame {
	JLabel imgLa = new JLabel();
	String[] mStr = { "Load", "Hide", "ReShow", "Exit" };
	String[] mbStr = {"Edit", "Source", "Project", "Run"};
	JMenuItem[] mItem = new JMenuItem[4];
	JMenu[] m = new JMenu[4];

	MenuTest() {
		this.setTitle("메뉴만들기");
		createMenu();
		Container c = getContentPane();
		c.add(imgLa, SwingConstants.CENTER);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");

		for (int i = 0; i < mItem.length; i++) {
			mItem[i] = new JMenuItem(mStr[i]);
			mItem[i].addActionListener(new MenuActionListener());
			screenMenu.add(mItem[i]);
			if(i==2) screenMenu.addSeparator();
		}
		mb.add(screenMenu);
		for(int i=0;i<m.length;i++) {
			m[i] = new JMenu(mbStr[i]);
			mb.add(m[i]);
		}
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuTest();
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(imgLa.getIcon() != null) return;
				imgLa.setIcon(new ImageIcon("images/별.png"));
				break;
			case "Hide":
				imgLa.setVisible(false);
				break;
			case "ReShow":
				imgLa.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
			
		}
		
	}
}
