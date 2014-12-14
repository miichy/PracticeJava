package Proxy.staticproxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HelloService helloService = new HelloServiceImpl();
		HelloService helloServiceProxy = new HelloServiceProxy(helloService);
		System.out.println(helloServiceProxy.echo("hello"));
		
	}

}
