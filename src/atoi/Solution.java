package atoi;

public class Solution {
	
	public int atoi(String str) {
		int len = str.length();
		int sum = 0;
		for (int i = 0;i < len ;i++){
			String s = str.charAt(i) + "";
			int num = 0;
			try{
				num = Integer.parseInt(s, 10);
			}catch(NumberFormatException e){
				System.out.println("Input Wrong! " + str);
				return 0;
			}
			sum  = sum*10 + num;
		}
		
		return sum;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.atoi("22a"));
		
		System.out.println(String.valueOf(Character.toChars(49)));
		System.out.println(Character.getNumericValue('z'));
	}

}
