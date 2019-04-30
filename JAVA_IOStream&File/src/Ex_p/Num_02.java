package Ex_p;

import java.io.*;

/*
 * InputStreamReader로 한글 텍스트 파일 읽기
 * FileInputStream 클래스 로 파일을 읽음.
 * InputStreamReader클래스의 read()메소드로 글자 받음
 * ISR 클래스 생성 시 FIS 객체와 인코딩 방식 을 생성자 파라메타로 받음.
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
			System.out.println("입출력 오류");
		}//catch
	}//main
}//Num_02
