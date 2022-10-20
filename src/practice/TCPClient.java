package practice;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.25.4",9010);
			InputStream is = socket.getInputStream();
			int a = is.read();
			System.out.println(a);
			is.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외처리:" + e.getMessage());
		}
		

	}

}
