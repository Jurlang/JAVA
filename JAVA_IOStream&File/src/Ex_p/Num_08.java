package Ex_p;

import java.io.File;

/*
 * File Class�� Ȱ���� ���ϰ���
 */
public class Num_08 {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "�� ���긮��Ʈ�Դϴ�.-----");
		File[] subFiles = dir.listFiles();
		
		for(int i=0;i<subFiles.length;i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t����ũ�� : "+f.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n", t,t,t,t);
		}
	}
	
	public static void main(String[] ar) {
		File f1 = new File("c:\\Users\\JMH\\desktop\\test.txt");
		System.out.println(f1.getPath() + " "  + f1.getParent() + " " + f1.getName());
		
		String res = "";
		if(f1.isFile()) res = "����";
		else if(f1.isDirectory()) res = "���丮";
		System.out.println(f1.getPath() + "�� " + res+ "�Դϴ� .");
		
		File f2 = new File("c:\\Users\\JMH\\desktop\\test_UTd.txt");
		if(!f2.exists())
			f2.mkdir();
		
		listDirectory(new File("c:\\Users\\JMH\\Desktop"));
		f2.renameTo(new File("c:\\Users\\JMH\\Desktop\\test_rename.txt"));
		
		listDirectory(new File("c:\\Users\\JMH\\Desktop"));
	}
}
