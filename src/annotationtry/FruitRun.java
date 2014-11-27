package annotationtry;

public class FruitRun {
	public static void main(String[] args) {
		
		FruitInfoUtil.getFruitInfo(Apple.class);
		
		Apple a = new Apple();
		a.displayName();
	}
}
