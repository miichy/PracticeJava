package RomanToInteger;

public class Solution {
	/*
	 * I   1
	 * V  5
	 * X  10
	 * L   50
	 * C   100
	 * D   500
	 * M   1000
	 * */
	public enum Abit{
		I,II,III,IV,V,VI,VII,VIII,IX  // 1,2,3,4,5,6,7,8,9
	}
	public enum Tens{
		X,XX,XXX,XL,L,LX,LXX,LXXX,XC  // 10,20,30,40,50,60,70,80,90
	}
	public enum Hunds{
		C,CC,CCC,CD,D,DC,DCC,DCCC,CM //100.200.300.400.500.600.700.800.900
	}
	public enum Thous{
		M,MM,MMM   // 1000  2000   3000
	}
	
	public int checkChar(char c){
		switch (c) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;
		}
	}

	// true is add,false is Sub
	public boolean checkAddOrSub(char theOne,char rightNext){
		if (checkChar(theOne) >= checkChar(rightNext) ){
			return true;
		}else{
			return false;
		}
		
	}
	
	public int romanToInt(String s){
		int len = s.length();
		int sum = 0;
		// check I V X C M    sum+= 1 5 10 100 ....
		// checkAddOrSub('C')   look the left next , true is add,like 'CC'  false is Sub 'CD'    
		for (int i = len -1;i > 0;i--){
			if (checkAddOrSub(s.charAt(i), s.charAt( i - 1))){
				sum += checkChar(s.charAt(i));
			} 
		}
		sum += checkChar(s.charAt(0));
		return sum;
	}
	
	public String intToRoman(int x){
		StringBuilder str = new StringBuilder();
		
		int thous = x / 1000;
		x = x % 1000;
		int hunds = x /100;
		x = x % 100;
		int tens = x / 10;
		x = x % 10;
		int bits = x;
		
		switch (thous) {
		case 1:
			str.append('M');
			break;
		case 2:
			str.append("MM");
			break;
		case 3:
			str.append("MMM");
			break;
		default:
			break;
		}
		switch (hunds) {
		case 1:
			str.append('C');
			break;
		case 2:
			str.append("CC");
			break;
		case 3:
			str.append("CCC");
			break;
		case 4:
			str.append("CD");
			break;
		case 5:
			str.append("D");
			break;
		case 6:
			str.append("DC");
			break;
		case 7:
			str.append("DCC");
			break;
		case 8:
			str.append("DCCC");
			break;
		case 9:
			str.append("CM");
			break;
		default:
			break;
		}
		switch (tens) {
		case 1:
			str.append('X');
			break;
		case 2:
			str.append("XX");
			break;
		case 3:
			str.append("XXX");
			break;
		case 4:
			str.append("XL");
			break;
		case 5:
			str.append("L");
			break;
		case 6:
			str.append("LX");
			break;
		case 7:
			str.append("LXX");
			break;
		case 8:
			str.append("LXXX");
			break;
		case 9:
			str.append("XC");
			break;
		default:
			break;
		}
		switch (bits) {
		case 1:
			str.append('I');
			break;
		case 2:
			str.append("II");
			break;
		case 3:
			str.append("III");
			break;
		case 4:
			str.append("IV");
			break;
		case 5:
			str.append("V");
			break;
		case 6:
			str.append("VI");
			break;
		case 7:
			str.append("VII");
			break;
		case 8:
			str.append("VIII");
			break;
		case 9:
			str.append("IX");
			break;
		default:
			break;
		}
		return str.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		//TODO  fix 
		System.out.println(s.romanToInt("MMDCXXVI"));
		System.out.println(s.intToRoman(2626));

	}

}
