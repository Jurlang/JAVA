package PPT;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try{
			listener = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ�");
			
			socket = listener.accept();
			System.out.println("�����");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��Ʈ������ ���� ���� ��Ʈ������ �ٲٰ� ���۷�
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMsg = in.readLine();
				if(inputMsg.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ ���� ����");
					break;
				}
				System.out.println("client : " + inputMsg);
				System.out.print("Server >> ");
				String outputMsg = sc.nextLine();
				out.write(outputMsg + "\n");
				out.flush();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}
	}

}
