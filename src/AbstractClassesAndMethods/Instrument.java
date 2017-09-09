package AbstractClassesAndMethods;

import java.io.FilenameFilter;

public abstract class Instrument {
	
	private int i ;
	public String what(){
		return "Instrument";
	}
	
	public abstract void adjust();
	
	public FilenameFilter ff;
	

}
