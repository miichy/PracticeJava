package ReverseVowelsofaString345;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseVowels("hello"));
	}
	
    public String reverseVowels(String s) {
    	if(s == null || s.trim() == "")
    		return s;
    	int start = 0;
    	int tail = s.length() -1;
    	StringBuffer sb = new StringBuffer();
    	String tmp = "";
    	
    	while(start < tail){
    		boolean first = isVowel(s.charAt(start));
    		boolean last = isVowel(s.charAt(tail));
    		if(first && last){
    			char tmp1 = s.charAt(start);
    			char tmp2 = s.charAt(tail);
    			tmp = replacer(s,start,tmp2);
    			tmp = replacer(tmp,tail,tmp1);
    			start++;
    			tail--;
    			continue;
    		}
    		if(!first && !last){
    			start++;
    			tail--;
    			continue;
    		}
    		if(first){
    			tail--;
    		}
    		if(last){
    			start++;
    		}
    	}
        
    	return tmp;
    }
    
    public String replacer(String s,int i,char c){
    	if(s == null || i < 0 || i > s.length()){
    		System.out.println("Wrong String or Wrong index");
    		return s;
    	}
    	StringBuffer sb = new StringBuffer();
    	
    	for (int j = 0; j < s.length();j++){
    		if(j != i)
    			sb.append(s.charAt(j));
    		else
    			sb.append(c);
    	}
    	
    	s = sb.toString();
    	return s;
    }
    
    public boolean isVowel(char c){
    	switch (c) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		default:
			return false;
		}
    }

}
