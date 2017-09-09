package VisitorPattern;

public class Keyboard implements ComputePart{

	@Override
	public void accept(ComputePartVisitor computePartVisitor) {
		computePartVisitor.visit(this);
	}

}
