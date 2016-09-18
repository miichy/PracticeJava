package SingleNumber;

public class Solution {

	public static void main(String[] args) {
		int[] A = {1,3,5,7,7,1,5};
//		System.out.println(singleNumber(A));
		System.out.println(yihuo(A));

	}
	
	public static int singleNumber(int[] A) {
	    int ones = 0, twos = 0, threes = 0;
	    for (int i = 0; i < A.length; i++) {
	        twos |= ones & A[i];
	        ones ^= A[i];
	        threes = ones & twos;
	        ones &= ~threes;
	        twos &= ~threes;
	    }
	    return ones;
	}
	
	public static int yihuo(int[] A){
		int n = 0;
		for(int i=0;i<A.length;i++){
			n ^= A[i];
		}
		return n;
	}

}
