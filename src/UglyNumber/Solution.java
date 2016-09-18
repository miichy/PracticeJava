package UglyNumber;

public class Solution {

	public static void main(String[] args) {
		if(isUgly(5))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	
    public static boolean isUgly(int num) {
    	if(num == 1)
    		return true;
    	if(num <= 0)
    		return false;
    	
    	while(num % 2 == 0)
    		num >>= 1;
    	while(num % 3 == 0)
    		num /= 3;
    	while(num % 5 == 0)
    		num /= 5;
        
    	if(num == 1){
    		return true;
    	}else
    		return false;
    }

}
