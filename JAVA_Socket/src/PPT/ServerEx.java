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
			System.out.println("클라이언트 연결을 기다림");
			
			socket = listener.accept();
			System.out.println("연결됨");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 스트림으로 받은 것을 스트링으로 바꾸고 버퍼로
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMsg = in.readLine();
				if(inputMsg.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트 연결 종료");
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
