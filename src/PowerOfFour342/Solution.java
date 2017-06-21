package PowerOfFour342;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPowerOfFour(82));
	}
	
	public boolean isPowerOfFour(int num){
		return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0 ;
	}

}
