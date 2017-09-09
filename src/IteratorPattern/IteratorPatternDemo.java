package IteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRespository nameRespository = new NameRespository();
		
		for(Iterator iter = nameRespository.getIterator();iter.hasNext();){
			String name = (String) iter.next();
			System.out.println("Name: " + name);
		}
	}

}
