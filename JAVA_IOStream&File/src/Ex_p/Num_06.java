package Ex_p;

import java.io.*;

/*
 * FileInputStream���� ���̳ʸ� ���� �б�.
 */

public class Num_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Users\\JMH\\Desktop\\test.out");

			int n = 0, c;

			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("������ �迭 ���");
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("��� Ȯ�� ���");
		}
	}

}
