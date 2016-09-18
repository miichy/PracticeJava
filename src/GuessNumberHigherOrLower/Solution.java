package GuessNumberHigherOrLower;

public class Solution extends GuessGame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int guessNumber(int n){
		int L = 0,R = n;
		
		while(L < R){
			int mid = L + (R - L) >> 1;
			int res = guess(mid);
			if(res ==0 )
				return mid;
			else if(res == 1)
				L = mid +1;
			else
				R = mid -1;
		}
		
		return L;
		
	}

}
