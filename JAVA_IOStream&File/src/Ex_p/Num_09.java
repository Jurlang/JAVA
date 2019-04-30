package Ex_p;

import java.io.*;

/*
 * 텍스트 파일 복사
 */

public class Num_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Users\\JMH\\Desktop\\test_UTF.txt");
		File dest = new File("c:\\Users\\JMH\\Desktop\\c_test.txt");
		
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read())!=-1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사");
		}catch(IOException e) {
			System.out.println("복사 오류");
		}
	}

}
