package PPT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("192.168.0.91", 9000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��Ʈ������ ���� ���� ��Ʈ������ �ٲٰ� ���۷�
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("������ >> ");
				String outputMsg = sc.nextLine();
				if (outputMsg.equalsIgnoreCase("bye")) {
					out.write(outputMsg + "\n");
					out.flush();
					break;
				}
				out.write(outputMsg + "\n");
				out.flush();
				String inputMsg = in.readLine();
				System.out.println("���� : " + inputMsg);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			if(socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}

}
