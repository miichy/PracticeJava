package DecodeWays;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
 Given an encoded message containing digits, determine the total number of ways to decode it.

 For example,
 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.
 */

public class Solution {

    public int numDecodings(String s) {

        return -1;
    }



    public int charToInt(char c){
        return Character.getNumericValue(c) - 9;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.numDecodings("abc"));
        System.out.println(s.charToInt('a'));
        System.out.println(Integer.valueOf('a'));
    }

}
