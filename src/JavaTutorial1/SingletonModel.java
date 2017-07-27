package JavaTutorial1;

public class SingletonModel {

	public static void main(String[] args) {
		//TODO
	}

}

class ClazzA{
	private static ClazzA i = new ClazzA();
	public  static ClazzA newInstance(){
		return i;
	}
	
	private ClazzA(){}
}

class ClazzB{
	private static ClazzB i = null;
	public static synchronized ClazzB newInstance(){
		if(i == null)
			i = new ClazzB();
		return i;
	}
	
	private ClazzB() {}
}