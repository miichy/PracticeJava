package ImplementstrStr;

public class Solution {
	/**
	 * haystack = "abcdef"
	 * needl = "bcd"  - > 1
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        int index = -1;
        int temp = 0;
        
        if(lenN > lenH){
        	System.out.println("needle must be shorter than haystack");
        	System.exit(0);
        }
        
        for(int i=0;i < lenH;i++){
        	temp = i;
        	if (haystack.charAt(i) != needle.charAt(0)){
        		continue;
        	}else{
        		if (i + lenN > lenH ){
        			return index;
        		}else{
        			for(int j=0 ; j < lenN ; j++){
        				if(haystack.charAt(i + j) != needle.charAt(j) ){
        					index = -1;
        				}else{
        					index = temp;
        				}
        				if(j == lenN){
        					return index;
        				}
        			}
        		}
        	}
        }
        
		return index;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.strStr("abcdbsec", "bs"));

		/**
		 *  TODO
		 *  input   ""  ""
		 *  return       -1
		 *  expected   0
		 */
	}

}
