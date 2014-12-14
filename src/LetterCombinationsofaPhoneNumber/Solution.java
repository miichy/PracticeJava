package LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

import polymorphism.extendtest.A;

public class Solution {
	/**
	 * Input:Digit string "23"
	 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 * @param digits
	 * @return
	 */
    public List<String> letterCombinations(String digits) {
    	List<String> re = new ArrayList<String>();
    	re.add("");
    	if(digits.length() < 1){
    		return re;
    	}
    	for(int i = 0;i<digits.length(); i++){
    		re = checkTheDigit(digits.charAt(i),re);
    	}
        return re;
    }
    
    public List<String> checkTheDigit(char d,List<String> strs){
    	List<String> newStr = new ArrayList<String>();
    	
    	switch (d) {
		case '2': 
			newStr = helpAddToNewStr(strs,"abc");
			break;
		case '3':
			newStr = helpAddToNewStr(strs,"def");
			break;
		case '4':
			newStr = helpAddToNewStr(strs,"ghi");
			break;
		case '5':
			newStr = helpAddToNewStr(strs,"jkl");
			break;
		case '6':
			newStr = helpAddToNewStr(strs,"mno");
			break;
		case '7':
			newStr = helpAddToNewStr(strs,"pqrs");
			break;
		case '8':
			newStr = helpAddToNewStr(strs,"tuv");
			break;
		case '9':
			newStr = helpAddToNewStr(strs,"wxyz");
			break;
		default:
			break;
		}
    	
    	return newStr;
    }
    
    public List<String> helpAddToNewStr(List<String> strs,String a){
    	List<String> newStr = new ArrayList<String>();
    	
    	for(int i = 0;i < strs.size();i++){
    		for(int j = 0 ;j < a.length();j++){
    			String str = strs.get(i) + a.charAt(j) ;
//    			System.out.println(str);
    			newStr.add(str);
    		}
    	}
    	
    	return  newStr;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		s.letterCombinations("2379");

	}

}
