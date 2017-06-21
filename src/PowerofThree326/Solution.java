package PowerofThree326;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPowerOfThree(81));
	}
	
	public boolean isPowerOfThree(int n){
		return (n >0 && 1162261467 % n == 0);
	}

}
