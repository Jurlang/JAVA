package Ex_p;

import java.io.*;

/*
 * FileOutputStream���� ���̳ʸ� ���Ͼ���
 * ���̳ʸ� ������ �Ǳ� ������ ��𼭵� ���� �� ���Եȴ�.
 */

public class Num_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = { 7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Users\\JMH\\Desktop\\test.out");
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		}catch(IOException e) {
			System.out.println("��� Ȯ�� ��Ź");
			return ;
		}
		System.out.println("���� �Ϸ�");
	}//main
}//Num_05
