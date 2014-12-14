package Proxy.dynamicproxy;

import Proxy.staticproxy.HelloService;
import Proxy.staticproxy.HelloServiceImpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloService helloService = new HelloServiceImpl();
		HelloService helloServiceProxy = HelloServiceProxyFactory.getHelloServiceProxy(helloService);
		System.out.println("dynamic proxy name : " + helloServiceProxy.getClass().getName());
		System.out.println(helloServiceProxy.echo("Hello"));

	}

}
