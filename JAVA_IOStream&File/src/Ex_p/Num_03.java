package Ex_p;

import java.io.*;

/*
 * �ѱ� �ؽ�Ʈ ���� �б�. ( ���ڵ� ��� �߸��Է����� ��� )
 * �ٸ� ���� ���ڵ� ����� ������ ? �� ��µȴ�.
 */

public class Num_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Users\\JMH\\Desktop\\test_UTF.txt");
			in = new InputStreamReader(fin, "ASCII");
			
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
	}

}
