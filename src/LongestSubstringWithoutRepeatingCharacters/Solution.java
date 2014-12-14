package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	char[] arr = s.toCharArray();
    	int pre = 0;
    	
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	for(int i = 0;i < s.length() ; i++){
    		if(!map.containsKey(arr[i])){
    			map.put(arr[i], i);
    		}else{
    			pre = Math.max(pre, map.size());
    			i = map.get(arr[i]);
    			map.clear();
    		}
    	}
        
    	return Math.max(pre, map.size());
    }
    
    public int lengthOfLongestSubstring1(String s){
    	boolean[] flag = new boolean[256];
    	
    	int result = 0;
    	int j = 0;
    	char[] arr = s.toCharArray();
    	
    	for(int i=0;i <  arr.length;i++){
    		char c = arr[i];
    		if(!flag[c]){
    			flag[c] = true;
    		}else{
    			result = Math.max(result, i - j);
    			for (int k = j; k < i; k++) {
    				if (arr[k] == c) {
    					j = k + 1;
    					break;
    				}
    				flag[arr[k]] = false;
    			}	
    		}
    	}
    	
    	result=Math.max(arr.length-j,result);
    	
    	return result;
    	
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
