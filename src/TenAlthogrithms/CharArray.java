package TenAlthogrithms;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {

		String a = "kobe Bryant";
		char[] as = a.toCharArray();
		int[] ints = charToInt(as);
		Arrays.sort(ints);
		System.out.println(ints[1]);
		String aStr = Arrays.toString(as);
		System.out.println(aStr);
		
		String b = "ko ice";
		System.out.println(b);
		
		System.out.println(aStr.charAt(0));
		System.out.println(aStr.length());
	}
	
	public static int[] charToInt(char[] as){
		int len = as.length;
		int[] ints = new int[len]; 
		for(int i = 0;i < len; i++){
			System.out.println(as[i]);
			System.out.println((int) as[i]);
			ints[i] = (int) as[i];
		}
		
		return ints;
	}

}
