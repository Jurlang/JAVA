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
         System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
         System.out.print("첫번째 파일 이름을 입력하세요>>");
         String f1 = s.next();
         fin1 = new FileInputStream(f1);
         InputStreamReader in1 = new InputStreamReader(fin1, "UTF-8"); //fileStream을 쓸때는 항상 reader를 같이 써줘야함!!!
         System.out.print("두번째 파일 이름을 입력하세요>>");
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
        		 System.out.println("가");
        	 
         }
         System.out.println(f1+"와 "+f2+"를 비교합니다.");
         for(int i=1; i<file1.size(); i++) {
            if(file1.get(i) == file2.get(i)) {
               check = true;
            }
            else
               check = false;   
         }
         if(check)   System.out.println("파일이 같습니다.");
         else   System.out.println("파일이 서로 다릅니다.");
         
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