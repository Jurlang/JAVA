package Ex_p;

import java.io.*;
import java.util.*;

/*
 * ���۽�Ʈ���� �̿��� ���.
 * ������ ������ �����ŭ ��µǸ�
 * ������ ���� ����� �ȵǸ� ���ۿ� �����ִ�.
 * �����ִ� �����͵��� flush �޼ҵ�� ���.
 */

public class Num_07 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\JMH\\Desktop\\test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
