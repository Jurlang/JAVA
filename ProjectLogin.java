import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ProjectLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfPw;
	private PMainFrame mainFrame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					ProjectLogin frame = new ProjectLogin();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjectLogin(PMainFrame mainFrame) {
		this.mainFrame=mainFrame;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		panel1.add(lblNewLabel);
		
		tfId = new JTextField();
		panel1.add(tfId);
		tfId.setColumns(20);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		panel2.add(lblNewLabel_1);
		
		tfPw = new JTextField();
		panel2.add(tfPw);
		tfPw.setColumns(20);
		
		JPanel panel3 = new JPanel();
		contentPane.add(panel3);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		panel3.add(btnLogin);
		
		JButton btnCancel = new JButton("\uB098\uAC00\uAE30");
		panel3.add(btnCancel);
		
		setVisible(true);
		
		MyListener l=new MyListener(this);
		btnLogin.addActionListener(l);
		btnCancel.addActionListener(l);
		
	}
	
	class MyListener implements ActionListener{
		ProjectLogin frame;
		MyListener(ProjectLogin frame){
			this.frame=frame;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String log=e.getActionCommand();
			
			if(log.trim().equals("�α���")) {
				String id=tfId.getText();
				String pw=tfPw.getText();
				
				DBConn dbConn=DBConn.getInstance();
				int login=dbConn.confirm(id, pw);
				String msg="";
				
				if(login==1) {
					PMember m=dbConn.selectOne(id);
					msg="ȯ���մϴ�"+id+"("+m.getName()+")��";
				}else if(login==0) {
					msg="��й�ȣ�� Ʋ��";
				}else {
					msg=id+"�� ���� ȸ���Դϴ�.";
				}
				JOptionPane.showMessageDialog(null,msg);
			}else {
				frame.dispose();
				mainFrame.setVisible(true);
			}
		}
		
	}
	

}