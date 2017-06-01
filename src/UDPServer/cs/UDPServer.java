package UDPServer.cs;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	
	public static void main(String[] args) throws Exception {
		DatagramSocket server = new DatagramSocket(5051);
		
		byte[] receivedBuf = new byte[100];
		DatagramPacket receivedPacket = new DatagramPacket(receivedBuf,receivedBuf.length);
		
		server.receive(receivedPacket);
		
		String receivedStr = new String(receivedPacket.getData(),0,receivedPacket.getLength());
		System.out.println("Hello world!" + receivedStr);
		
		int port = receivedPacket.getPort();
		InetAddress addr = receivedPacket.getAddress();
		String sendStr = "Hello ," + addr.toString() + ", i am server";
		byte[] sendBuf ;
		sendBuf = sendStr.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,addr,port);
		
		server.send(sendPacket);
		server.close();
	}

}
