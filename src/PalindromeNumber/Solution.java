package PalindromeNumber;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Solution {
	
    public boolean isPalindrome1(int x) {
    	long s = Math.abs((long)x);
    	String str = Long.toString(s);
    	int len = str.length();
    	if(len <= 1)
    		return true;
        int start = 0;
        int end = len - 1;
    	while(start < end){
    		if((str.charAt(start) ^ str.charAt(end)) == 0){
    			start++;
    			end--;
    		}else{
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public boolean isPalindrome(int x){
		ReverseInterger.Solution s = new ReverseInterger.Solution();
		int revX = s.reverse(x);
		
		if (revX == x){
			return true;
		}
		
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = -2147447412;
		Solution s = new Solution();
		if(s.isPalindrome1(x)){
			System.out.println(x + "is a Palindrome!");
		}else{
			System.out.println("No!");
		}
		
	}

}
