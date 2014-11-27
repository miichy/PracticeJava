package polymorphism;

public class Ford extends Car{

	public Ford(){
		setName("Ford");
	}

	public void getStart(String a){
		System.out.println(" I am a "+ getName() +" = Ford: getStart....");
		speed();
	}
	
	public void speed(){
		System.out.println("Ford:speed....");
	}
	
	public String toString(){
		return "Ford class: Car : " + getName();
	}
	
}
