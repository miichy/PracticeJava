package AddDigits;

public class Solution {

	public static void main(String[] args) {
		System.out.println(addDigits(38));

	}
	
    public static int addDigits(int num) {
    	int sum = addD(num);
        
    	while(sum > 9){
    		sum = addD(sum);
    	}
        
    	return sum;
    }
    
    public static int addD(int num){
    	if(num < 10)
    		return num;
    	int sum = 0;
    	while(num > 9){
        	sum += num%10;
        	num /= 10;
        }
        sum += num;
        
    	return sum;
    }

}
