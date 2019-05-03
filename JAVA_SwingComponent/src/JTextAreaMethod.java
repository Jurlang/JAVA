import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextAreaMethod extends JFrame{
	JTextField tf;
	JTextArea ta;
	
	JTextAreaMethod(){
		this.setTitle("제목없음");
		this.setSize(300,300);
		
		tf = new JTextField();
		ta = new JTextArea();
		add(tf, BorderLayout.NORTH);
		add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
			
		});
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaMethod();
	}

}