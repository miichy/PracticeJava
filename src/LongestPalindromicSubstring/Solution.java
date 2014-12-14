package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
    	int maxPalinLength = 0;
    	String longestPalindrome = null;
        for(int i=0;i < s.length();i++){
        	for(int j=i+1;j < s.length() ;j++){
        		int len = j - i;
    			String curr = s.substring(i, j + 1); //this takes a looooooooong time!
    			if (isPalindrome(curr)) {
    				if (len > maxPalinLength) {
    					longestPalindrome = curr;
    					maxPalinLength = len;
    				}
    			}
        	}
        }
    	return longestPalindrome;
    }
    
    public boolean isPalindrome(String s){
    	int len = s.length();
    	if(len <= 1){
    		return true;
    	}
    	int pre = 0;
    	int tail = len - 1;
    	while(pre < tail){
    		if(s.charAt(pre) != s.charAt(tail)){
    			return false;
    		}else{
    			pre++;
    			tail--;
    		}
    	}
    	
    	return true;
    	
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s =  new Solution();
		System.out.println(s.longestPalindrome("jfkdsalfdabcbakjldsajfd"));

	}

}
