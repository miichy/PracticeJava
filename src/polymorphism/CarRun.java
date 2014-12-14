package polymorphism;

public class CarRun {
	
	public String show(VW v){
		return "show Vw ....";
	}
	
	public String show(Ford f){
		return "show Ford ...";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new VW();
		car.getStart();
		
		Car[] cs = new Car[2];
		VW vw = new VW();
		Ford ford = new Ford();
		
		cs[0] = vw;
		cs[1] = ford;
		
		for (int i = 0; i < 2 ; i++){
			System.out.println(cs[i].getName() + cs[i].getStart());
		}
		System.out.println("====");
		
		Object o = new Ford();
		System.out.println(o.toString());

	}
}
