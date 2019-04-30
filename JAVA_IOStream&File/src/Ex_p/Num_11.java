package Ex_p;

import java.io.*;

/*
 * 블록 단위로 바이너리 파일 고속 복사
 */

public class Num_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Users\\JMH\\Desktop\\test.PNG");
		File dest = new File("c:\\USers\\JMH\\Desktop\\c_test.PNG");
		
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte[] buf = new byte[1024*10];
			
			while(true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath() + "로 복사");
		}catch(IOException e){
			System.out.println("복사오류");
		}
	}
}
