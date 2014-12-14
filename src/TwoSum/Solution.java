package TwoSum;

public class Solution {
	/**
	 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

	 * @param numbers
	 * @param target
	 * @return
	 */
    public int[] twoSum(int[] numbers, int target) {
         int len = numbers.length;
         int[] re = new int[2];
         if(len < 2){
        	 return null;
         }
         
         int indexA =0, indexB = 0;
         
         for(int i =0;i < len ; i++){
        	 if(numbers[i] <= target){
        		 indexA = i;
        		 int tmp = target - numbers[i];
        		 
//        		 for(int j = i+1;j < len;j++){
//        			 if(numbers[j] == tmp){
//        				 indexB = j;
//        				 re[0] = indexA;
//        				 re[1] = indexB;
//        				 return re;
//        			 }
//        		 }
        		 
        		 if(contains(tmp,i,numbers) > 0){
        			 indexB = contains(tmp,i,numbers);
        			 re[0] = indexA;
        			 re[1] = indexB;
        			 return re;
        		 }
        	 }
         }
         
    	return re;
    }
    
    public int contains(int tmp, int i,int[] numbers){
    	for(int index =i ;index < numbers.length;index++){
    		if(numbers[index] == tmp){
    			return index;
    		}
    	}
    	
    	return -1;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a ={3,2,4};
		Solution s = new Solution();
		int num = 6;
		for(int i=0;i<s.twoSum(a, num).length;i++){
			System.out.println(s.twoSum(a, num)[i]);
		}
		

	}

}
