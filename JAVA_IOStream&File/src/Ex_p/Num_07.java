package Ex_p;

import java.io.*;
import java.util.*;

/*
 * 버퍼스트림을 이용한 출력.
 * 지정한 버퍼의 사이즈만큼 출력되며
 * 지정한 버퍼 사이즈가 안되면 버퍼에 남아있다.
 * 남아있는 데이터들은 flush 메소드로 출력.
 */

public class Num_07 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\JMH\\Desktop\\test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
