package VisitorPattern;

public class Computer implements ComputePart{
	ComputePart[] parts;
	
	public Computer(){
		parts = new ComputePart[] {new Mouse(),new Keyboard(),new Monitor()};
	}
	
	@Override
	public void accept(ComputePartVisitor computePartVisitor) {
		for(int i = 0 ; i < parts.length; i++){
			parts[i].accept(computePartVisitor);
		}
		computePartVisitor.visit(this);
	}

}
