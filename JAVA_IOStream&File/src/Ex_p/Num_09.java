package Ex_p;

import java.io.*;

/*
 * �ؽ�Ʈ ���� ����
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
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� ����");
		}catch(IOException e) {
			System.out.println("���� ����");
		}
	}

}
