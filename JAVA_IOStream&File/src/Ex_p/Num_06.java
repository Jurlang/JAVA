package Ex_p;

import java.io.*;

/*
 * FileInputStream으로 바이너리 파일 읽기.
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
			System.out.println("파일의 배열 출력");
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("경로 확인 요망");
		}
	}

}
