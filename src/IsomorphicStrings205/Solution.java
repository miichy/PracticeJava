package IsomorphicStrings205;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isIsomorphic("abcabc", "defdeg"));
	}
	
    public boolean isIsomorphic(String s, String t) {
    	if(s.length() != t.length() ||  s ==  null || t == null)
    		return false;
    	int len = s.length();
        Map<Character,Integer> mp1 = new HashMap<Character,Integer>();
        Map<Character,Integer> mp2 = new HashMap<Character,Integer>();
        
        for(int i = 0 ;i < len;i++){
        	if( !mp1.containsKey(s.charAt(i)) && !mp2.containsKey(t.charAt(i))){
        		mp1.put(s.charAt(i), i);
        		mp2.put(t.charAt(i), i);
        	}else if (mp1.containsKey(s.charAt(i)) && mp2.containsKey(t.charAt(i)) ){
        		if(mp1.get(s.charAt(i)) != mp2.get(t.charAt(i)))
        			return false;
        		else{
        			mp1.put(s.charAt(i), i);
            		mp2.put(t.charAt(i), i);
        		}
        	}else{
        		return false;
        	}
        }
        
    	return true;
    }

}
