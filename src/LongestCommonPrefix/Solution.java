package LongestCommonPrefix;

public class Solution {
	/**
	 * ["obscure","obscures","obscured","obscuring"] --> "obscur"
	 * ["abc", "ab", "abcd"] --> "ab"
	 */
	public String longestCommonPrefix(String[] strs) {
        //get the shortest length of str[i]
		int shortestLen = strs[0].length();
		int matchNum = 0;
		int len = strs.length;
		
		for (int i=0;i< len;i++){
			if (strs[i].length() < shortestLen){
				shortestLen = strs[i].length();
			}
		}
		
		for (int i=0;i < shortestLen; i++){
			if(checkSimilarity(i, strs)){
				matchNum++;
			}
		}
		
		StringBuilder str = new StringBuilder();
		
		for (int i = 0;i < matchNum;i++){
			str.append(strs[0].charAt(i));
		}
		
		return str.toString();
    }
	
	public boolean checkSimilarity(int index,String[] strs){
		int len = strs.length;
		char temp = strs[0].charAt(index);
		for (int i=1;i < len;i++){
			if (strs[i].charAt(index) != temp){
				return false;
			}
			if (i == len -1){
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs = {"obscure","obscures","obscured","obscuring"};
		
		Solution s = new Solution();
		System.out.println(s.longestCommonPrefix(strs));
		String[] strs1 = {"abc", "ab", "abcd"};
		System.out.println(s.longestCommonPrefix(strs1));
	}

}
