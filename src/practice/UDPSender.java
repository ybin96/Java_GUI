package practice;

import java.io.ObjectInputStream.GetField;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress addr = InetAddress.getByName("192.168.25.4");
			String msg = "안녕하세요 반갑습니다";
			byte []data = msg.getBytes();
			DatagramPacket packet = new DatagramPacket(data, data.length,addr,9009);
			socket.send(packet);
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
		

	}

}
