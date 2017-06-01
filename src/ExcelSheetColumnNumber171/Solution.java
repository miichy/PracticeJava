package ExcelSheetColumnNumber171;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.titleToNumber("A"));
	}
	
    public int titleToNumber(String s) {
    	if(s == null || s.length() <= 0)
    		return -1;
    	int result = 0;
   
        for(int i = 0;i < s.length(); i++){
        	result = (result * 26) + ((int)s.charAt(i) - 64);
        }
    	return result;
    }

}
