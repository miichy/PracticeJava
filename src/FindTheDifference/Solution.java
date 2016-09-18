package FindTheDifference;

public class Solution {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abc","dacb"));
		System.out.println(Integer.toBinaryString('a'));
		System.out.println(Integer.toBinaryString('b'));
		System.out.println((int)('a'));
	}
	
	public static char findTheDifference(String s, String t) {
        char compare = 0;
        for (int i=0 ;i < s.length();i++){
        	compare ^= s.charAt(i);
        }
        for (int i=0 ;i < t.length();i++){
        	compare ^= t.charAt(i);
        }
        return compare;
    }
	
	
}
