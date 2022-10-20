package practice;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9006);
			System.out.println("서버가 가동되었습니다");
			while (true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				OutputStream os = socket.getOutputStream();
				for (int i = 0; i <= 10; i++) {
					int a = i;
					os.write(a);
					Thread.sleep(500);
				}
				os.close();
				socket.close();
			}
		} catch (Exception e) {
			System.out.println("예외처리:" + e.getMessage());
		}
	}
}
