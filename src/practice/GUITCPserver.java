package practice;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class GUITCPserver {
	
	public GUITCPserver() {
		try {
			ServerSocket server = new ServerSocket(9007);
			System.out.println("서버가 가동되었습니다");
			byte []data = new byte[100];
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다");
				OutputStream os = socket.getOutputStream();
				InputStream is = socket.getInputStream();
				
				while(true) {
					is.read(data);
					os.write(data);
					String msg = new String(data);
					System.out.println("수신된 데이터"+msg);
					Arrays.fill(data, (byte)0);
				}
			}
			
		} catch (Exception e) {
			System.out.println("예외처리:"+e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		new GUITCPserver();

	}

}
