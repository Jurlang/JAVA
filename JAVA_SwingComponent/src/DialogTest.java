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
		this.setTitle("���̾�α� �׽�Ʈ");
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		la = new JLabel("�׽�Ʈ");
		
		JButton inBtn = new JButton("�Է�");
		JButton okBtn = new JButton("Ȯ��");
		JButton msgBtn = new JButton("�޽���");
		
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
			case "�Է�":
				String name = JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�");
				la.setText(name);
				break;
			case "Ȯ��":
				int result = JOptionPane.showConfirmDialog(null, "����ҷ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION)
					la.setText("�ݱ� ��ư ����");
				else if( result == JOptionPane.YES_OPTION)
					la.setText("Yes");
				else if ( result == JOptionPane.NO_OPTION)
					la.setText("NO");
				break;
			case "�޽���":
				JOptionPane.showMessageDialog(null, "�����ϼ���","MESSAGE", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
	}
}
