package Ex_p;

import java.io.*;

/*
 * 	1번 예제 : FileReader로 텍스트 파일 읽기.
 * FileReader 객체 선언 -> read() 함수를 사용.
 * int형 변수를 선언하여 read() 반환 값을 받는다.
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
				System.out.println("입출력 오류");
			}
	}
}
