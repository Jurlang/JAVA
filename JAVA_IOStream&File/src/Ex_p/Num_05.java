package Ex_p;

import java.io.*;

/*
 * FileOutputStream으로 바이너리 파일쓰기
 * 바이너리 파일이 되기 때문에 어디서든 읽을 수 없게된다.
 */

public class Num_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = { 7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Users\\JMH\\Desktop\\test.out");
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		}catch(IOException e) {
			System.out.println("경로 확인 부탁");
			return ;
		}
		System.out.println("저장 완료");
	}//main
}//Num_05
