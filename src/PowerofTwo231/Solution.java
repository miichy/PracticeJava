package PowerofTwo231;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(8));
		System.out.println(0b1000);
		Solution s = new Solution();
		if(s.isPowerOfTwo(8))
			System.out.println("YES");
		else{
			System.out.println("NO");
		}
	}
	
    public boolean isPowerOfTwo(int n) {
    	if(n <= 0)
    		return false;
    	String targetStr = Integer.toBinaryString(n);
    	int len = targetStr.length();
    	for(int i = 1 ;i < len; i++){
    		if (targetStr.charAt(i) != '0')
    			return false;
    	}
    	return true;
    }

}
