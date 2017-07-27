package JavaTutorial1;

public class FactoryModel {

	public static void main(String[] args) {
		AnimalFactory af = new DogFactory();
		Animal a = af.getAnimal();
	}

}

abstract class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

abstract class AnimalFactory{
	public abstract Animal getAnimal();
}

class DogFactory extends AnimalFactory{

	@Override
	public Animal getAnimal() {
		System.out.println("Dog");
		return new Dog();
	}
}

class CatFactory extends AnimalFactory{

	@Override
	public Animal getAnimal() {
		System.out.println("Cat");
		return new Cat();
	}
	
}