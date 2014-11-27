package polymorphism;

public class VW extends Car{
	
	public VW(){
		setName("VW");
	}

	public void getStart(String a){
		System.out.println("I am a "+ getName() +" = VW: getStart....");
		speed();
	}
	
	public void speed(){
		System.out.println("VW:speed....");
	}

}
