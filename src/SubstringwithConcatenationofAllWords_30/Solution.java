package SubstringwithConcatenationofAllWords_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
    public List<Integer> findSubstring(String s, String[] words) {
    	
        List<Integer> ret = new ArrayList<Integer>();
        if(s == null || s.length() == 0||words == null||words.length == 0)
        	return ret;
        
        HashMap<String,	Integer> map = new HashMap<String, Integer>();
        for(String word:words){
        	if(map.containsKey(word)){
        		map.put(word, map.get(word) + 1);
        	}else{
        		map.put(word, 1);
        	}
        }
        
        int singleLen = words[0].length();
        
        for(int j = 0;j < singleLen;j++){
        	HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
        	int start = j;
        	int count = 0;
        	
        	for(int i = j;i <= s.length() - singleLen;i = i + singleLen){
        		String ss = s.substring(i, i + singleLen);
        		if(map.containsKey(ss)){
        			if(currentMap.containsKey(ss)){
        				currentMap.put(ss, currentMap.get(ss) + 1);
        			}else{
        				currentMap.put(ss, 1);
        			}
        			count++;
        			
        			while(currentMap.get(ss) > map.get(ss)){
        				String left = s.substring(start,start+singleLen);
        				currentMap.put(left, currentMap.get(left) - 1);
        				
        				count--;
        				start = start + singleLen;
        			}
        			
        			if(count == words.length){
        				ret.add(start);
        				String left = s.substring(start,start + singleLen);
        				currentMap.put(left, currentMap.get(left) -1);
        				count--;
        				start = start + singleLen;
        			}
        		}else{
        			currentMap.clear();
        			start = i+singleLen;
        			count = 0;
        		}
        		
        	}
        }
        

        return ret;
    }
    
    
	public static void main(String[] args) {
		String s ="barfoothefoobarman";
		String[] words = {"foo", "bar"};
		Solution sss = new Solution();
		List<Integer> a = sss.findSubstring(s, words);
		for(int i=0; i < a.size();i++){
			System.out.println(a.get(i));
		}
	}

}
