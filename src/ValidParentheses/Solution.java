package ValidParentheses;

public class Solution {
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 * 
	 * @param s
	 * @return
	 */
	
	public  boolean isValid(String s) {
		int len = s.length();
		if (len % 2 != 0){
			System.out.println("Must to be couples!");
			System.exit(0);
		}
		
		for(int i=0;i < len;i=i+2){
			int formInt = checkChar(s.charAt(i));
			int latterInt = checkChar(s.charAt(i+1));
			if ((formInt + 1) != latterInt){
				return false;
			}
		}
        return true;
    }
	
	public int checkChar(char c){
		switch (c) {
		case '(':
			return 1;
		case ')':
			return 2;
		case '[':
			return 5;
		case ']':
			return 6;
		case '{':
			return 8;
		case '}':
			return 9;
		default:
			return 0;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		if(s.isValid("}{{}[]()")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
