import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      FileInputStream fin1 = null;
      FileInputStream fin2 = null;
      int c1, c2;
      boolean check = true;
      ArrayList<Character> file1 = new ArrayList<Character>();
      ArrayList<Character> file2 = new ArrayList<Character>();
      
      try {
         System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
         System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
         String f1 = s.next();
         fin1 = new FileInputStream(f1);
         InputStreamReader in1 = new InputStreamReader(fin1, "UTF-8"); //fileStream�� ������ �׻� reader�� ���� �������!!!
         System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
         String f2 = s.next();
         fin2 = new FileInputStream(f2);
         InputStreamReader in2 = new InputStreamReader(fin2, "UTF-8");
         
         while((c1=in1.read()) != -1) {
            file1.add((char)c1);
         }
         while((c2=in2.read()) != -1) {
            file2.add((char)c2);
         }
         
         System.out.println(file1.size());
         System.out.println(file2.size());
         
         for(int i=0;i<file1.size();i++) {
        	 System.out.print(file1.get(i));
        	 System.out.print(file2.get(i));
        	 System.out.println();
        	 if(file1.get(i).equals(file2.get(i)))
        		 System.out.println("��");
        	 
         }
         System.out.println(f1+"�� "+f2+"�� ���մϴ�.");
         for(int i=1; i<file1.size(); i++) {
            if(file1.get(i) == file2.get(i)) {
               check = true;
            }
            else
               check = false;   
         }
         if(check)   System.out.println("������ �����ϴ�.");
         else   System.out.println("������ ���� �ٸ��ϴ�.");
         
         in1.close();
         fin1.close();
         in2.close();
         fin2.close();
         s.close();
      }catch (IOException e) {
         e.printStackTrace();
      }
   }

}