package Ex_p;

import java.io.*;

/*
 * 	1�� ���� : FileReader�� �ؽ�Ʈ ���� �б�.
 * FileReader ��ü ���� -> read() �Լ��� ���.
 * int�� ������ �����Ͽ� read() ��ȯ ���� �޴´�.
 */

public class Num_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileReader fin = null;
			try {
				fin = new FileReader("c:\\Users\\JMH\\Desktop\\test.txt");
				int c;
				while(( c = fin.read()) != -1) {
					System.out.print((char)c);
				}
				fin.close();
			}catch(IOException e) {
				System.out.println("����� ����");
			}
	}
}
