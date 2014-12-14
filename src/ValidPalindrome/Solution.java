package ValidPalindrome;

public class Solution {

    public boolean isPalindrome(String s) {
    	s = simple(s);
    	
    	int len = s.length();
    	if( len <= 1){
    		return true;
    	}
    	
    	char[] charArr = s.toCharArray();
    	
    	int pre = 0;
    	int tail = len -1;
    	
    	 while(pre < tail){
    		 if(isSame(charArr[pre], charArr[tail])){
    			 pre++;
    			 tail--;
    		 } else{
    			 return false;
    		 }
    		 
    	 }
    	
    	return true;
    }
    
    public boolean isSame(char a,char b){
    	if ((Math.abs(a - b) == 32)||(Math.abs(a - b) == 0) ){
    		return true;
    	}
    	return false;
    }
    
    public String simple(String s){
    	StringBuilder str = new StringBuilder();
    	for(int i=0;i < s.length();i++){
    		char tmp = s.charAt(i);
    		if((tmp >= '0') && (tmp <= '9') ){
    			str.append(tmp);
    		}else if((tmp >= 'a'  && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z')){
    			str.append(tmp);
    		}
    	}
    	return str.toString();
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		if(s.isPalindrome("aA.")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
