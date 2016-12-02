package LongestPalindromicSubstring;

import java.util.Arrays;

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
    
    public String longestPalindrome1(String s) {

    	if(s.length() == 1)
    		return s;
    	else if(s.length() < 1)
    		return null;
    	int maxLen = 0;
    	String resStr = String.valueOf(s.charAt(0));
    	for(int i = 0;i < s.length(); i++){
    		for(int j = s.length() -1;j > i;j--){
    			boolean flag = true;
    			int start = i;
    			int end = j;
    			while(start < end){
    				if(s.charAt(start) != s.charAt(end)){
    					flag = false;
    					break;
    				}else{
    					start++;
    					end--;
    				}
    			}
    			
    			if(flag){
    				String str = s.substring(i, j+1);
        			if(str.length() > maxLen){
    					resStr = str;
    					maxLen = str.length();
    				}
    			}
    			
    		}
    	}

    	return resStr;
    	
    }
    
    public String preProcess(String s){
    	if(s == null || s.length() <= 1){
    		return s;
    	}
    	String str = "";
    	for(int i = 0; i < s.length();i++){
    		str += "#" + s.substring(i, i + 1);
    	}
    	str += "#";
    	return str;
    }
    
    public String longestPalindrome2(String s){
    	if(s == null || s.length() <= 1)
    		return s;
    	
    	String str = preProcess(s);
    	int len = str.length();
    	int[] p = new int[len];
    	int c = 0,r = 0;//
    	int m = 0,n = 0;//the walking indices to compare if two elements are the same
    	
    	for(int i = 1;i < len ;i++){
    		if(i > r){
    			p[i] = 0;
    			m = i - 1;
    			n = i + 1;
    		}else{
    			int i2 = c*2 - i;
    			if(p[i2] < (r - i)){
    				p[i] = p[i2];
    				m = -1;
    			}else{
    				p[i] = r - i;
    				n = r + 1;
    				m = i*2 -n;
    			}
    		}
    		while(m >= 0 && n < len && str.charAt(m) == str.charAt(n)){
    			p[i]++;
    			m--;
    			n++;
    		}
    		if((i + p[i]) > r){
    			c = i;
    			r = i + p[i];
    		}
    	}
    	int llen = 0; c =0;
    	for(int i = 1;i < len;i++){
    		if(llen < p[i]){
    			llen = p[i];
    			c = i;
    		}
    	}
    	String ss = s.substring((c - llen)/2, (c + llen + 1)/2);
    	
    	return ss;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s =  new Solution();
		System.out.println(s.longestPalindrome2("aaaaa"));
//		System.out.println(s.longestPalindrome2("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
		System.out.println(s.preProcess("abcdefg"));
	}

}
