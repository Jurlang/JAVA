import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioBtnMethod extends JFrame{
	JRadioButton[] rb = new JRadioButton[3];
	ImageIcon[] icon = {
			new ImageIcon("images/����üũ.png"),
			new ImageIcon("images/��üũ.png"),
			new ImageIcon("images/��.png")
	};
	String[] str = {"����","��","��"};
	JLabel imgla;
	
	RadioBtnMethod(){
		this.setTitle("���� ��ư �޼ҵ�");
		this.setSize(300,300);
		
		JPanel p = new JPanel();
		p.setBackground(Color.gray);
		
		imgla = new JLabel(icon[0]);
		
		ButtonGroup g = new ButtonGroup(); //���� ��ư�� �ݵ�� ��ư�׷��� �ʿ��ϴ�.
		MyItemListener l = new MyItemListener();
		
		for(int i=0;i<rb.length;i++) {
			rb[i] = new JRadioButton(str[i]);
			rb[i].addItemListener(l);
			g.add(rb[i]);	// ���� ��ư�� �׷쿡�� �ְ�
			p.add(rb[i]);	// ���� ��ư�� �гο��� �ְ�
		}
		
		rb[0].setSelected(true);
		add(p, BorderLayout.NORTH);
		add(imgla);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new RadioBtnMethod();
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return ;
			if(rb[0].isSelected())
				imgla.setIcon(icon[0]);
			else if(rb[1].isSelected())
				imgla.setIcon(icon[1]);
			else
				imgla.setIcon(icon[2]);
		}
	}
}
