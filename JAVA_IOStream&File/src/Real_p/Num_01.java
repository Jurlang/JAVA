package Real_p;

import java.io.*;
import java.util.Scanner;

/*
 * Scanner�� �Է¹޴� �̸��� ��ȭ��ȣ�� �� �ٿ� �� ����� �Է��Ͽ� ���Ͽ� �����Ͽ���.
 * 
 * 1. �̸��� ��ȭ��ȣ�� �Է¹޴´�.
 * 2. ���Ͽ� �����Ų��.
 * 		2-1 ���� ����
 * 		2-2 ���Ͽ� �����Ѵ�.
 * 		2-3 ������ �ݴ´�.
 */

public class Num_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;

		try {
			fout = new FileWriter("c:\\Users\\JMH\\Desktop\\phone.txt");
			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String line = s.nextLine();
				
				
				if (line.contentEquals("�׸�"))
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("����¿���");
		}
		s.close();
	}

}
