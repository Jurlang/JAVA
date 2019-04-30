package Ex_p;

import java.io.*;

/*
 * 한글 텍스트 파일 읽기. ( 인코딩 방식 잘못입력했을 경우 )
 * 다른 문자 인코딩 방식을 넣으면 ? 가 출력된다.
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
			System.out.println("입출력 오류");
		}//catch
	}

}
