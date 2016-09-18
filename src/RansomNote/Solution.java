package RansomNote;

public class Solution {

	public static void main(String[] args) {
		if(canConstruct("aab", "bbaajkdl")){
			System.out.println("YES");
		}
		
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] cnt = new int[26];
		
		for(int i=0;i < magazine.length();i++){
			cnt[magazine.charAt(i) - 'a']++;
		}
		for(int i = 0;i < ransomNote.length();i++){
			if(--cnt[ransomNote.charAt(i) - 'a'] < 0){
				return false;
			}
		}
        
		return true;
    }

}
