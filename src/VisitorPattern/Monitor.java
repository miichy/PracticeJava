package VisitorPattern;

public class Monitor implements ComputePart{

	@Override
	public void accept(ComputePartVisitor computePartVisitor) {
		computePartVisitor.visit(this);
	}

}
