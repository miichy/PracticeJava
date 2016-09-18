package RotateFunction;

public class Solution {

	public static void main(String[] args) {
		int[] A = {-1, -1};
		System.out.println(maxRotateFunction(A));
	}
	
	 public static int maxRotateFunction(int[] A) {
		 int n = A.length;
		 if(n <= 0)
			 return 0;
		 
		 int[] As = new int[n];
		 int index = 0;
		 int max = 0;
		 while(index < n){
			 
			 for(int i=0,k=n-index;i<n;i++,k++){
				 As[index] += i*A[k%n];
			 }
			 if(index == 0 ){
				 max = As[index];
			 }
			 max = (max > As[index] ? max : As[index]);
			 index++;
		 }
		 
//		 time limited pass project
//		 F(1) - F(0) = Sum[A[i]] - (n-1) A[n-1]
//		 F(k) - F(k-1) = Sum[A[i]] - (n-1) A[n-k]
		 int rotateValue = 0,sum = 0;
		 for(int i=0;i < A.length;i++){
			 sum += A[i];
			 rotateValue += i * A[i];
		 }
		 
		 int maxValue = rotateValue;
		 
		 for(int i = A.length - 1;i >= 1;i--){
			 rotateValue = rotateValue + (sum - A[i]) - (A.length - 1)*A[n-i];
			 maxValue = maxValue > rotateValue ? maxValue : rotateValue;
		 }
		 
		 return max;
	 }

}
