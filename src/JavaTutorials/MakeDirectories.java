package JavaTutorials;

import java.io.File;

public class MakeDirectories {

	public static void main(String[] args) {
		if(args.length < 1 )
			usage();
		if(args[0].equals("-r")){
			if(args.length != 3)
				usage();
			File old = new File(args[1]);
			File rename = new File(args[2]);
			old.renameTo(rename);
			fileData(old);
			fileData(rename);
			return ;
		}
		int count  = 0;
		
		
	}
	
	private static void usage(){
		System.err.println("Usage:MakeDirectories path1... \n" +
	"Creates each part\n "+ "Usage:MakeDirectories -d path1 path2 \n");
		System.exit(1);
	}
	
	private static void fileData(File f){
		System.out.println(
				"Absolute paht: " + f.getAbsolutePath()+
				"\nCan read:" + f.canRead()+
				"\nCanWrite:" + f.canWrite() + 
				"\ngetName:" + f.getName() + 
				"\nlength:" + f.length() + 
				"\ngetPath:" + f.getPath() + 
				"\nlastModified:" + f.lastModified()
				);
		if(f.isFile())
			System.out.println("It is a file.");
		else if(f.isDirectory())
			System.out.println("It is a Directory.");
	}
	
}
