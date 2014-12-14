package PalindromeNumber;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Solution {
	
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
		int x = -313;
		Solution s = new Solution();
		if(s.isPalindrome(x)){
			System.out.println(x + "is a Palindrome!");
		}else{
			System.out.println("No!");
		}
		
	}

}
