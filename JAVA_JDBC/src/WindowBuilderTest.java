import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;
	private JTextField tfSno;
	private JTextField tfName;
	private JTextField tfDept;
	private JTextArea taShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("\uD559\uBC88");
		panel.add(label);
		
		tfSno = new JTextField();
		panel.add(tfSno);
		tfSno.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		panel.add(lblNewLabel);
		
		tfName = new JTextField();
		panel.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uD559\uACFC");
		panel.add(lblNewLabel_1);
		
		tfDept = new JTextField();
		panel.add(tfDept);
		tfDept.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnAdd = new JButton("\uCD94\uAC00");
		panel_1.add(btnAdd);
		
		JButton btnRem = new JButton("\uC0AD\uC81C");
		panel_1.add(btnRem);
		
		JButton btnUpd = new JButton("\uC218\uC815");
		panel_1.add(btnUpd);
		
		JButton btnAll = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		panel_1.add(btnAll);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		taShow = new JTextArea();
		taShow.setColumns(40);
		taShow.setRows(15);
		panel_2.add(new JScrollPane(taShow));
		
		MyListener l = new MyListener();
		btnAll.addActionListener(l);
		btnAdd.addActionListener(l);
		btnRem.addActionListener(l);
		btnUpd.addActionListener(l);
	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			DBConnect db = DBConnect.getInstance();
			switch(cmd) {
			case "추가":
				int sno = Integer.parseInt(tfSno.getText());
				String name = tfName.getText();
				String dept = tfDept.getText();
				Student s = new Student(sno, name, dept);
				db.insert(s);
				
				break;
			case "삭제":
				if(tfSno.getText() != null) {
					sno = Integer.parseInt(tfSno.getText());
					db.remove(sno);
				}else {
					JOptionPane.showMessageDialog(null, "학번을 입력하세요");
				}
				break;
			case "수정":
				sno = Integer.parseInt(tfSno.getText());
				name = tfName.getText();
				dept = tfDept.getText();
				s = new Student(sno, name, dept);
				db.update(s);
				break;
			case "전체보기":
				taShow.setText("");
				ArrayList<Student> list = db.select();
				for(int i= 0; i<list.size();i++)
					taShow.append(list.get(i).toString()+"\n");
			}
		}
		
	}
}
