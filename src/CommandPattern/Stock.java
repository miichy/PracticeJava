package CommandPattern;

public class Stock {
	
	protected String name = "ABC";
	protected int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [Name: " + name + ",Quantity: " + quantity + " ]bought");
	}
	
	public void sell(){
		System.out.println("Stock [Name: " + name + ",Quantity: " + quantity + " ]sold");
	}

}
