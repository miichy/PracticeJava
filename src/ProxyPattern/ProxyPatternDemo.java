package ProxyPattern;

public class ProxyPatternDemo {
	
	public static void main(String[] args){
		Image image = new ProxyImage("test_01mb.jpg");
		
		image.display();
		System.out.println("");
		
		image.display();
	}

}
