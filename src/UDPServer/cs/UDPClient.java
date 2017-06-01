package UDPServer.cs;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket client = new DatagramSocket();
		String sendStr = "Hello! i am client.";
		byte[] sendBuf;
		sendBuf = sendStr.getBytes();
		InetAddress addr = InetAddress.getByName("localhost");
		int port = 5051;
		DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,addr,port);
		
		client.send(sendPacket);
		byte[] receivedBuf = new byte[100];
		DatagramPacket receivedPacket = new DatagramPacket(receivedBuf, receivedBuf.length);
		
		client.receive(receivedPacket);
		String receivedStr = new String(receivedPacket.getData(),0,receivedPacket.getLength());
		
		System.out.println("Received : " + receivedStr);

	}

}
