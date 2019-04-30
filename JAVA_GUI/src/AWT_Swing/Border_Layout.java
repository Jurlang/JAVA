package AWT_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Border_Layout extends JFrame {

	Border_Layout() {
		this.setTitle("MyFrame"); // ���� ����
		this.setSize(300, 400); // ũ�⼳��

		Container c = getContentPane(); // �����̳� ����
		c.setLayout(new BorderLayout(50, 15)); // BorderLayout ( �����¿� ���� ) ���� , ������ �Ű����� ( �翷, ���Ʒ� ) ����
		c.setBackground(Color.BLACK); // ���ȭ�� ����

		c.add(new JButton("A"), BorderLayout.CENTER);
		c.add(new JButton("B"), BorderLayout.NORTH);
		c.add(new JButton("C"), BorderLayout.SOUTH);
		c.add(new JButton("D"), BorderLayout.EAST);
		c.add(new JButton("E"), BorderLayout.WEST);

		this.setVisible(true); // ���̳� ������ ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ������ ���μ��� ����
	}

	public static void main(String[] args) {
		new Border_Layout();
	}
}