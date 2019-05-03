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
			new ImageIcon("images/레드체크.png"),
			new ImageIcon("images/블랙체크.png"),
			new ImageIcon("images/별.png")
	};
	String[] str = {"레드","블랙","별"};
	JLabel imgla;
	
	RadioBtnMethod(){
		this.setTitle("라디오 버튼 메소드");
		this.setSize(300,300);
		
		JPanel p = new JPanel();
		p.setBackground(Color.gray);
		
		imgla = new JLabel(icon[0]);
		
		ButtonGroup g = new ButtonGroup(); //라디오 버튼은 반드시 버튼그룹이 필요하다.
		MyItemListener l = new MyItemListener();
		
		for(int i=0;i<rb.length;i++) {
			rb[i] = new JRadioButton(str[i]);
			rb[i].addItemListener(l);
			g.add(rb[i]);	// 라디오 버튼을 그룹에도 넣고
			p.add(rb[i]);	// 라디오 버튼을 패널에도 넣고
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
