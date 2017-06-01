package UDPServer.echo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class EchoClient {
	
	private DatagramSocket socket;
	private InetAddress address;
	
	private byte[] buf;
	public EchoClient() throws Exception{
		socket = new DatagramSocket();
		address = InetAddress.getByName("localhost");
	}
	
	public String sendEcho(String msg){
		String received = "";
		try{
			buf = msg.getBytes();
			DatagramPacket packet = new DatagramPacket(buf, buf.length,address,4445);
			socket.send(packet);
			packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			received = new String(packet.getData(),0,packet.getLength());
			
		}catch(Exception e){
			
		}
		return received;	
	}
	
	public void close(){
		socket.close();
	}

}
