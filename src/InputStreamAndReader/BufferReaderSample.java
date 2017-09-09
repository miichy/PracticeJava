package InputStreamAndReader;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderSample {
	
//	FileInputStream
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input your name: ");
		StringBuffer sb = new StringBuffer("welcome ");
		try{
			sb.append(br.readLine());
			br.close();
			System.out.println(sb);
		}catch(IOException e){
			System.out.println("Error Encounterd getting user input : " +  e.getMessage());
			e.printStackTrace();
		}
	}

}
