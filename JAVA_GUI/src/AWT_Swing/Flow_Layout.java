package AWT_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Flow_Layout extends JFrame {

	Flow_Layout() {

		this.setTitle("MyFrame"); // ���� ����
		this.setSize(300, 400); // ũ�⼳��

		Container c = getContentPane(); // �����̳� ����
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 100, 20)); // FlowLayout ( ������ ���̾ƿ� ��ġ ) ����
		c.setBackground(Color.BLACK); // ���ȭ�� ����

		JButton bt[] = new JButton[10];

		for (int i = 0; i < 10; i++) {
			bt[i] = new JButton("Button " + i);
			c.add(bt[i]);
		}

		this.setVisible(true); // ���̳� ������ ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ������ ���μ��� ����
	}

	public static void main(String[] args) {
		new Flow_Layout();

	}

}
