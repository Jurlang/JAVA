import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JTextAreaMethod extends JFrame{
	JTextField tf;
	JTextArea ta;
	JPanel contentPane;
	JTextAreaMethod(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,500,360);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 451, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(74,10,238,236);
		JScrollPane ta2 = new JScrollPane(new JTextArea());
		ta2.setLocation(0, 0);
		ta2.setSize(369, 246);
		//panel.add(ta);
		panel.add(ta2);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaMethod();
	}

}