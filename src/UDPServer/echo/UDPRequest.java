package UDPServer.echo;

import java.net.SocketException;

public class UDPRequest {
	static EchoClient client;
	
	public static void UDPStarter() throws Exception{
		new EchoServer().start();
		client = new EchoClient();
	}
	
	public static void UDPClose(){
		client.sendEcho("end");
		client.close();
	}

	public static void main(String[] args) throws Exception {
		UDPRequest re = new UDPRequest();
		re.UDPStarter();
		String echo = re.client.sendEcho("hello");
		System.out.println(echo);
		echo = re.client.sendEcho("working");
		re.UDPClose();

	}

}
