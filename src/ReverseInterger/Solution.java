package ReverseInterger;

public class Solution {
	
	public int reverse(int x){
		StringBuilder str  = new StringBuilder();
		boolean flag = checkAbs(x);
		int divInt = Math.abs(x);
		do{
			int modInt = Math.abs(x) % 10;
			divInt = Math.abs(x) / 10;
			str.append(String.valueOf(modInt));
			x = divInt;
			if(x < 10){
				str.append(String.valueOf(x));
			}
		}while (divInt > 10);
		
		if(flag){
			return Integer.parseInt(str.toString());
		}else{
			return  -Integer.parseInt(str.toString());
		}
		
	}
	
	public boolean checkAbs(int x){
		if (x >= 0){
			return true;
		}else{
			return false;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = -123;
		Solution s = new Solution();
		System.out.println(s.reverse(x));
		x = 321;
		System.out.println(s.reverse(x));
	}

}
