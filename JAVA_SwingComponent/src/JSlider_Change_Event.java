import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class JSlider_Change_Event extends JFrame{
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider[3];
	JSlider_Change_Event(){
		this.setTitle("슬라이더와 ChangeEvent예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("Slider Example");
		for(int i=0;i<sl.length;i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0 , 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		c.add(colorLabel);
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JSlider_Change_Event();
	}
	
	class MyChangeListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
		}
		
	}

}
