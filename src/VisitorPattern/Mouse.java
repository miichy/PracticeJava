package VisitorPattern;

public class Mouse implements ComputePart{

	@Override
	public void accept(ComputePartVisitor computePartVisitor) {
		computePartVisitor.visit(this);
	}

}
