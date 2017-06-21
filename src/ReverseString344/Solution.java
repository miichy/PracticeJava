package ReverseString344;

public class Solution {

	public static void main(String[] args) {
		Solution s  = new Solution();
		System.out.println(s.reverseString2("abc"));
	}

    public String reverseString(String s) {
    	StringBuilder sb = new StringBuilder();
    	String result ="";
        int len = s.length();
        for(int i = len -1;i >=0 ; i--){
        	sb.append(s.charAt(i));
        }
        result = sb.toString();
        return result;
    }
    
    public String reverseString2(String s){
    	char[] word = s.toCharArray();
    	int i = 0;
    	int j = s.length() - 1;
    	while(i < j){
    		char tmp = word[i];
    		word[i] = word[j];
    		word[j] =  tmp;
    		i++;
    		j--;
    	}
    	return new String(word);
    }
    
}
