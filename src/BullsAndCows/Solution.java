package BullsAndCows;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(getHint("1122", "1222"));

	}
	
    public static String getHint(String secret, String guess) {
    	if (secret.length() != guess.length())
    		return "";
    	
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
        int cows = 0;
        int bulls = 0;
        
        for(int i = 0;i < secret.length();i++){
        	char s = secret.charAt(i);
        	char g = guess.charAt(i);
        	
        	if((s ^ g) == 0)
        		bulls += 1;
        	else{
        		if(map.containsKey(s)){
            		int cnt = map.get(s);
            		cnt++;
            		map.put(s, cnt);
            	}else{
            		map.put(s, 1);
            	}	
        	}
        	
        }
        
        for(int i = 0;i < secret.length();i++){
        	char s = secret.charAt(i);
        	char g = guess.charAt(i);
        	if( s != g){
        		
        		if(map.containsKey(g)){
        			cows++;
        			if(map.get(g) == 1){
        				map.remove(g);
        			}else{
        				int cnt  = map.get(g);
        				cnt--;
        				map.put(s, cnt);
        			}
        		}
        		
        	}
        }
    	
    	return bulls + "A" + cows + "B";
    }

}
