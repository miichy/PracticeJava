package ValidAnagram;

public class Solution {

	public static void main(String[] args) {
		if(isAnagram("cat", "dog"))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	
    public static boolean isAnagram(String s, String t) {
    	int slen = s.length();
    	int tlen = t.length();
    	int[] cnt = new int[26];
    	if(slen <= tlen){
    		for(int i=0; i < slen; i++){
        		cnt[s.charAt(i) - 97]++;
        	}
        	
        	for(int i=0;i< tlen;i++){
        		if(--cnt[t.charAt(i) - 97]  < 0)
        			return false;
        	}
    	}else{
    		for(int i=0; i < tlen; i++){
        		cnt[t.charAt(i) - 97]++;
        	}
        	
        	for(int i=0;i< slen;i++){
        		if(--cnt[s.charAt(i) - 97]  < 0)
        			return false;
        	}
    	}
    	
    	
    	return true;
    }

}
