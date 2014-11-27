package polymorphism;

public class Car {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Car(){
		
	}

	public String getStart(){
		return (" I am a "+ getName() +" = Car:getStart...");
//		speed();
	}

	public void speed(){
		System.out.println("Car:speed...");
	}
}
