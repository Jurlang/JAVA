package Event_Program;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyAction implements ActionListener{
	private JTextField tf1, tf2;
	private JLabel la;
	
	MyAction(JTextField tf1, JTextField tf2, JLabel la){
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.la = la;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		int num1 = Integer.parseInt(tf1.getText());
		int num2 = Integer.parseInt(tf2.getText());
		la.setText(Integer.toString(num1+num2));
	}
}

public class TwoNum_Add extends JFrame{
	JTextField tf1, tf2;
	JLabel la;
	JButton btn;

	TwoNum_Add() {
	      setTitle("이벤트 처리");
	      setSize(300,200);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      Container c = getContentPane();
	      c.setLayout(new FlowLayout());
	      JPanel p1 = new JPanel();
	      JPanel p2 = new JPanel();
	      JPanel p3 = new JPanel();
	      
	      tf1 = new JTextField(10);
	      p1.add(new JLabel("숫자1 : "));
	      p1.add(tf1);
	      
	      tf2 = new JTextField(10);
	      p2.add(new JLabel("숫자2 : "));
	      p2.add(tf2);
	      
	      la = new JLabel("처리결과");
	      p3.add(new JLabel("계산결과 : "));
	      p3.add(la);
	      btn = new JButton("더하기");
	      c.add(p1);
	      c.add(p2);
	      c.add(btn);
	      c.add(p3);
	      
	      btn.addActionListener(new MyAction(tf1, tf2, la));
	      
	      setVisible(true);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwoNum_Add();
	}

}
