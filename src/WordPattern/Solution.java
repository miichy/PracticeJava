package WordPattern;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		String str = "dog cat cat dog";
		String pattern = "abba";
		
		if(wordPattern(pattern, str))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	
    public static boolean wordPattern(String pattern, String str) {
        int pLen = pattern.length();
        String[] strArr = str.replace(' ', ',').split(",");
        
        if(pLen != strArr.length){
        	return false;
        }
        
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0;i < pLen;i++){
        	char p = pattern.charAt(i);
        	String s = strArr[i];
        	
        	if(!map.containsKey(p)){
        		if(map.containsValue(s))
        			return false;
        		map.put(p, s);
        	}else{
        		if(!map.get(p).equals(s))
        			return false;
        	}
        }
    	
    	return true;
    }

}
