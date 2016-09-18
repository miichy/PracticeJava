package FirstUniqueCharacterInAString;

public class Solution {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("cd"));
	}
	
	public static int firstUniqChar(String s) {
        int len = s.length();
        if(len <= 0)
        	return -1;
        if(len == 1)
        	return 0;
        	
        char[] chars = s.toCharArray();
        int index = 0;
        char tmp = ' ';
        while (index < len){  ///  aabbccdd  locate to the dd the first d index.not into the for 
        	if(chars[index] != '0')
        		tmp = chars[index];
        	else {
        		index++;
        		continue;
        	}
        	for(int i = index+1;i < len;i++){
        		if(chars[i] == '0')
        			continue;
            	if((tmp ^ chars[i]) == 0){
            		chars[index] = '0';
            		chars[i] = '0';
            	}
            }
        	index++;
        }
        
        for(int i =0;i<len;i++){
        	if(chars[i] != '0')
        		return i;
        }
        
        return -1;
    }

}
