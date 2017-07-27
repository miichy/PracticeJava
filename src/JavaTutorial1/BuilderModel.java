package JavaTutorial1;

public class BuilderModel {

	public static void main(String[] args) {
		Builder b = new BuilderImpl1();
		Director d = new Director(b);
		Product p = d.createProduct();
	}

}


interface Builder{
	void buildPart1();
	void buildPart2();
	void buildPart3();
	Product getProduct();
}

class BuilderImpl1 implements Builder{

	@Override
	public void buildPart1() {
		System.out.println("create part1");
	}

	@Override
	public void buildPart2() {
		System.out.println("create part2");
	}

	@Override
	public void buildPart3() {
		System.out.println("create part3");
	}

	@Override
	public Product getProduct() {
		return new Product();
	}
	
}

class Director{
	Builder b ;
	public Director(Builder b){
		this.b  = b;
	}
	public Product createProduct(){
		b.buildPart1();
		b.buildPart2();
		b.buildPart3();
		return b.getProduct();
	}
}

class Product{}