package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReaderAndWriter {
	
	public static void concennateFile(String... fileName) throws IOException{
		String str;
		BufferedWriter writer = new BufferedWriter(new FileWriter("/User/liuke/work/fskxp/test.txt"));
		for(String name : fileName){
			BufferedReader reader = new BufferedReader(new FileReader(name));
			while((str = reader.readLine()) != null){
				writer.write(str);
			}
			writer.newLine();
		}
	}
	
	public static void main(String[] args) {
		char[] buffer = new char[512];
		int numberRead = 0;
		FileReader fr = null;//new FileReader("/Users/liuke/work/fskxp/logout.txt");
		PrintWriter fw = null;
		try{
			fr = new FileReader("/Users/liuke/work/fskxp/logout.txt");
			fw = new PrintWriter(System.out);
			
			while((numberRead = fr.read(buffer)) != -1){
				fw.write(buffer,0,numberRead);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			fw.close();
		}
		
	}
}
