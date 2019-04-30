package Ex_p;

import java.io.*;

/*
 * InputStreamReader�� �ѱ� �ؽ�Ʈ ���� �б�
 * FileInputStream Ŭ���� �� ������ ����.
 * InputStreamReaderŬ������ read()�޼ҵ�� ���� ����
 * ISR Ŭ���� ���� �� FIS ��ü�� ���ڵ� ��� �� ������ �Ķ��Ÿ�� ����.
 */

public class Num_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Users\\JMH\\Desktop\\test_UTF.txt");
			in = new InputStreamReader(fin, "UTF-8");
			
			int c;
			
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e){
			System.out.println("����� ����");
		}//catch
	}//main
}//Num_02
