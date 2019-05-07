import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class DialogTest extends JFrame{
	JLabel la;
	DialogTest(){
		this.setTitle("다이얼로그 테스트");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		la = new JLabel("테스트");
		
		JButton inBtn = new JButton("입력");
		JButton okBtn = new JButton("확인");
		JButton msgBtn = new JButton("메시지");
		
		MyListener l = new MyListener();
		
		inBtn.addActionListener(l);
		okBtn.addActionListener(l);
		msgBtn.addActionListener(l);
		
		c.add(inBtn);
		c.add(okBtn);
		c.add(msgBtn);
		c.add(la);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DialogTest();
	}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			switch(str) {
			case "입력":
				String name = JOptionPane.showInputDialog("이름을 입력하시오");
				la.setText(name);
				break;
			case "확인":
				int result = JOptionPane.showConfirmDialog(null, "계속할려?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION)
					la.setText("닫기 버튼 누름");
				else if( result == JOptionPane.YES_OPTION)
					la.setText("Yes");
				else if ( result == JOptionPane.NO_OPTION)
					la.setText("NO");
				break;
			case "메시지":
				JOptionPane.showMessageDialog(null, "조심하세요","MESSAGE", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
	}
}
