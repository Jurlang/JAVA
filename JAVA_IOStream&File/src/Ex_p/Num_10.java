package Ex_p;

import java.io.*;

/*
 * 바이너리 파일 복사
 */

public class Num_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Users\\JMH\\Desktop\\test.PNG");
		File dest = new File("c:\\USers\\JMH\\Desktop\\c_test.PNG");
		
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath() + "로 복사");
		}catch(IOException e){
			System.out.println("복사오류");
		}
	}

}
