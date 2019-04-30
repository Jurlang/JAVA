package Real_p;

import java.io.*;
import java.util.Scanner;

/*
 * Scanner로 입력받는 이름과 전화번호를 한 줄에 한 사람씩 입력하여 파일에 저장하여라.
 * 
 * 1. 이름과 전화번호를 입력받는다.
 * 2. 파일에 저장시킨다.
 * 		2-1 파일 연다
 * 		2-2 파일에 저장한다.
 * 		2-3 파일을 닫는다.
 */

public class Num_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;

		try {
			fout = new FileWriter("c:\\Users\\JMH\\Desktop\\phone.txt");
			while (true) {
				System.out.print("이름 전화번호 >>");
				String line = s.nextLine();
				
				
				if (line.contentEquals("그만"))
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		s.close();
	}

}
