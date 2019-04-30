package Ex_p;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 키보드 입력을 파일로 저장하기
 */
public class Num_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;

		try {
			fout = new FileWriter("c:\\Users\\JMH\\Desktop\\test_new.txt");
			while (true) {
				String line = s.nextLine();
				if (line.length() == 0)
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
