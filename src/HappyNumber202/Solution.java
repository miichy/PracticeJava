package HappyNumber202;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().isHappy(41));

	}
	
	public boolean isHappy(int n){
		int slow = n;
		int fast = n;
		do{
			slow = digitSquareSum(slow);
			fast = digitSquareSum(fast);
			fast = digitSquareSum(fast);
		}while(slow != fast);
		if (slow == 1)
			return true;
		else 
			return false;
		
	}
	
	public int digitSquareSum(int n){
		int sum = 0,tmp = 0;
		while(n > 0){
			tmp = n % 10;
			sum += tmp * tmp;
			n /= 10;
		}
		return sum;
	}

}
