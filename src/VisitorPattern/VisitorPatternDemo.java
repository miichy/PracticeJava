package VisitorPattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputePart computer = new Computer();
		computer.accept(new ComputePartDisplayVisitor());
	}
}
