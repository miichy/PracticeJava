package FactorialTrailingZeroes172;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.trailingZeroes(15));
	}
	
	public int trailingZeroes(int n){
		int result = 0;
		while( n >= 5){
			n /= 5;
			result += n;
		}
		return result;//n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}

}
