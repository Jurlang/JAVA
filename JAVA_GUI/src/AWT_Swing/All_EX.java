package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * <<<<<<<<<< ������ ���� 1�� >>>>>>>>>>
 * 		������ �ϳ��� ������.
 * 		�����̳ʸ� �����ϰ� ��ư 3���� ������.
 * 		�����ϸ� ��ġ�� ����� �����Ǿ����� �ʱ⶧����
 * 		�������� ����� ignore ��ư�� ũ�� ���δ�.
 * 		FlowLayout �������� ������ ��ġ ����
 * 		��� ���� �����ϱ�
 * 		Container �������ٶ��� �����ٶ��� ����
 * 			->	��� �Է� �ܿ� �̹��� �� ��� ���� �� �������� �Ͽ� ������.
 */

@SuppressWarnings("serial")
public class All_EX extends JFrame {

	All_EX() {
		// super("Hello"); // ���� ����
		this.setTitle("MyFrame"); // ���� ����
		this.setSize(300, 400); // ũ�⼳��

		Container c = getContentPane(); // �����̳� ����
		c.setLayout(new FlowLayout()); // FlowLayout ( ������ ���̾ƿ� ��ġ ) ����
//		c.setLayout(new BorderLayout());			
//		c.setLayout(new GridLayout());
//		c.setLayout(new CardLayout());

		c.setBackground(Color.BLACK); // ���ȭ�� ����

//		this.setLayout(new FlowLayout());
//		this.setBackground(Color.red);

		JButton ok_btn = new JButton("Ȯ��"); // ��ư ����
		JButton ca_btn = new JButton("���"); // "
		JButton ig_btn = new JButton("����"); // "
		JButton ok_btn1 = new JButton("Ȯ��1"); // ��ư ����
		JButton ca_btn1 = new JButton("���1"); // "
		JButton ig_btn1 = new JButton("����1"); // "

//		add(ok_btn);									// �����̳ʿ� ��� ���� ( ��� ���Ը� �� �� )
//		add(ca_btn);									// 		"
//		add(ig_btn);									// 		"

		c.add(ok_btn); // �����̳ʿ� ��� ���� ( ��� �� �ٸ� �ΰ����� ��� ������ �� )
		c.add(ca_btn); // "
		c.add(ig_btn); // "
		c.add(ok_btn1); // �����̳ʿ� ��� ���� ( ��� �� �ٸ� �ΰ����� ��� ������ �� )
		c.add(ca_btn1); // "
		c.add(ig_btn1); // "

//		c.add(ok_btn, BorderLayout.SOUTH);				// Border Layout ���� ��ġ �������ֱ�
//		c.add(ca_btn, BorderLayout.NORTH);				// 		"
//		c.add(ig_btn, BorderLayout.WEST);				// 		"
//		c.add(ok_btn1, BorderLayout.EAST);				// 		"

//		JPanel p1 = new JPanel();						// ���̾ƿ� ��ġ ����
//		JPanel p2 = new JPanel();						// Container �ȿ� Panel ����
//		JPanel p3 = new JPanel();						// Border�� ��ġ ����ֱ�

//		p1.add(ok_btn);									// 		"
//		p1.add(ca_btn);									// 		"
//		
//		p2.add(ig_btn);									// 		"
//		p2.add(ok_btn1);								// 		"
//		
//		p3.add(ca_btn1);								// 		"
//		p3.add(ig_btn1);								// 		"
//		
//		c.add(p3);										// 		"
//		c.add(p2,BorderLayout.SOUTH);					// 		"
//		c.add(p1, BorderLayout.NORTH);					// 		"

		this.setVisible(true); // ���̳� ������ ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ������ ���μ��� ����

	}

	public static void main(String[] args) {
		new All_EX();
	}
}
