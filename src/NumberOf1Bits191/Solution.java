package NumberOf1Bits191;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(-123));
		System.out.println(Integer.toBinaryString(123));
		Solution s = new Solution();
		System.out.println(s.hammingWeight(123));
	}
	
    public int hammingWeight(int n) {
    	String str = Integer.toBinaryString(n);
    	int size = str.length();
    	int result = 0;
    	for(int i = 0; i < size ; i++){
    		if(str.charAt(i) == '1')
    			result += 1;
    	}
    	
    	return result;
    }

}
