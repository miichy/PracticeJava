package annotationtry;

import annotationtry.FruitColor.Color;

public class Apple {
	
	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor=Color.RED)
	private String appleColor;
	
	@FruitProvider(id=1,name="BigApple",address="YourHome")
	private String appleProvider;
	
	public void setAppleColor(String appleColor){
		this.appleColor = appleColor;
	}
	
	public String getAppleColor(){
		return appleColor;
	}

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	
	public void displayName(){
		System.out.println("What fruit do you have? : Apple");
	}

}
